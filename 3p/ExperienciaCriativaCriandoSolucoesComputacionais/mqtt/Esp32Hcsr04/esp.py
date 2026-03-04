from hcsr04 import HCSR04
from machine import Pin
import time
import network
from umqtt.simple import MQTTClient

last_msg = None 

sensor = HCSR04(trigger_pin=5, echo_pin=18, echo_timeout_us=10000)
led = Pin(2, Pin.OUT)
buzzer_pin = Pin(4, Pin.OUT)

MQTT_CLIENT_ID = "esp32_samuel_20082025"
MQTT_BROKER = "broker.mqttdashboard.com"
MQTT_TOPIC_SEND = "exp.criativas/samuel/pcparaesp"
MQTT_TOPIC_RECEIVE = "exp.criativas/samuel/espparapc"

WIFI_SSID = "Visitantes"
WIFI_PASSWORD = ""

def callback(topic, msg):
    global last_msg
    last_msg = msg.decode()
    print("[CLIENT] Mensagem recebida: ", last_msg)
    # client.publish(MQTT_TOPIC_RECEIVE, "ok")

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

distance_1 = sensor.distance_cm()
print(f"Distância 1: {distance_1:.2f} cm")

while True:
    distance_2 = sensor.distance_cm()
    print(f"Distância 2: {distance_2:.2f} cm")
        
    if abs(distance_2 - distance_1) >= 20:
        print("[ESP] Alteração na posição")
        client.publish(MQTT_TOPIC_SEND, "Mudou a posicao")
        
        start_time = time.time()
        while time.time() - start_time < 3:
            client.check_msg()
            
        if last_msg == "STOP":
            print("[ESP] Parando a execução...")
            led.value(1);
            time.sleep(0.5);
            led.value(0);
            
            buzzer_pin.value(1)
            time.sleep(0.1);
            buzzer_pin.value(0)
            time.sleep(0.1)
            break
        
    time.sleep(2)
    
print("[ESP] Fim da execução")
