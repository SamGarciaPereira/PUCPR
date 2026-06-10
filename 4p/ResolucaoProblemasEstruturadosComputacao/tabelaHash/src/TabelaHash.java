public class TabelaHash {
    private int TAM = 1000;
    private int VAZIO = -1;
    private int[]tabela = new int[TAM];

    public TabelaHash() {
        for (int i = 0; i < TAM; i++) {
            tabela[i] = VAZIO;
        }
    }

    public int h(int chave) {
        return chave % TAM;
    }

    public int r(int i) {
        return (i + 1) % TAM;
    }

    int busca_hashing(int chave) {
        int i = h(chave);

        while (tabela[i] != chave && tabela[i] != VAZIO) {
            i = r(i);
        }

        if (tabela[i] == VAZIO) {
            return -1;
        } else {
            return i;
        }
    }

    void insere_hashing(int chave) {
        int i = h(chave);

        while (tabela[i] != VAZIO) {
            i = r(i);
        }

        tabela[i] = chave;
    }
}