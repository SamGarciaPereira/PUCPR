public class ArvoreBuscaBinaria {
    private No raiz;

    public ArvoreBuscaBinaria(){
        this.raiz = null;
    }

    public void inserir(int valor){
        raiz = inserirRec(raiz, valor);
    }

    public No inserirRec(No atual, int valor){
        if (atual == null){
            return new No(valor);
        }
        if(valor < atual.getValor()){
            atual.setEsquerda(inserirRec(atual.getEsquerda(), valor));
        } else if (valor > atual.getValor()) {
            atual.setDireita(inserirRec(atual.getDireita(), valor));
        }
        return atual;
    }

    public void preOrdem(){
        preOrdemRec(raiz);
        System.out.println();
    }

    public void preOrdemRec(No atual){
        if(atual != null){
            System.out.print(atual.getValor() + " ");
            preOrdemRec(atual.getEsquerda());
            preOrdemRec(atual.getDireita());
        }
    }

    public void inOrdem(){
        inOrdemRec(raiz);
        System.out.println();
    }

    public void inOrdemRec(No atual){
        if(atual != null){
            inOrdemRec(atual.getEsquerda());
            System.out.print(atual.getValor());
            inOrdemRec(atual.getDireita());
        }
    }

    public void posOrdem(){
        posOrdemRec(raiz);
        System.out.println();
    }

    public void posOrdemRec(No atual){
        if(atual !=  null){
            posOrdemRec(atual.getEsquerda());
            posOrdemRec(atual.getDireita());
            System.out.print(atual.getValor());
        }
    }

    public void removerMaior(){
        raiz = removerMaiorRec(raiz);
    }

    private No removerMaiorRec(No atual){
        if(atual == null){
            return null;
        }
        if(atual.getDireita() == null){
            return atual.getEsquerda();
        }
        atual.setDireita(removerMaiorRec(atual.getDireita()));
        return atual;
    }

    public void removerMenor(){
        raiz = removerMenorRec(raiz);
    }

    public No removerMenorRec(No atual){
        if(atual == null){
            return null;
        }
        if(atual.getEsquerda() == null){
            return atual.getEsquerda();
        }
        atual.setEsquerda(removerMenorRec(atual.getEsquerda()));
        return atual;
    }

    public void removerElemento(int valor){
        raiz = removerElementoRec(raiz, valor);
    }

    public No removerElementoRec(No atual, int valor){
        if(atual == null){
            return null;
        }
        if (valor < atual.getValor()) {
            atual.setEsquerda(removerElementoRec(atual.getEsquerda(), valor));
        } else if (valor > atual.getValor()) {
            atual.setDireita(removerElementoRec(atual.getDireita(), valor));
        }
        else{
            if(atual.getDireita() == null){
                return atual.getEsquerda();
            }
            if(atual.getEsquerda() == null){
                return atual.getDireita();
            }

            int menorValor = encontrarMenorValor(atual.getDireita());
            atual.setValor(menorValor);
            atual.setDireita(removerElementoRec(atual.getDireita(), menorValor));
        }
        return atual;
    }

    public int encontrarMenorValor(No atual){
        while(atual.getEsquerda() != null){
            atual = atual.getEsquerda();
        }
        return atual.getValor();
    }
}
