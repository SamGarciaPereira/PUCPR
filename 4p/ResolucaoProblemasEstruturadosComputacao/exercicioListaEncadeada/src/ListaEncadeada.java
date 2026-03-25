public class ListaEncadeada<T>{
    private No<T> inicio;
    private int tamanho;

    public void adiciona(T elemento){
        No<T> novoNo = new No<T>(elemento); //novo nó que recebe um elemento de um tipo genérico

        if(this.inicio == null){ //caso 1: se início == null, início recebe um novo nó
            this.inicio = novoNo;
        }else{ //caso 2: se inicio != null, um ponteiro "atual" é declarado em inicío e começa a percorrer a lista até um próx. elemento nulo
            No<T> atual = this.inicio;
            while(atual.getProximo() != null){
                atual = atual.getProximo();
            }
            atual.setProximo(novoNo); //quando finalmente "atual" acha um próx elemento nulo, seta ele como um novo nó.
        }
        this.tamanho++; //contador do tamanho da lista
    }

    public void remove(T elemento){
        if(this.inicio == null){ //caso 1: lista vazia, nada a remover
            System.out.println("Lista vazia! Nada a ser removido");
            return;
        }

        if(this.inicio.getElemento().equals(elemento)){ //caso 2: se o elemento recebido via input, é o mesmo elemento do início da lista
            this.inicio = this.inicio.getProximo(); //inicio pega o próx. elemento (mesmo que seja nulo). próx. passa a ser o início
            this.tamanho--; //contador é decrementado
            return;
        }

        No<T> anterior = this.inicio; //ponteiro "anterior" é declarado no início, para caso o ponteiro "atual" encontre o elemento a ser removido

        No<T> atual = anterior.getProximo(); //atual sempre vai ser o próx. de anterior

        while(atual != null){ //enquanto atual != null, percorre a lista
            if(atual.getElemento().equals(elemento)){ //se o elemento apontado por "atual" == elemento recebido por input:
                anterior.setProximo(atual.getProximo()); //"atual" é removido e "anterior" vira o próximo do atual, para não quebrar a cadeia
                this.tamanho--; //contador é decrementado
                return;
            }
            //se ainda elemento n foi encontrado, passamos os dois ponteiros uma posição pra frente:
            anterior = atual; //anterior => atual
            atual = atual.getProximo(); //atual => próximo
        }
        System.out.println("Elemento não encontrado na lista encadeada."); //erro
    }

    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "inicio=" + inicio +
                ", tamanho=" + tamanho +
                '}';
    }
}
