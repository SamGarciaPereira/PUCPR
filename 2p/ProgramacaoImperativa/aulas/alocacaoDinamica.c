/*malloc
typedef struct {
char nome[16];
double raio; // km
double distancia_do_sol; // km
} Planeta;

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main()
{
    const size_t NUMERO_BYTES = sizeof(Planeta);
    Planeta* p = (Planeta*) malloc(NUMERO_BYTES);
    strcpy(p->nome, "Terra");
    p->raio = 6378.0;
    p->distancia_do_sol = 149600000.0;
    strcpy(p[0].nome, "Marte");
    p[0].raio = 3397;
    p[0].distancia_do_sol = 227940000.0;
    free(p);
    return 0;
}
*/
/*calloc
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define NUMERO_ELEMENTOS 10
int main()
{
    const size_t TAMANHO_ELEMENTO = sizeof(Planeta);
    Planeta* buffer = (Planeta*) calloc(NUMERO_ELEMENTOS, TAMANHO_ELEMENTO);
    strcpy(buffer[2].nome, "Terra");
    buffer[2].raio = 6378.0;
    buffer[2].distancia_do_sol = 149600000.0;
    printf("elemento na posicao 2: %s\n", buffer[2].nome);
    Planeta* p = buffer + 3;
    strcpy(p->nome, "Marte");
    p->raio = 3397;
    p->distancia_do_sol = 227940000.0;
    printf("elemento na posicao 3: %s\n", (buffer+3)->nome);
    free(buffer);
    return 0;
}
*/