// Estrutura completa da Tabela Hash com Rehashing (Java)
public class TabelaHash {

    private static final int VAZIO = -1;
    private int[] tabela;
    private int tamanho;

    // Construtor: inicializa todas as posições como VAZIAS
    public TabelaHash(int tamanho) {
        this.tamanho = tamanho;
        tabela = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            tabela[i] = VAZIO; // -1 indica posição livre
        }
    }

    // Função hash principal: retorna o índice da chave
    private int h(int chave) {
        return chave % tamanho;
    }

    // Insere uma chave usando rehashing para resolver colisões
    public void insere(int chave) {
        int i = h(chave);         // posição inicial
        int tentativas = 0;

        // Enquanto a posição estiver ocupada, avança para a próxima
        while (tabela[i] != VAZIO) {
            i = r(i);             // rehashing: tenta próxima posição
            tentativas++;

            // Evita loop infinito se a tabela estiver cheia
            if (tentativas == tamanho) {
                System.out.println("Tabela cheia! Não foi possível inserir.");
                return;
            }
        }
        tabela[i] = chave;
        System.out.printf("Chave %d inserida na posição %d%n", chave, i);
    }

    // Função de rehashing: próxima posição circular
    private int r(int i) {
        return (i + 1) % tamanho;  // garante que volta ao início
    }

    // Retorna a posição da chave, ou -1 se não encontrada
    public int busca(int chave) {
        int i = h(chave);
        int tentativas = 0;

        // Para quando achar a chave OU encontrar posição vazia
        while (tabela[i] != chave && tabela[i] != VAZIO) {
            i = r(i);
            tentativas++;

            if (tentativas == tamanho) break; // percorreu toda a tabela
        }

        if (tabela[i] == chave) {
            System.out.printf("Chave %d encontrada na posição %d%n", chave, i);
            return i;
        }
        System.out.printf("Chave %d não encontrada%n", chave);
        return -1;
    }

    // Exemplo completo rodando no main()
    public static void main(String[] args) {
        TabelaHash t = new TabelaHash(10);

        t.insere(9837561); // h(9837561) = 1 → posição 1
        t.insere(4512561); // h(4512561) = 1 → COLISÃO! rehash → posição 2
        t.insere(3333561); // h(3333561) = 1 → COLISÃO! rehash → posição 3

        t.busca(4512561); // Percorre 1 → 2 → encontra!
        t.busca(9999999); // Não encontrado → retorna -1

        // Saída esperada:
        // Chave 9837561 inserida na posição 1
        // Chave 4512561 inserida na posição 2  (colisão resolvida)
        // Chave 3333561 inserida na posição 3  (colisão resolvida)
        // Chave 4512561 encontrada na posição 2
        // Chave 9999999 não encontrada
    }

}