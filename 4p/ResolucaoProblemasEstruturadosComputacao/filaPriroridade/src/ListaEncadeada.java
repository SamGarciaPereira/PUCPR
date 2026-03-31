public class ListaEncadeada <T> {
    private No inicio;

    public void insereOrdenado(int valor) {
        No novoNo = new No(valor); // novo nó com o número

        if (this.inicio == null || valor < this.inicio.getElemento()) { //se a lista estiver vazia ou o valor for menor que o início, ele entra no topo.
            novoNo.setProximo(this.inicio); // novo nó aponta para o antigo início
            this.inicio = novoNo;           // início agora aponta para o novo nó
        }
        else {
            No atual = this.inicio; //ponteiro para percorrer a lista

            while (atual.getProximo() != null && atual.getProximo().getElemento() < valor) { //enquanto o pŕox. do atual != null E pŕox do atual < valor inserido
                atual = atual.getProximo(); //avança para o próximo nó
            }

            novoNo.setProximo(atual.getProximo()); //novo nó aponta para o sucessor do atual
            atual.setProximo(novoNo);              //atual aponta para o novo nó
        }
    }

    public void imprime() {
        if (this.inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }


        No atual = this.inicio; //ponteiro "atual" para não perder a referência do "inicio"

        System.out.print("Conteúdo da Lista: ");


        while (atual != null) { //enquanto o ponteiro atual não for nulo, ainda existem nós para ler
            System.out.print(atual.getElemento() + " ");
            atual = atual.getProximo(); //o ponteiro pula para o próximo nó da corrente
        }
        System.out.println();
    }
}
