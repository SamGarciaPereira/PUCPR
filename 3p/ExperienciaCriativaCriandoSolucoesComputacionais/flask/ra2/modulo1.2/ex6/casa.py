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
    sensoresBanheiro = ['Sensor de Umidade', 'Sensor de Temperatura', 'Sensor de Movimento'] 
    return render_template('/banheiro/sensorsBanheiro.html', sensoresBanheiro=sensoresBanheiro)

@app.route('/banheiro/actuators')
def banheiroActuators():
    atuadoresBanheiro = ['Exaustor', 'Aquecedor de água', 'Válvula automática']
    return render_template('/banheiro/actuatorsBanheiro.html', atuadoresBanheiro=atuadoresBanheiro)

@app.route('/quarto/sensors')
def quartoSensors():
    sensoresQuarto = ['Sensor de Presença', 'Sensor de Temperatura', 'Sensor de Luminosidade']
    return render_template('/quarto/sensorsQuarto.html', sensoresQuarto=sensoresQuarto)

@app.route('/quarto/actuators')
def quartoActuators():
    atuadoresQuarto = ['Lâmpada Inteligente', 'Ar Condicionado', 'Cortina Automática']
    return render_template('/quarto/actuatorsQuarto.html', atuadoresQuarto=atuadoresQuarto)
if __name__ == "__main__":
    app.run(host='0.0.0.0', port=8080, debug=True)