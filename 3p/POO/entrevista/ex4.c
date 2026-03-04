#include <stdio.h> // Biblioteca padrão de entrada e saída do C

int main() {
    // Declara variáveis. Float para dinheiro/taxa (tem vírgula), int para meses
    float montanteInicial, taxa, montanteFinal, juros;
    int periodo;

    // --- ENTRADAS ---
    printf("Digite o Montante Inicial: ");
    // scanf lê o teclado. 
    // "%f" avisa que virá um float. 
    // "&montanteInicial" diz: grave nesse endereço de memória. O '&' é obrigatório aqui.
    scanf("%f", &montanteInicial); 

    printf("Digite o Periodo (em meses): ");
    scanf("%d", &periodo); // "%d" para inteiro

    printf("Digite a Taxa de Juros (em %%): ");
    scanf("%f", &taxa);

    // --- PROCESSAMENTO ---
    // 1. Calcula o valor dos juros. 
    // Importante: dividir taxa por 100.0 (com ponto) para garantir divisão decimal
    juros = montanteInicial * (taxa / 100.0) * periodo;

    // 2. Soma ao valor inicial
    montanteFinal = montanteInicial + juros;

    // --- SAÍDA ---
    // "%.2f" formata para mostrar apenas 2 casas decimais
    printf("O Montante Final a receber e: %.2f\n", montanteFinal);

    return 0; // Retorna 0 para o sistema operacional dizendo "O programa rodou sem erros"
}