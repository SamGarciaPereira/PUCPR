public class Main {
    public static void main(String[] args) {
        EntradaDados in = new EntradaDados();
        System.out.println("Numero: ");
        try{
            double num = in.leNumeros();
        }catch(Exception e){
            System.out.println("Erro");
        }
    }
}