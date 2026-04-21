public class No{
   private No proximo;
   private int valor;

   public No(int valor){
       this.valor = valor;
       this.proximo = null;
   }

   public int getValor(){
       return valor;
   }

   public void setValor(int valor){
       this.valor = valor;
   }

   public No getProximo(){
       return proximo;
   }

   public void setProximo(No proximo){
       this.proximo = proximo;
   }
}