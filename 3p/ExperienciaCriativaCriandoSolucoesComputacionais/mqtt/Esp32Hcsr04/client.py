import paho.mqtt.client as mqtt
import time

# Configuração MQTT
MQTT_BROKER = "broker.mqttdashboard.com"
MQTT_TOPIC_SEND = "exp.criativas/samuel/espparapc"
MQTT_TOPIC_RECEIVE = "exp.criativas/samuel/pcparaesp"

# Callback executado quando uma mensagem MQTT é recebida
def on_message(client, userdata, message):
    print("Frase recebida: ", message.payload.decode())
    client.publish(MQTT_TOPIC_SEND, "STOP") # Envia resposta

# Configuração do cliente MQTT2
client = mqtt.Client("pc_samuel_20082025")
client.on_message = on_message

# Conexão ao broker MQTT e subscrição aos tópicos
client.connect(MQTT_BROKER)
client.subscribe(MQTT_TOPIC_RECEIVE)

print("Conectou, aguardando mensagens...")
while True:
    client.loop(timeout=0.1)