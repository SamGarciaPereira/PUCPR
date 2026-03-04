from flask import Blueprint, request, render_template

actuators_bp = Blueprint("actuators", __name__, template_folder="templates")

actuators = {}

@actuators_bp.route("/list_actuators")
def list_actuators():
    return render_template("actuators.html", devices=actuators)

@actuators_bp.route("/register_actuator")
def register_actuator():
    return render_template("register_actuator.html")

@actuators_bp.route("/add_actuator", methods=["GET", "POST"])
def add_actuator():
    if request.method == "POST":
        actuator = request.form.get("actuator")
        tipo = request.form.get("tipo")
    else:
        actuator = request.args.get("actuator")
        tipo = request.args.get("tipo")
    if actuator:
        actuators[actuator] = tipo
    return render_template("actuators.html", devices=actuators)

@actuators_bp.route("/remove_actuator")
def remove_actuator():
    return render_template("remove_actuator.html", devices=actuators)

@actuators_bp.route("/del_actuator", methods=["GET", "POST"])
def del_actuator():
    if request.method == "POST":
        actuator = request.form.get("actuator")
    else:
        actuator = request.args.get("actuator")
    if actuator:
        actuators.pop(actuator, None)
    return render_template("actuators.html", devices=actuators)