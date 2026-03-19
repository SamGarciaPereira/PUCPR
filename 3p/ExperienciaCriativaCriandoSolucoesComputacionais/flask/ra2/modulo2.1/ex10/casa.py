from flask import Flask, render_template, request
app= Flask(__name__)

users = {
    'user1': '1234',
    'user2': '1234'
}

sensors = {}

actuators = {}

@app.route('/validated_user', methods=['POST'])
def validated_user():
    if request.method == 'POST':
        user = request.form.get('user')
        password = request.form.get('password')
        print(user, password)
        if user in users and users[user] == password:
            links = {'Quarto': '/quarto', 'Banheiro': '/banheiro', 'Página inicial': '/'}
            return render_template('home.html', links=links)
        else:
            return '<h1>invalid credentials!</h1>'
    else:
        return render_template('login.html')
    
@app.route('/register_user')
def register_user():
    return render_template("register_user.html")

@app.route('/add_user', methods=['GET','POST'])
def add_user():
    global users
    if request.method == 'POST':
        user = request.form['user']
        password = request.form['password']
        users[user] = password
        return render_template("users.html", devices=users)
    else:
        user = request.args.get('user', None)
        password = request.args.get('password', None)
        if user and password:
            users[user] = password
        return render_template("users.html", devices=users)
    
@app.route('/list_users')
def list_users():
    global users
    return render_template("users.html", devices=users)

    
@app.route('/register_sensor')
def register_sensor():
    return render_template("register_sensor.html")

@app.route('/add_sensor', methods=['GET', 'POST'])
def add_sensor():
    global sensors
    if request.method == 'POST':
        sensor = request.form['sensor']
        tipo = request.form['tipo']
        sensors[sensor] = tipo
        return render_template("sensors.html", devices=sensors)
    else:
        sensor = request.args.get('sensor', None)
        tipo = request.args.get('tipo', None)
        if sensor and tipo:
            sensors[sensor] = tipo
        return render_template("sensors.html", devices=sensors)
    
@app.route('/list_sensors')
def list_sensors():
    global sensors
    return render_template("sensors.html", devices=sensors)

@app.route('/register_actuator')
def register_actuators():
    return render_template("register_actuator.html")

@app.route('/add_actuator', methods=['GET', 'POST'])
def add_actuator():
    global actuators
    if request.method == 'POST':
        actuator = request.form['actuator']
        tipo = request.form['tipo']
        actuators[actuator] = tipo
        return render_template("actuators.html", devices=actuators)
    else:
        actuator = request.args.get('actuator', None)
        tipo = request.args.get('tipo', None)
        if actuator and tipo:
            actuators[actuator] = tipo
        return render_template("actuators.html", devices=actuators)
    
@app.route('/list_actuators')
def list_actuators():
    global actuators
    return render_template("actuators.html", devices=actuators)
    
@app.route('/')
def index():
    return render_template('/login.html')

@app.route('/home')
def home():
    links = {'Quarto': '/quarto', 'Banheiro': '/banheiro', 'Página inicial': '/'}
    return render_template('/index.html' , links=links)

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

@app.route('/remove_user')
def remove_user():
    global users
    user = request.args.get('user')
    if user and user in users:
        del users[user]
    return render_template("users.html", devices=users)

@app.route('/remove_sensor')
def remove_sensor():
    global sensors
    sensor = request.args.get('sensor')
    if sensor and sensor in sensors:
        del sensors[sensor]
    return render_template("sensors.html", devices=sensors)

@app.route('/remove_actuator')
def remove_actuator():
    global actuators
    actuator = request.args.get('actuator')
    if actuator and actuator in actuators:
        del actuators[actuator]
    return render_template("actuators.html", devices=actuators)

if __name__ == "__main__":
    app.run(host='0.0.0.0', port=8080, debug=True)