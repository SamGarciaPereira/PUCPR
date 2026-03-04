document.getElementById('feedback-nav').addEventListener('click', function(event) {
  event.preventDefault(); 
  document.getElementById('referencia-scroll').scrollIntoView({
    behavior: 'smooth'
  });
});

document.getElementById('entrar-nav').addEventListener('click', function(event) {
  event.preventDefault();  // Impede o comportamento padrão
  window.location.href = "login.html";  // Redireciona para a nova página
});

document.getElementById('creditos-nav').addEventListener('click', function(event) {
  event.preventDefault();
  window.location.href = "referencias.html";  
});


