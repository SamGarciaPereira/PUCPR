public class ListaEncadeada{
    private No inicio;
    private No fim;
    private int tamanho;

    public ListaEncadeada(){
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public boolean vazia(){
        return tamanho == 0;
    }

    public void insereFim(int valor){
        No novoNo = new No(valor);
        if (vazia()) {
            inicio = novoNo;
            fim = novoNo;
        } else{
            fim.setProximo(novoNo);
            fim = novoNo;
        }
        tamanho++;
    }

    public void insereInicio(int valor){
        No novoNo = new No(valor);
        if (vazia()) {
            inicio = novoNo;
            fim = novoNo;
        } else{
            novoNo.setProximo(inicio);
            inicio = novoNo;
        }
        tamanho++;
    }

    public void removeInicio(){
        if (vazia()) {
            System.out.println("Erro: A lista está vazia!");
            return;
        }

        int valorRemovido = inicio.getValor();
        inicio = inicio.getProximo();
        tamanho--;
        if (vazia()) {
            fim = null;
        }
        System.out.println("Valor removido do inicio: " + valorRemovido);
    }

    public void removePorPosicao(int posicao){
        if (vazia()) {
            System.out.println("Erro: A lista está vazia!");
            return;
        }

        if(posicao <= 0 || posicao > tamanho){
            System.out.println("Aviso: O nó na posição " + posicao + " não existe!");
            return;
        }
        if(posicao == 1){
            System.out.println("Removendo o nó da posicão " + posicao + " (Valor: " + inicio.getValor() + ")");
            inicio = inicio.getProximo();
            tamanho--;
            if (vazia()) {
                fim = null;
            }
            return;
        }
        No aux = inicio;
        for(int i = 1; i < posicao - 1; i++){
            aux = aux.getProximo();
        }

        No noRemovido = aux.getProximo();
        System.out.println("Removendo o nó da poisção " + posicao + " (Valor " + noRemovido.getValor() + ")");
        aux.setProximo(noRemovido.getProximo());

        if(posicao == tamanho){
            fim = aux;
        }
        tamanho--;
    }

    public void consulta(int posicao){
        if (vazia()) {
            System.out.println("Erro: A lista está vazia!");
            return;
        }

        if(posicao <= 0 || posicao > tamanho){
            System.out.println("Aviso: O nó na posição " + posicao + " não existe!");
            return;
        }

        No aux = inicio;
        for(int i = 1; i < posicao; i++){
            aux = aux.getProximo();
        }

        int valorEncontrado = aux.getValor();
        System.out.println("Na posição " + posicao + " temos o valor " + valorEncontrado);
    }

    public void imprime(){
        if (vazia()) {
            System.out.println("Erro: A lista está vazia!");
            return;
        }
        System.out.println("Lista: ");
        No aux = inicio;
        while(aux != null){
            System.out.print("[" + aux.getValor() + "] ->");
            aux = aux.getProximo();
        }
        System.out.println("null (Tamanho: " + tamanho + ")");
    }
}