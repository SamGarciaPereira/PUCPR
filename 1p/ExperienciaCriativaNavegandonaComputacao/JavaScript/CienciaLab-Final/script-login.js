document.getElementById("btn-esqSenha").addEventListener("click", function() {
    document.getElementById("modal-recuperacao").style.display = "flex";
});

document.getElementById("btn-ajuda").addEventListener("click", function() {
    document.getElementById("modo-ajuda").style.display = "flex";
});

document.getElementById('btn-entrar').addEventListener('click', function(event) {
    event.preventDefault();
    
    const usuario = document.querySelector('.usuario').value;
    const senha = document.querySelector('.senha').value;
    
    const usuarioCorreto = "abilio.pedro@ciencialab.com.br";
    const senhaCorreta = "senha123";
    
    if (usuario === usuarioCorreto && senha === senhaCorreta) {
        window.location.href = "inicio-plataforma.html";
    } else {
        alert("Credenciais incorretas. Por favor, tente novamente.");
    }
});

  document.getElementById('btn-conf-senha').addEventListener('click', function(event) {
    event.preventDefault();
    window.location.href = "inicio-plataforma.html";
  });

/* Alteração do texto do modo ajuda */

document.getElementById("btn-1-ajuda").addEventListener("click", function() {
    document.getElementById("demo-modo-ajuda").innerHTML = `
    Não se preocupe. Vamos te ajudar com isso!
    <br><br>
    Para recuperar sua senha, é bem simples:
    <br><br>
    Na área do login, clique no botão "Recuperar senha".
    Digite o email cadastrado ou o seu nome de usuário e
    clique em "Enviar código".
    <br><br>
    Aguarde o envio do código de seis dígitos no e-mail vinculado
    a conta.
    <br><br>
    Logo em seguida, insira o código no campo e clique em "Continuar".
    <br><br>
    Pronto, você poderá redefinir a sua senha e acessar a plataforma.
    `;
    document.querySelector(".orientacao").style.backgroundColor = "#f0f0f0";
});
document.getElementById("btn-2-ajuda").addEventListener("click", function() {
    document.getElementById("demo-modo-ajuda").innerHTML = `
    Você pode logar em um segundo dispositivo, no entanto o login anterior será automaticamente desconectado.
    `;
    document.querySelector(".orientacao").style.backgroundColor = "#f0f0f0";
});
document.getElementById("btn-3-ajuda").addEventListener("click", function() {
    document.getElementById("demo-modo-ajuda").innerHTML = `
    Existem várias possíveis razões para isso estar acontecendo, como:
    <br><br>
    • Erro de digitação no e-mail cadastrado, incluindo letras maiúsculas;<br>
    • E-mail inserido não corresponde ao cadastrado;<br>
    • Senha incorreta;<br>
    • Problema na plataforma.
    <br><br>
    Verifique se o e-mail inserido corresponde ao cadastrado e se a senha está correta. 
    Se o problema persistir, uma opção é redefinir a senha.
    Caso o e-mail de redefinição não chegue à sua caixa de entrada ou caixa de SPAM, entre em contato com nossa equipe
    (contato@ciencialab.com.br) para que possamos identificar e resolver o problema para você.
    <br><br>
    Não se preocupe, durante nosso horário de atendimento (09h às 18h), responderemos sua solicitação em minutos.
    `;
    document.querySelector(".orientacao").style.backgroundColor = "#f0f0f0";
});
document.getElementById("btn-4-ajuda").addEventListener("click", function() {
    document.getElementById("demo-modo-ajuda").innerHTML = `
    Para alterar os dados (exceto e-mail e CPF) dentro da plataforma, acesse a opção "Editar perfil", no canto superior direito.
    <br><br>
    Para alterar o <b>e-mail</b>, será necessário enviar alguns dados para a nossa equipe! São eles: o seu e-mail antigo, novo e-mail, nome completo e CPF. 
    Tudo isso pode ser enviado para o endereço contato@ciencialab.com.br
    <br><br>
    Quanto ao <b>CPF</b>, não realizamos a troca.
    <br><br>
    Caso sua conta seja vinculada a uma entidade educacional, entre em contato com a secretaria para realizar mudanças no cadastro.
    `;
    document.querySelector(".orientacao").style.backgroundColor = "#f0f0f0";
});

/* Continuação da interação entre os botões */

document.querySelector(".btn-voltar-modo-ajuda").addEventListener("click", function() {
    document.getElementById("modo-ajuda").style.display = "none";
});

document.getElementById("btn-voltarSenha").addEventListener("click", function() {
    document.getElementById("modal-recuperacao").style.display = "none";
});

document.getElementById("btn-voltarCodigo").addEventListener("click", function() {
    document.getElementById("modal-codigo").style.display = "none";
    document.getElementById("modal-recuperacao").style.display = "flex";
});

document.querySelector(".btn-envCodigo").addEventListener("click", function() {
    document.getElementById("modal-recuperacao").style.display = "none";
    document.getElementById("modal-codigo").style.display = "flex";
});

document.querySelector(".btn-contCodigo").addEventListener("click", function() {
    document.getElementById("modal-codigo").style.display = "none";
    document.getElementById("redefinir-senha").style.display = "flex";
});
