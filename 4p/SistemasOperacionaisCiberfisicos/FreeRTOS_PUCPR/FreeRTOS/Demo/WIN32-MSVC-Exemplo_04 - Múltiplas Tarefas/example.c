
/*
* 1. Com apoio ao material fornecido responda:

    a. Descreva o uso da função xTaskCreate(), para que é
    utilizada essa função? Quais os parâmetros da função e
    para que são utilizados?
        R: Essa função é utilizada para criar uma nova tarefa (task) e adicioná-la à lista de tarefas prontas para execução.
        No FreeRTOS, uma tarefa é uma função C que nunca deve retornar e contém um loop infinito.

        Parâmetros: 
        xTaskCreate( pvTaskCode, pcName, usStackDepth, pvParameters, uxPriority, pxCreatedTask );
        pvTaskCode: É o ponteiro para a função C que contém o código que a tarefa executará.
        pcName: É uma string de texto usada apenas para identificar a tarefa em ferramentas de depuração.
        usStackDepth: Define a quantidade de memória reservada para a pilha da tarefa.
        pvParameters: É um ponteiro que permite passar dados ou estruturas para dentro da tarefa ao iniciá-la.
        uxPriority: Define o nível de urgência da execução, onde números maiores indicam maior prioridade.
        pxCreatedTask: É uma referência (handle) que permite controlar ou deletar a tarefa em outras partes do código.

    b. Descreva para que são utilizadas as funções
    xTaskDelay() e vTaskDelete()?
        R: xTaskDelay(): É utilizada para colocar a tarefa atual no estado Blocked (bloqueado) por um período específico de tempo.
           vTaskDelete(): É utilizada para encerrar e remover uma tarefa do gerenciamento do RTOS.


    c. O que faz a função xTaskStartScheduler()?
        R: Inicia o Escalonador (Scheduler) do FreeRTOS.
*/

#include <stdlib.h> 
#include "FreeRTOS.h"
#include "task.h"
#include "basic_io.h"

/* Protótipos das funções das tarefas (Especificação b) */
void vTaskBatimentos(void* pvParameters);
void vTaskSaturacao(void* pvParameters);
void vTaskTemperatura(void* pvParameters);


//TAREFA 1: Monitoramento de Batimentos Cardíacos
void vTaskBatimentos(void* pvParameters)
{
    // g. Convertendo o parâmetro recebido de volta para string
    char* pcNomeDado = (char*)pvParameters;
    int bpm;

    for (;;)
    {
        // d, e. Gerando batimentos aleatórios entre 20 e 140
        // Lógica: min + (rand() % (max - min + 1))
        bpm = 20 + (rand() % 121);

        // h. Imprimindo no console usando a string passada como parâmetro
        vPrintStringAndNumber(pcNomeDado, bpm);

        // i. Verificando alterações e gerando alertas
        if (bpm < 50)
        {
            vPrintString("ALERTA: Batimento cardiaco BAIXO!\n"); 
        }
        else if (bpm > 90)
        {
            vPrintString("ALERTA: Batimento cardiaco ALTO!\n");
        }

        // j. Atraso de 1 segundo 
        vTaskDelay(1000 / portTICK_PERIOD_MS);
    }

    // k. Exclusão explícita da tarefa 
    vTaskDelete(NULL);
}


 //TAREFA 2: Monitoramento de Saturação de Oxigênio (SpO2)
 
void vTaskSaturacao(void* pvParameters)
{
    // g. Convertendo o parâmetro recebido
    char* pcNomeDado = (char*)pvParameters;
    int spo2;

    for (;;)
    {
        // d, e. Gerando saturação aleatória entre 80 e 100
        spo2 = 80 + (rand() % 21);

        // h. Imprimindo a saturação
        vPrintStringAndNumber(pcNomeDado, spo2);

        // i. Verificando alterações e gerando alertas
        if (spo2 < 90)
        {
            vPrintString("ALERTA: Saturacao BAIXA!\n");
        }

        // j. Atraso de 1 segundo
        vTaskDelay(1000 / portTICK_PERIOD_MS);
    }

    // k. Exclusão explícita
    vTaskDelete(NULL);
}


 //TAREFA 3: Monitoramento de Temperatura
 
void vTaskTemperatura(void* pvParameters)
{
    // g. Convertendo o parâmetro recebido
    char* pcNomeDado = (char*)pvParameters;
    int temp_escala; // Usado para trabalhar com uma casa decimal(x10)

    for (;;)
    {
        // d, e. Gerando temperatura aleatória entre 340 e 410 (Representa 34.0 a 41.0)
        temp_escala = 340 + (rand() % 71);

        // h. Imprimindo a temperatura em escala x10
        vPrintStringAndNumber(pcNomeDado, temp_escala);

        // i. Verificando alterações (350 representa 35.0, 375 representa 37.5)
        if (temp_escala < 350)
        {
            vPrintString("ALERTA: Hipotermia!\n");
        }
        else if (temp_escala > 375)
        {
            vPrintString("ALERTA: Febre!\n");
        }

        // j. Atraso de 1 segundo
        vTaskDelay(1000 / portTICK_PERIOD_MS);
    }

    // k. Exclusão explícita
    vTaskDelete(NULL);
}


//FUNÇÃO PRINCIPAL
 
int main_(void)
{
    // c, f. Criação das três tarefas no main_ com a mesma prioridade (nível 1)
    // g. Passagem dos parâmetros de string ("Batimentos:", " Saturação:", "Temperatura:")

    xTaskCreate(vTaskBatimentos, "Task BPM", 1000, (void*)"Batimentos: ", 1, NULL);
    xTaskCreate(vTaskSaturacao, "Task SpO2", 1000, (void*)"Saturacao: ", 1, NULL);
    xTaskCreate(vTaskTemperatura, "Task Temp", 1000, (void*)"Temperatura(x10): ", 1, NULL);

    // Inicia o escalonador do FreeRTOS
    vTaskStartScheduler();

    // Loop infinito caso falte memória RAM para iniciar o RTOS
    for (;; );

    return 0;
}
