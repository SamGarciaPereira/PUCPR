public class ListaDuplamenteEncadeada {
    private NoDuplo head;
    private NoDuplo tail;
    private int tamanho;

    public ListaDuplamenteEncadeada(){
        this.tamanho = 0;
        this.head = null;
        this.tail = null;
    }

    public boolean vazia(){
        return tamanho == 0;
    }

    public void insereTail(int valor){
        NoDuplo novoNo = new NoDuplo(valor);
        if(vazia()){
            head = novoNo;
            tail = novoNo;
        } else{
            tail.setProximo(novoNo);
            novoNo.setAnterior(tail);
            tail = novoNo;
        }
        tamanho++;
    }

    public void insereHead(int valor){
        NoDuplo novoNo = new NoDuplo(valor);
        if(vazia()){
            head = novoNo;
            tail = novoNo;
        } else {
            novoNo.setProximo(head);
            head.setAnterior(novoNo);
            head = novoNo;
        }
        tamanho++;
    }

    public void removeHead(){
        if(vazia()){
            System.out.println("ERRO: Lista vazia!");
            return;
        }

        System.out.println("Removendo head (valor: " + head.getValor() + ").");
        head = head.getProximo();
        if(head != null){
            head.setAnterior(null);
        } else{
            tail = null;
        }
        tamanho--;
    }

    public void removeTail(){
        if(vazia()){
            System.out.println("ERRO: Lista vazia!");
            return;
        }

        System.out.println("Removendo tail (valor: " + tail.getValor() + ").");
        tail = tail.getAnterior();
        if(tail != null){
            tail.setProximo(null);
        } else {
            head = null;
        }
        tamanho --;
    }

    public void removePorPosicao(int posicao){
        if(vazia()){
            System.out.println("ERRO: Lista vazia!");
            return;
        }

        if(posicao <= 0 || posicao > tamanho){
            System.out.println("ERRO: A posição [" + posicao + "] não existe!");
            return;
        }

        if (posicao == 1){
            System.out.println("Será removido o nó da posição [" + posicao + "] (Valor: " + head.getValor() + ").");
            head = head.getProximo();
            if(head != null){
                head.setAnterior(null);
            } else{
                tail = null;
            }
        }
        else if(posicao == tamanho){
            tail = tail.getAnterior();
            if(tail != null){
                tail.setProximo(null);
            } else {
                head = null;
            }
        }
        else{
            NoDuplo aux = head;
            for(int i = 1; i < posicao; i++){
                aux = aux.getProximo();
            }

            NoDuplo anterior = aux.getAnterior();
            NoDuplo proximo = aux.getProximo();

            anterior.setProximo(proximo);
            proximo.setAnterior(anterior);
        }
        tamanho--;
    }

    public void buscaElementoPorValor(int valor){
        if(vazia()){
            System.out.println("ERRO: Lista vazia!");
            return;
        }
        NoDuplo aux = head;
        int posicao = 1;

        while(aux != null){
            if(aux.getValor() == valor){
                System.out.println("Valor " + valor + " encontrado na posição [" + posicao + "]!");
                return;
            }
            aux = aux.getProximo();
            posicao++;
        }
        System.out.println("Valor não encontrado!");
        return;
    }

    public void removeElementoPorValor(int valor){
        if(vazia()){
            System.out.println("ERRO: Lista vazia!");
            return;
        }

        NoDuplo aux = head;
        while(aux != null && aux.getValor() != valor){
            aux = aux.getProximo();
        }

        if(aux == null){
            System.out.println("O valor " + valor + " não foi encontrado na lista!");
            return;
        }

        System.out.println("Removendo o valor [" + valor + "] da lista...");

        if(aux == head){
            head = aux.getProximo();
            if(head != null){
                head.setAnterior(null);
            } else{
                tail = null;
            }
        }
        else if(aux == tail){
            tail = aux.getAnterior();
            if(tail != null){
                tail.setProximo(null);
            } else{
                head = null;
            }
        }
        else{
            NoDuplo anterior = aux.getAnterior();
            NoDuplo proximo = aux.getProximo();

            anterior.setProximo(proximo);
            proximo.setAnterior(anterior);
        }
        tamanho--;
    }

    public void imprimeNormal(){
        if(vazia()){
            System.out.println("ERRO: Lista vazia!");
            return;
        }

        NoDuplo aux = head;
        while(aux != null){
            System.out.print("[" + aux.getValor() + "] ->");
            aux = aux.getProximo();
        }
        System.out.println("null");
    }

    public void imprimeInverso(){
        if(vazia()){
            System.out.println("ERRO: Lista vazia!");
            return;
        }

        NoDuplo aux = tail;
        while(aux != null){
            System.out.print("[" + aux.getValor() + "] ->");
            aux = aux.getAnterior();
        }
        System.out.println("null");
    }
}
