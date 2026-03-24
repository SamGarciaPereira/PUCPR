from machine import Pin, PWM
import time
from umqtt.simple import MQTTClient
from servo import Servo
import network

last_msg = None
button = Pin(5, Pin.IN, Pin.PULL_UP)
motor = Servo(pin=4)

MQTT_CLIENT_ID = "esp32_samuel_20082025"
MQTT_BROKER = "broker.mqttdashboard.com"
MQTT_TOPIC_SEND = "exp.criativas/samuel/pcparaesp"
MQTT_TOPIC_RECEIVE = "exp.criativas/samuel/espparapc"

WIFI_SSID = "Visitantes"
WIFI_PASSWORD = ""

def callback(topic, msg):
    global last_msg
    last_msg = msg.decode()
    print("[ESP] Mensagem recebida:", last_msg)

wifi = network.WLAN(network.STA_IF)
wifi.active(True)
wifi.connect(WIFI_SSID, WIFI_PASSWORD)
print("Conectando à rede Wi-Fi...")
while not wifi.isconnected():
    pass
print("Conectado à rede Wi-Fi:", WIFI_SSID)

client = MQTTClient(MQTT_CLIENT_ID, MQTT_BROKER)
client.set_callback(callback)
client.connect()
client.subscribe(MQTT_TOPIC_RECEIVE)

print("[ESP] Aperte o botão.")

while True:
    if button.value() == 0:
        motor.move(0)
        print("[ESP] Perguntando hora ao servidor.")
        client.publish(MQTT_TOPIC_SEND, "que horas sao")
        
        start_time = time.time()
        while time.time() - start_time < 5:
            client.check_msg()
            if last_msg:
                h, m = map(int, last_msg.split(':'))
                
                print("[ESP] Hora:", h, "Minuto:", m)
                
                print("[Servo] Ajustando motor pra", h, "(hora) x 7")
                ang_h = h * 7
                motor.move(ang_h)
                time.sleep(5)
                
                print("[Servo] Ajustando motor pra", m, "(minuto) x 3")
                ang_m = m * 3
                motor.move(ang_m)
                time.sleep(5)
                
                motor.move(0)
                print("[ESP] Aperte o botão")
                
                last_msg = None
                break
        
        time.sleep(0.5)