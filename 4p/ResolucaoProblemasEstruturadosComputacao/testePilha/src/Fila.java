public class Fila {
   private int dados[];
   private int inicio;
   private int fim;
   private int capacidade;

   public Fila(int capacidade){
       this.capacidade = capacidade;
       this.dados = new int [capacidade];
       this.inicio = 0;
       this.fim = -1;
   }

   public boolean cheia(){
       return (capacidade - 1) == fim;
   }

   public boolean vazia(){
       return inicio > fim;
   }

   public void insere(int valor){
       if(cheia()){
           System.out.println("Fila cheia, impossível inserir");
           return;
       }

       fim++;
       dados[fim] = valor;
   }

   public void remove(){
       if (vazia()) {
           System.out.println("Fila vazia, impossível remover");
           return;
       }

       int valorRemovido = dados[inicio];
       inicio++;
       System.out.println("Valor removido do início: "  + valorRemovido);
   }

   public void imprime(){
       if (vazia()) {
           System.out.println("Fila vazia, impossível remover");
           return;
       }

       for(int i = inicio; i <= fim; i++){
           System.out.print(dados[i]);
       }
   }
}