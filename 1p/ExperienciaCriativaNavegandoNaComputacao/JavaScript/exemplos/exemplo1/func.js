function som() {
    var a = parseFloat(document.getElementById("valor1").value);
    var b = parseFloat(document.getElementById("valor2").value);
    alert(a+b);
}
function sub() {
    var a = parseFloat(document.getElementById("valor3").value);
    var b = parseFloat(document.getElementById("valor4").value);
    alert(a-b);
}
function mul() {
    var a = parseFloat(document.getElementById("valor5").value);
    var b = parseFloat(document.getElementById("valor6").value);
    alert(a*b);
}
function div() {
    var a = parseFloat(document.getElementById("valor7").value);
    var b = parseFloat(document.getElementById("valor8").value);
    if (b == 0){
        alert("Não pode.");
    }
    else {
        alert(a/b);
    }
}