from flask import Flask, render_template
app= Flask(__name__)

@app.route('/')
def index():
    links = {'Quarto': '/quarto', 'Banheiro': '/banheiro', 'Página inicial': '/'}
    return render_template('/index.html' , links=links)

@app.route('/quarto')
def quarto():
    linksQuarto = {'Sensores do Quarto': '/quarto/sensors', 'Atuadores do Quarto': '/quarto/actuators'}
    return render_template('/quarto/quarto.html' ,)

@app.route('/banheiro')
def banheiro():
    linksBanheiro = {'Sensores do Banheiro': '/banheiro/sensors', 'Atuadores do Banheiro': '/banheiro/actuators'}
    return render_template('/banheiro/banheiro.html' , linksBanheiro=linksBanheiro)

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