public class ListaEncadeada{
    private int tamanho;
    private No inicio;
    private No fim;

    public ListaEncadeada(){
        this.tamanho = 0;
        this.inicio = null;
        this.fim = null;
    }

    public boolean vazia(){
        return tamanho == 0;
    }

    public void insereFim(int valor){
        No novoNo = new No(valor);
        if(vazia()){
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.setProximo(novoNo);
            fim = novoNo;
        }
        tamanho++;
    }

    public void insereInicio(int valor){
        No novoNo = new No(valor);
        if(vazia()){
            inicio = novoNo;
            fim = novoNo;
        } else {
            novoNo.setProximo(inicio);
            inicio = novoNo;
        }
        tamanho++;
    }

    public void insereOrdenado(int valor){
        No novoNo = new No(valor);
        if(vazia()){
            inicio = novoNo;
            fim = novoNo;
            System.out.println("Lista Vazia. Inisrido no Início.");
        }
        else if(valor < inicio.getValor()){
            novoNo.setProximo(inicio);
            inicio = novoNo;
            System.out.println("Valor [" + valor + "] é o menor. Inserido no Início.");
        }
        else if(valor >= fim.getValor()){
            novoNo.setProximo(fim);
            fim = novoNo;
            System.out.println("Valor [" + valor + "] é o maior ou igual. Inserido no Fim.");
        }else{
            No aux = inicio;
            while(aux.getProximo() != null || aux.getProximo().getValor() <= valor){
                aux = aux.getProximo();
            }
            novoNo.setProximo(aux.getProximo());
            aux.setProximo(novoNo);
            System.out.println("Valor [" + valor + "] inserido de forma INTERMEDIÁRIA.");
        }
    }

    public void removeInicio(){
        if (vazia()) {
            System.out.println("ERRO: Lista vazia!");
            return;
        }

        System.out.println("Será removido o nó da posição [1] (Valor: " + inicio.getValor() + ").");
        inicio = inicio.getProximo();
        tamanho--;
        if(vazia()){
            fim = null;
        }
    }

    public void removePorPosicao(int posicao){
        if (vazia()) {
            System.out.println("ERRO: a lista esta vazia!");
            return;
        }

        if(posicao <= 0 || posicao > tamanho){
            System.out.println("A posicao [" + posicao + "] nao existe!");
            return;
        }

        if(posicao == 1){
            System.out.println("Será removido o nó da posição [" + posicao + "] (Valor: " + inicio.getValor() + ").");
            inicio = inicio.getProximo();
            tamanho--;
            if(vazia()){
                fim = null;
            }
        }

        No aux = inicio;
        for(int i = 1; i < posicao -1; i++){
            aux = aux.getProximo();
        }

        No noRemovido = aux.getProximo();
        System.out.println("Será removido o nó da posição [" + posicao + "] (Valor " + noRemovido.getValor() + ").");
        aux.setProximo(noRemovido.getProximo());
        if(tamanho == posicao){
            fim = aux;
        }
        tamanho--;
    }
}