// NAVEGAÇÃO ENTRE AS PÁGINAS NAS REFERÊNCIAS

document.getElementById('voltar').addEventListener('click', function(event) {
    event.preventDefault();  // Impede o comportamento padrão
    window.location.href = "landing-page.html";  // Redireciona para a nova página
  });