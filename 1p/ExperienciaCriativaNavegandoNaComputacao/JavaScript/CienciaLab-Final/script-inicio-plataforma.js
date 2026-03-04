const biomas = document.getElementById("biomas");
const ciclo = document.getElementById("ciclo");
const desastres = document.getElementById("desastres");
const exercicios = document.getElementById("exercicios");

biomas.addEventListener("click", function() {
    window.location.href = "biomas.html";
});

ciclo.addEventListener("click", function() {
    window.location.href = "ciclo.html";
});

desastres.addEventListener("click", function() {
    window.location.href = "desastres.html";
});

exercicios.addEventListener("click", function() {
    window.location.href = "exercicios.html";
});

document.getElementById('sair').addEventListener('click', function(event) {
    event.preventDefault();  // Impede o comportamento padrão
    window.location.href = "login.html";  // Redireciona para a nova página
  });

// Função pra colocar filtro escuro
function setDarkBackground(imageUrl) {
    document.body.style.backgroundImage = `linear-gradient(rgba(0, 0, 0, 0.7), rgba(0, 0, 0, 0.7)), url('${imageUrl}')`;
    document.body.style.backgroundSize = "cover";
    document.body.style.backgroundPosition = "center";
}

biomas.addEventListener('mouseenter', () => setDarkBackground('https://i.ibb.co/cx7Pnw2/Screenshot-7.png'));
ciclo.addEventListener('mouseenter', () => setDarkBackground('https://i.ibb.co/vPw0f8h/Screenshot-1.png'));
desastres.addEventListener('mouseenter', () => setDarkBackground('https://i.ibb.co/kgvrcgS/erupcao-do-vulcao-desenhando-vetor-de-estilo-simples-384720-4999-1.jpg'));
exercicios.addEventListener('mouseenter', () => setDarkBackground('https://i.ibb.co/x5Kggkk/Screenshot-8.png'));

// Evento que volta pro botão normal
function resetBackground() {
    document.body.style.backgroundImage = "none";
}

biomas.addEventListener('mouseleave', resetBackground);
ciclo.addEventListener('mouseleave', resetBackground);
desastres.addEventListener('mouseleave', resetBackground);
exercicios.addEventListener('mouseleave', resetBackground);
