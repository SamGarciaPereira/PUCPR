// NAVEGAÇÃO ENTRE AS PÁGINAS DE CICLO DA ÁGUA

const voltar_ciclo = document.getElementById("voltar-ciclo");
voltar_ciclo.addEventListener("click", function() {
    window.history.back();
})

//

document.getElementById("btn-precipitacao").addEventListener("click", function() {
    document.getElementById("modal-precipitacao").style.display = "flex";
});
document.getElementById("fechar-modal-pre").addEventListener("click", function() {
    document.getElementById("modal-precipitacao").style.display = "none";
});

//

document.getElementById("btn-infiltracao").addEventListener("click", function() {
    document.getElementById("modal-infiltracao").style.display = "flex";
});
document.getElementById("fechar-modal-inf").addEventListener("click", function() {
    document.getElementById("modal-infiltracao").style.display = "none";
});

//

document.getElementById("btn-condensacao").addEventListener("click", function() {
    document.getElementById("modal-condensacao").style.display = "flex";
});
document.getElementById("fechar-modal-con").addEventListener("click", function() {
    document.getElementById("modal-condensacao").style.display = "none";
});

//

document.getElementById("btn-transpiracao").addEventListener("click", function() {
    document.getElementById("modal-transpiracao").style.display = "flex";
});
document.getElementById("fechar-modal-tra").addEventListener("click", function() {
    document.getElementById("modal-transpiracao").style.display = "none";
});

//

document.getElementById("btn-vaporizacao").addEventListener("click", function() {
    document.getElementById("modal-vaporizacao").style.display = "flex";
});
document.getElementById("fechar-modal-vap").addEventListener("click", function() {
    document.getElementById("modal-vaporizacao").style.display = "none";
});

//

document.getElementById("btn-aula-ciclo").addEventListener("click", function() {
    document.getElementById("modal-aula-ciclo").style.display = "flex";
});
document.getElementById("fechar-modal-aula-ciclo").addEventListener("click", function() {
    document.getElementById("modal-aula-ciclo").style.display = "none";
});