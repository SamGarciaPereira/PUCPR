// Cada posição da tabela é a "cabeça" de uma lista encadeada
// Exemplo visual para h(x) = x % 10, tabela de tamanho 10:
//
// pos[6] → [5654396 | •]──→ [2396 | •]──→ [15396 | null]
// pos[7] → [0000397 | null]
// pos[8] → null  (vazio)
//
// Diferente do rehashing: colisões ficam NA MESMA posição,
// encadeadas em lista — não "empurram" para outras posições.

public class TabelaHashEncadeamento {

    private Node[] tabela;
    private int tamanho;

    public TabelaHashEncadeamento(int tamanho) {
        this.tamanho = tamanho;
        tabela = new Node[tamanho];
        // Java já inicializa arrays de objetos com null
        // null = posição vazia (sem nenhum elemento)
    }

    // Função hash: igual à do rehashing
    private int h(int chave) {
        return chave % tamanho;
    }

    public void insere(int chave) {
        int pos = h(chave);
        Node novo = new Node(chave);

        // Posição vazia: novo nó vira a cabeça da lista
        if (tabela[pos] == null) {
            tabela[pos] = novo;
            System.out.printf("Chave %d inserida na posição %d%n", chave, pos);
            return;
        }

        // Colisão: insere ordenado na lista encadeada
        Node atual = tabela[pos];
        Node anterior = null;

        // Avança enquanto a chave atual for menor que a nova
        while (atual != null && atual.chave < chave) {
            anterior = atual;
            atual = atual.proximo;
        }

        // Insere no início da lista (novo é o menor)
        if (anterior == null) {
            novo.proximo = tabela[pos];
            tabela[pos] = novo;
        } else {
            // Insere no meio ou no final
            novo.proximo = anterior.proximo;
            anterior.proximo = novo;
        }
        System.out.printf("Colisão em %d! Chave %d encadeada na lista%n", pos, chave);
    }

    public int busca(int chave) {
        int pos = h(chave);
        Node atual = tabela[pos];

        // Percorre a lista encadeada daquela posição
        while (atual != null && atual.chave <= chave) {
            if (atual.chave == chave) {
                System.out.printf("Chave %d encontrada na posição %d%n", chave, pos);
                return pos;
            }
            atual = atual.proximo;
        }

        System.out.printf("Chave %d não encontrada%n", chave);
        return -1;
    }

    // Exemplo do PDF — ins(2396), ins(15396), ins(8396) na pos 396:
    //
    // pos[6] → [2396]──→ [8396]──→ [15396]──→ null
    //           ↑ lista ordenada automaticamente
    //
    // busca(8396): vai direto à pos 6, percorre 2 nós → achou!

    public void print(int pos) {

        Node atual = tabela[pos];

        while (atual != null) {
            System.out.println(atual.chave);
            atual = atual.proximo;
        }

    }

    public static void main(String[] args) {
        TabelaHashEncadeamento t = new TabelaHashEncadeamento(10);

        t.insere(5654396 ); // h(9837561) = 1 → posição 1
        t.insere(2396); // h(4512561) = 1 → COLISÃO! rehash → posição 2
        t.insere(15396); // h(3333561) = 1 → COLISÃO! rehash → posição 3
        t.insere(8396);

        t.print(6);

        t.busca(5654396); // Percorre 1 → 2 → encontra!
        t.busca(9999999); // Não encontrado → retorna -1
    }

    // O Nó: mesma estrutura de uma lista encadeada
    static class Node {
        int chave;
        Node proximo;  // ponteiro para o próximo nó

        public Node(int chave) {
            this.chave = chave;
            this.proximo = null;
        }
    }
}
