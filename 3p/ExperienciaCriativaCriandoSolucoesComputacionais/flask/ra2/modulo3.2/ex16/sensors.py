from flask import Blueprint, request, render_template

sensors_bp = Blueprint("sensors", __name__, template_folder="templates")

sensors = {}

@sensors_bp.route("/list_sensors")
def list_sensors():
    return render_template("sensors.html", devices=sensors)

@sensors_bp.route("/register_sensor")
def register_sensor():
    return render_template("register_sensor.html")

@sensors_bp.route("/add_sensor", methods=["GET", "POST"])
def add_sensor():
    if request.method == "POST":
        sensor = request.form.get("sensor")
        tipo = request.form.get("tipo")
    else:
        sensor = request.args.get("sensor")
        tipo = request.args.get("tipo")
    if sensor:
        sensors[sensor] = tipo
    return render_template("sensors.html", devices=sensors)

@sensors_bp.route("/remove_sensor")
def remove_sensor():
    return render_template("remove_sensor.html", devices=sensors)

@sensors_bp.route("/del_sensor", methods=["GET", "POST"])
def del_sensor():
    if request.method == "POST":
        sensor = request.form.get("sensor")
    else:
        sensor = request.args.get("sensor")
    if sensor:
        sensors.pop(sensor, None)
    return render_template("sensors.html", devices=sensors)