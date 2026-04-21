public class FilaCircular{
    private int capacidade;
    private int dados[];
    private int tamanho;
    private int inicio;
    private int fim;

    public FilaCircular(int capacidade){
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.inicio = 0;
        this.fim = -1;
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
            System.out.println("Fila cheia, impossível inserir!");
            return;
        }

        fim = (fim+1) % capacidade;
        dados[fim] = valor;
        tamanho++;
    }

    public void remove(){
        if (vazia()) {
            System.out.println("Fila vazia, impossível remover!");
            return;
        }

        int valorRemovido = dados[inicio];
        inicio = (inicio+1) % capacidade;
        tamanho--;
        System.out.println("Valor removido do inicio: " + valorRemovido);
    }

    public void imprime(){
        if (vazia()) {
            System.out.println("Fila vazia, impossível imprimir!");
            return;
        }
        int aux = inicio;
        for(int i = 0; i < tamanho; i++){
            System.out.println("Posição [" + aux + "] " + dados[aux]);
            aux = (aux+1) % capacidade;
        }
    }
}