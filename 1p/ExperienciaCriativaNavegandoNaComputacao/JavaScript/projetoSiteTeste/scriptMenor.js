const voltar = document.getElementById("voltar");
const btn_amazonia = document.getElementById("btn-amazonia");
const btn_mata = document.getElementById("btn-mata");
const btn_pantanal = document.getElementById("btn-pantanal");
const btn_cerrado = document.getElementById("btn-cerrado");
const btn_caatinga = document.getElementById("btn-caatinga");
const btn_pampa = document.getElementById("btn-pampa");

const btn_fechar_mata= document.getElementById("fechar-modal-mata");
const btn_fechar_amazonia= document.getElementById("fechar-modal-amazonia");
const btn_fechar_pantanal= document.getElementById("fechar-modal-pantanal");
const btn_fechar_cerrado= document.getElementById("fechar-modal-cerrado");
const btn_fechar_caatinga= document.getElementById("fechar-modal-caatinga");
const btn_fechar_pampa= document.getElementById("fechar-modal-pampa");


/* botao voltar index */
voltar.addEventListener("click", function() {
    window.history.back();
})

/* btn modal mata atlantica */
btn_mata.addEventListener("click", function() {
    document.getElementById("modal-mata").style.display = "flex"
})
btn_fechar_mata.addEventListener("click", function(){
     document.getElementById('modal-mata').style.display = "none"
})

/* btn modal amazonia */
btn_amazonia.addEventListener("click", function(){
    document.getElementById("modal-amazonia").style.display = "flex"
})
btn_fechar_amazonia.addEventListener("click", function(){
    document.getElementById("modal-amazonia").style.display = "none"
})

/* btn modal pantanal */
btn_pantanal.addEventListener("click", function() {
    document.getElementById("modal-pantanal").style.display = "flex"
})
btn_fechar_pantanal.addEventListener("click", function(){
    document.getElementById('modal-pantanal').style.display = "none"
})

/* btn modal cerrado */
btn_cerrado.addEventListener("click", function(){
    document.getElementById("modal-cerrado").style.display = "flex"
})
btn_fechar_cerrado.addEventListener("click", function(){
    document.getElementById("modal-cerrado").style.display = "none"
})

/* btn modal caatinga */
btn_caatinga.addEventListener("click", function(){
    document.getElementById("modal-caatinga").style.display = "flex"
})  
btn_fechar_caatinga.addEventListener("click", function(){
    document.getElementById("modal-caatinga").style.display = "none"
}) 

/* btn modal pampa */
btn_pampa.addEventListener("click", function(){
    document.getElementById("modal-pampa").style.display = "flex"
}) 
btn_fechar_pampa.addEventListener("click", function(){
    document.getElementById("modal-pampa").style.display = "none"
}) 

