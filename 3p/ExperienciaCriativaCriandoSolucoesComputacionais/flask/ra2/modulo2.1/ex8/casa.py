from flask import Flask, render_template, request
app= Flask(__name__)

users = {
    'user1': '1234',
    'user2': '1234'
}

@app.route('/validated_user', methods=['POST'])
def validated_user():
    if request.method == 'POST':
        user = request.form['user']
        password = request.form['password']
        print(user, password)
        if user in users and users[user] == password:
            links = {'Quarto': '/quarto', 'Banheiro': '/banheiro', 'Página inicial': '/'}
            return render_template('home.html', links=links)
        else:
            return '<h1>invalid credentials!</h1>'
    else:
        return render_template('login.html')

@app.route('/')
def index():
    return render_template('/login.html')

@app.route('/home')
def home():
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