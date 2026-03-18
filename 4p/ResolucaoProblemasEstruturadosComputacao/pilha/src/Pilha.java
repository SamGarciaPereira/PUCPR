public class Pilha {
    private int capacidade;
    private int topo;
    private int[] dados;

    public Pilha(int capacidade){
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.topo = -1;
    }

    public boolean cheia(){
        return topo == (capacidade -1);
    }

    public boolean vazia(){
        return topo == -1;
    }

    public void Insere(int valor){
        if(cheia()){
            System.out.println("Erro: não é possível inserir o valor " + valor + ". A pilha está cheia!");
            return;
        }
        topo++;
        dados[topo] = valor;
    }

    public int Remove(){
        if(vazia()){
            System.out.println("Erro: não é possível remover da pilha pois está vazia!");
            return -1;
        }
        int valorRemovido = dados[topo];
        topo--;
        return valorRemovido;
    }

    public void Imprime(){
        if (vazia()) {
            System.out.println("Erro: não é possível imprimir a pilha pois está vazia!");
            return;
        }
        System.out.println("----Elementos da Pilha (Topo -> Base)----");

        for(int i = topo; i >= 0 ; i--){
            System.out.println(dados[i]);
        }
        System.out.println("---------------------------");
    }
}
