from machine import Pin, time_pulse_us
import time

pino_trig = Pin(5, Pin.OUT)
pino_echo = Pin(18, Pin.IN)

VELOCIDADE_SOM = 0.0343

def medir_distancia():
    pino_trig.value(0)
    time.sleep_us(2)
    
    pino_trig.value(1)
    time.sleep_us(10)
    pino_trig.value(0)
    
    try:
        duracao_us = time_pulse_us(pino_echo, 1, 30000)
    except OSError as ex:
        return -1

    distancia_cm = (duracao_us * VELOCIDADE_SOM) / 2
    
    return distancia_cm

try:
    while True:
        distancia = medir_distancia()
        
        if distancia > 0:
            print(f"Distância: {distancia:.2f} cm")
        else:
            print("Fora de alcance ou erro na leitura.")
            
        time.sleep(5)

except KeyboardInterrupt:
    print("Programa interrompido.")