from flask import Blueprint, request, render_template

login = Blueprint("login", __name__, template_folder="templates")

users = {"user1": "1234", "user2": "12345"}


@login.route("/validated_user", methods=["POST"])
def validated_user():
    user = request.form.get("user", "")
    password = request.form.get("password", "")
    print(user, password)
    if user in users and users[user] == password:
        return render_template("home.html")
    return "<h1>invalid credentials!</h1>"


@login.route("/list_users")
def list_users():
    return render_template("users.html", devices=users)


@login.route("/register_user")
def register_user():
    return render_template("register_user.html")


@login.route("/add_user", methods=["GET", "POST"])
def add_user():
    if request.method == "POST":
        user = request.form.get("user")
        password = request.form.get("password")
    else:
        user = request.args.get("user")
        password = request.args.get("password")
    if user:
        users[user] = password
    return render_template("users.html", users=users)


@login.route("/remove_user")
def remove_user():
    return render_template("remove_user.html", users=users)


@login.route("/del_user", methods=["GET", "POST"])
def del_user():
    if request.method == "POST":
        user = request.form.get("user")
    else:
        user = request.args.get("user")
    if user:
        users.pop(user, None)
    return render_template("users.html", users=users)
