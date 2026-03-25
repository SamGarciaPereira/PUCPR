public class ListaEncadeada<T> {

    private No<T> inicio; //head
    private int tamanho; //tamanho lista encadeada

    public void adiciona(T elemento){
        No<T> novoNo = new No<T>(elemento); //criando um novo nó passando um elemento de tipo genérico
        if(this.inicio == null){ //se o head for nulo:
            this.inicio = novoNo; //head vira um novo nó
        }else{ //senão
            No<T> atual = this.inicio; //ponteiro que começa a percorrer do inicio
            while(atual.getProximo() != null){ //enquanto o prox. elemento do ponteiro for não nulo:
                atual = atual.getProximo(); //ponteiro vai buscando um pŕox. não nulo
            }
            atual.setProximo(novoNo); //atual encontrou um nulo
        }
        this.tamanho++; //contador
    }

    public void remove(T elemento) {
        if (this.inicio == null) { // se a lista estiver vazia não há nada para remover
            return;
        }


        if (this.inicio.getElemento().equals(elemento)) { //se elemento que queremos remover é o primeiro:
            this.inicio = this.inicio.getProximo(); //nova head da lista passa a ser o segundo nó
            this.tamanho--; //diminui contagem
            return; //saída do método
        }

        No<T> anterior = this.inicio;

        // nó atual começa sendo o segundo elemento da lista
        No<T> atual = anterior.getProximo();

        while (atual != null) { //enquanto o atual não for nulo (ou seja, está no meio ou no fim da lista

            if (atual.getElemento().equals(elemento)) {//se o elemento do nó atual é o que buscamos:
                anterior.setProximo(atual.getProximo()); //o nó anterior agora aponta para o próximo do atual
                this.tamanho--; //diminui contagem
                return; //saída método
            }
            //se não encontramos ainda, avançamos ambos os ponteiros um passo à frente
            anterior = atual;         //o anterior vira o atual.
            atual = atual.getProximo(); //o atual vira o próximo dele mesmo
        }
        //erro
        System.out.println("Elemento não encontrado.");
    }

    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "inicio=" + inicio +
                '}';
    }
}
