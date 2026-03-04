public int buscaBinaria(int[] array, int alvo) {
    int inicio = 0;               // Aponta para o começo do array
    int fim = array.length - 1;   // Aponta para o final do array

    // Enquanto o início não passar o fim, ainda tem onde procurar
    while (inicio <= fim) {
        
        // Acha o índice do meio. Ex: (0 + 10) / 2 = 5
        int meio = (inicio + fim) / 2;

        // CENÁRIO 1: Achou de primeira (Sorte!)
        if (array[meio] == alvo) {
            return meio; // Retorna a POSIÇÃO onde está o número
        }

        // CENÁRIO 2: O valor do meio é MENOR que o alvo
        // Ex: Meio é 10, Alvo é 50. Então o alvo está à DIREITA.
        if (array[meio] < alvo) {
            inicio = meio + 1; // O início pula para depois do meio. Ignoramos a esquerda.
        } 
        
        // CENÁRIO 3: O valor do meio é MAIOR que o alvo
        // Ex: Meio é 50, Alvo é 10. O alvo está à ESQUERDA.
        else {
            fim = meio - 1;    // O fim recua para antes do meio. Ignoramos a direita.
        }
    }
    return -1; // Se o while terminar e não achar nada, retorna -1 (código padrão de erro)
}