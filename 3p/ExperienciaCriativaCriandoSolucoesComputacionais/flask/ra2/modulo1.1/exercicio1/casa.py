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
    return render_template('/banheiro/sensorsBanheiro.html')

@app.route('/banheiro/actuators')
def banheiroActuators():
    return render_template('/banheiro/actuatorsBanheiro.html')

@app.route('/quarto/sensors')
def quartoSensors():
    return render_template('/quarto/sensorsQuarto.html')

@app.route('/quarto/actuators')
def quartoActuators():
    return render_template('/quarto/actuatorsQuarto.html')
if __name__ == "__main__":
    app.run(host='0.0.0.0', port=8080, debug=True)