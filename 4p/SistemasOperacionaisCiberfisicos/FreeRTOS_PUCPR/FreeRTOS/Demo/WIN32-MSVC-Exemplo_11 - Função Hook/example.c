/*
 * Nome dos alunos: Abílio Pedro Alcantara Mota Batista, Beatriz Ceciliato Robaskievicz da Cunha, Samuel Garcia Pereira
 * Curso: Ciência da Computação
 * Disciplina: Sistemas Operacionais Ciberfísicos
 * Professor: Jhonatan Geremias
 * Projeto FreeRTOS - Fase 1
 */

#include <stdio.h>
#include "FreeRTOS.h"
#include "task.h"

 /* Variáveis Globais  */
int motor0 = 0;
int motor1 = 0;
int motor2 = 0;
int motor3 = 0;

/* Enumeração para Parâmetros das Manobras */
typedef enum {
    HORARIO, ANTI_HORARIO, // Guinada
    FRENTE, TRAS,          // Arfagem
    DIREITA, ESQUERDA      // Rolagem
} AcaoManobra;

/* * Função de Hook do Idle. Necessária porque o FreeRTOSConfig.h do projeto base exige esta função. */
void vApplicationIdleHook(void) {
    
}

extern void vPrintString(const char* pcString);

/* GUINADA - Período: 10ms (100Hz) */
void vTaskGuinada(void* pvParameters) {
    AcaoManobra acao = (AcaoManobra)pvParameters;

    for (;;) {
        if (acao == HORARIO) {
            // Horário: aumentar 0 e 2, diminuir 1 e 3 
            motor0 += 100; motor2 += 100;
            motor1 -= 100; motor3 -= 100;
            vPrintString("Manobra: Guinada | Acao: Sentido Horario\n");
        }
        else {
            // Anti-horário: diminuir 0 e 2, aumentar 1 e 3 
            motor0 -= 100; motor2 -= 100;
            motor1 += 100; motor3 += 100;
            vPrintString("Manobra: Guinada | Acao: Sentido Anti-Horario\n");
        }

        printf("Motores -> M0:%d | M1:%d | M2:%d | M3:%d\n\n", motor0, motor1, motor2, motor3);

        /* Delay de 10ms */
        vTaskDelay(pdMS_TO_TICKS(10));
    }

    /* Exclusão explícita (exigência do roteiro, embora o loop seja infinito) [cite: 61] */
    vTaskDelete(NULL);
}

/* ARFAGEM - Período: 40ms (25Hz) */
void vTaskArfagem(void* pvParameters) {
    AcaoManobra acao = (AcaoManobra)pvParameters;

    for (;;) {
        if (acao == FRENTE) {
            // Frente: aumentar 2 e 3, diminuir 0 e 1 
            motor2 += 25; motor3 += 25;
            motor0 -= 25; motor1 -= 25;
            vPrintString("Manobra: Arfagem | Acao: Mover para Frente\n");
        }
        else {
            // Trás: diminuir 2 e 3, aumentar 0 e 1 
            motor2 -= 25; motor3 -= 25;
            motor0 += 25; motor1 += 25;
            vPrintString("Manobra: Arfagem | Acao: Mover para Tras\n");
        }

        printf("Motores -> M0:%d | M1:%d | M2:%d | M3:%d\n\n", motor0, motor1, motor2, motor3);

        /* Delay de 40ms */
        vTaskDelay(pdMS_TO_TICKS(40));
    }

    vTaskDelete(NULL);
}

/* ROLAGEM - Período: 20ms (50Hz) */
void vTaskRolagem(void* pvParameters) {
    AcaoManobra acao = (AcaoManobra)pvParameters;

    for (;;) {
        if (acao == DIREITA) {
            // Direita: aumentar 0 e 3, diminuir 1 e 2 
            motor0 += 50; motor3 += 50;
            motor1 -= 50; motor2 -= 50;
            vPrintString("Manobra: Rolagem | Acao: Virar a Direita\n");
        }
        else {
            // Esquerda: diminuir 0 e 3, aumentar 1 e 2 
            motor0 -= 50; motor3 -= 50;
            motor1 += 50; motor2 += 50;
            vPrintString("Manobra: Rolagem | Acao: Virar a Esquerda\n");
        }

        printf("Motores -> M0:%d | M1:%d | M2:%d | M3:%d\n\n", motor0, motor1, motor2, motor3);

        /* Delay de 20ms */
        vTaskDelay(pdMS_TO_TICKS(20));
    }

    vTaskDelete(NULL);
}

void main_(void) {
    /* Criação das tarefas */
    xTaskCreate(vTaskGuinada, "Guinada", 1000, (void*)HORARIO, 1, NULL);
    xTaskCreate(vTaskArfagem, "Arfagem", 1000, (void*)FRENTE, 1, NULL);
    xTaskCreate(vTaskRolagem, "Rolagem", 1000, (void*)DIREITA, 1, NULL);

    /* Inicia o escalonador */
    vTaskStartScheduler();

    for (;;);
}