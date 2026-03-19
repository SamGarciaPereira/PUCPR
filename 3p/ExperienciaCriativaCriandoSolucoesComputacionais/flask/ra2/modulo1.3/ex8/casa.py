from flask import Flask, render_template
app= Flask(__name__)

@app.route('/')
def index():
    return render_template('/index.html')

@app.route('/quarto')
def quarto():
    return render_template('/quarto/quarto.html')

@app.route('/banheiro')
def banheiro():
    return render_template('/banheiro/banheiro.html')

@app.route('/banheiro/sensors')
def banheiroSensors():
    sensoresBanheiro = {'Sensor de Umidade': '45%' , 'Sensor de Temperatura': '20°C', 'Sensor de Movimento: ': 'Ativo'}
    return render_template('/banheiro/sensorsBanheiro.html', sensoresBanheiro=sensoresBanheiro)

@app.route('/banheiro/actuators')
def banheiroActuators():
    atuadoresBanheiro = {'Exaustor': 'Ativo', 'Aquecedor de água': '40°C', 'Válvula automática': 'Em pausa'}
    return render_template('/banheiro/actuatorsBanheiro.html', atuadoresBanheiro=atuadoresBanheiro)

@app.route('/quarto/sensors')
def quartoSensors():
    sensoresQuarto = {'Sensor de Presença': 'Aguardando ativação', 'Sensor de Temperatura': '20°C', 'Sensor de Luminosidade': '300 lux'}
    return render_template('/quarto/sensorsQuarto.html', sensoresQuarto=sensoresQuarto)

@app.route('/quarto/actuators')
def quartoActuators():
    atuadoresQuarto = {'Lâmpada Inteligente': 'Ativo', 'Ar Condicionado': '10°C', 'Cortina Automática': 'Fechada'}
    return render_template('/quarto/actuatorsQuarto.html', atuadoresQuarto=atuadoresQuarto)

if __name__ == "__main__":
    app.run(host='0.0.0.0', port=8080, debug=True)