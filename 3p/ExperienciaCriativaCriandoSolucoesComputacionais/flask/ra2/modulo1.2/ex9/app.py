from flask import Flask, render_template
app= Flask(__name__)

@app.route('/')
def actuators():
    atuadores = {'T1':0, 'T2':1, 'T3':0}
    return render_template("actuators.html", atuadores=atuadores)

if __name__ == "__main__":
    app.run(host='0.0.0.0', port=8080, debug=True)