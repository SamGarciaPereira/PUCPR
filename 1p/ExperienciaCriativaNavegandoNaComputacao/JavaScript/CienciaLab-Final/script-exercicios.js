const voltarMenu = document.getElementById("voltar-ciclo");

voltarMenu.addEventListener("click", function() {
    window.location.href = "inicio-plataforma.html";
});

document.addEventListener("DOMContentLoaded", function () {
    const questoes = document.querySelectorAll(".area-questao");
    let questaoAtual = 0;
    const btnVoltar = document.getElementById("btn-voltar");
    const btnProximo = document.getElementById("btn-proximo");

    // Função para mostrar ou esconder os botões "Voltar" e "Próximo"
    function atualizarBotoes() {
        if (questaoAtual === 0) {
            btnVoltar.style.display = "none";  // Esconde o botão Voltar na primeira questão
        } else {
            btnVoltar.style.display = "block";  // Mostra o botão Voltar nas outras questões
        }

        if (questaoAtual === questoes.length - 1) {
            btnProximo.style.display = "none";  // Esconde o botão Próximo na última questão
        } else {
            btnProximo.style.display = "block";  // Mostra o botão Próximo nas outras questões
        }
    }

    // Exibe a questão atual e oculta as demais
    function mostrarQuestao(index) {
        questoes.forEach((questao, i) => {
            questao.style.display = i === index ? "flex" : "none";
        });
        atualizarBotoes();  // Atualiza a visibilidade dos botões
    }

    // Exibe a primeira questão ao carregar a página
    mostrarQuestao(questaoAtual);

    // Botão "Próximo" para mostrar a próxima questão
    document.getElementById("btn-proximo").addEventListener("click", function () {
        if (questaoAtual < questoes.length - 1) {
            questaoAtual++;
            mostrarQuestao(questaoAtual);
        }
    });

    // Botão "Voltar" para mostrar a questão anterior
    document.getElementById("btn-voltar").addEventListener("click", function () {
        if (questaoAtual > 0) {
            questaoAtual--;
            mostrarQuestao(questaoAtual);
        }
    });
});

document.addEventListener('DOMContentLoaded', function () {
    const botoesCertas = document.querySelectorAll('.alternativas-certas');
    const botoesErradas = document.querySelectorAll('.alternativas');

    // Função para resetar os estilos dos botões
    function resetarBotoes() {
        const todosBotoes = document.querySelectorAll('.alternativas, .alternativas-certas');
        todosBotoes.forEach(botao => {
            botao.style.backgroundColor = '';
            botao.style.color = '';
        });
    }

    botoesCertas.forEach(botao => {
        botao.addEventListener('click', function () {
            resetarBotoes();
            botao.style.backgroundColor = '#4CAF50';
            botao.style.color = 'white';

            alert("Parabéns! Você acertou!");
        });
    });

    botoesErradas.forEach(botao => {
        botao.addEventListener('click', function () {
            resetarBotoes();
            botao.style.backgroundColor = '#f44336';
            botao.style.color = 'white';
        });
    });
});
