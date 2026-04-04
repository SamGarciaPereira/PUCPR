public class Pilha {
    private int capacidade;
    private int topo;
    private int dados[];

    Pilha(int capacidade){
        this.capacidade = capacidade;
        this.topo = topo -1;
        this.dados= new int[capacidade];
    }

    public boolean cheia(){
        return topo == (capacidade -1);
    }

    public boolean vazia(){
       return topo == -1;
    }

    public void insere(int valor){
        if(cheia()){
            System.out.println("A pilha esta cheia!");
            return;
        }

        topo++;
        dados[topo] = valor;
    }

    public void remove(){
        if (vazia()) {
            System.out.println("A pilha esta vazia, não há o que a ser removido!");
        }

        int valorRemovido = dados[topo];
        topo--;

        System.out.println("Valor removido do topo: " + valorRemovido);
    }

    public void imprime(){
        if(vazia()){
            System.out.println("A pilha não pode ser impressa se esta vazia!");
            return;
        }

        System.out.println("===== ELEMENTOS DA PILHA TOPO => BASE =====");

        for(int i = topo; i >= 0; i--){
            System.out.println(dados[i]);
        }

        System.out.println("====================");
    }

}
