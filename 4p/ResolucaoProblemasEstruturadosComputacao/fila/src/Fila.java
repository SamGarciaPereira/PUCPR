public class Fila {
    private int inicio;
    private int fim;
    private int dados[];
    private int capacidade;
    private int tamanho;

    public Fila(int capacidade){
        this.capacidade = capacidade;
        this.inicio = 0;
        this.fim = -1;
        this.dados = new int[capacidade];
        this.tamanho = 0;
    }

    public boolean cheia(){
        return tamanho == capacidade;
    }

    public boolean vazia(){
        return tamanho == 0;
    }

    public void insere(int valor){
        if(cheia()){
            System.out.println("ERRO: lista esta cheia!");
            return;
        }
        fim++;
        dados[fim] = valor;
        tamanho++;
    }

    public void remove(){
        if(vazia()){
            System.out.println("ERRO: lista esta vazia!");
            return;
        }

        int valorRemovido = dados[inicio];
        inicio++;
        tamanho--;
        System.out.println("Valor removido do início: " + valorRemovido);
    }

    public void imprime(){
        if (vazia()) {
            System.out.println("ERRO: lista esta vazia!");
            return;
        }

        System.out.println("=====FILA COMPLETA=====");
        for(int i = inicio; i <= fim; i++){
            System.out.println(dados[i]);
        }
        System.out.println("=====================");
    }
}
