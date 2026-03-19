// NAVEGAÇÃO ENTRE AS PÁGINAS DE BIOMAS
const voltar_ciclo = document.getElementById("voltar"); // Corrigido para 'voltar'
voltar_ciclo.addEventListener("click", function() {
    window.history.back();
});

// Exibir e fechar modais
document.getElementById("btn-mata").addEventListener("click", function() {
    document.getElementById("modal-mata").style.display = "flex";
});
document.getElementById("fechar-modal-mata").addEventListener("click", function() {
    document.getElementById("modal-mata").style.display = "none";
});

document.getElementById("btn-amazonia").addEventListener("click", function() {
    document.getElementById("modal-amazonia").style.display = "flex";
});
document.getElementById("fechar-modal-ama").addEventListener("click", function() {
    document.getElementById("modal-amazonia").style.display = "none";
});

document.getElementById("btn-pantanal").addEventListener("click", function() {
    document.getElementById("modal-pantanal").style.display = "flex";
});
document.getElementById("fechar-modal-pan").addEventListener("click", function() {
    document.getElementById("modal-pantanal").style.display = "none";
});

document.getElementById("btn-cerrado").addEventListener("click", function() {
    document.getElementById("modal-cerrado").style.display = "flex";
});
document.getElementById("fechar-modal-cer").addEventListener("click", function() {
    document.getElementById("modal-cerrado").style.display = "none";
});

document.getElementById("btn-caatinga").addEventListener("click", function() {
    document.getElementById("modal-caatinga").style.display = "flex";
});
document.getElementById("fechar-modal-caa").addEventListener("click", function() {
    document.getElementById("modal-caatinga").style.display = "none";
});

document.getElementById("btn-pampa").addEventListener("click", function() {
    document.getElementById("modal-pampa").style.display = "flex";
});
document.getElementById("fechar-modal-pam").addEventListener("click", function() {
    document.getElementById("modal-pampa").style.display = "none";
});
