import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Endereco e1 = new Endereco("Rua Carioca", 13, "Rio de Janeiro", "Brasil", "Bangu", "2565656");
        Pessoa p1 = new Pessoa("Matheus Pelissari", "11111111111", "21999999999", e1);
        Banco picpay = new Banco("PicPay", p1);

        int opcao = -1;

        while(opcao != 9){
            System.out.println("*** BANCO " + picpay.getNomeBanco() + " ***");
            System.out.println("(1) Conta Corrente");
            System.out.println("(2) Conta Poupança");
            System.out.println("(3) Listar Contas");
            System.out.println("(9) Sair");
            System.out.println("Opção: ");
            opcao = input.nextInt();

            switch(opcao){
                case 1: 
                    menuContaCorrente();
                    break;
                case 2:
                    Endereco e2 = new Endereco("Rua Baianinho", "47", "Curitiba", "Brasil", "Alto da Glória", "855855");
                    Pessoa p = new Pessoa ("Samuel", "12585588559", "41856985995", e2);
                    Conta c = new Conta(1, 5000, "27/08/98", p);
                    ContaCorrente cc = new ContaCorrente(c);
                    picpay.getListaContaCorrente().add(cc);
                    break;
                case 3:

                    break;
                case 9:

                    break;
                default:
                    System.out.println("Selecione uma opção válida");



            }
        }


    }
    public static int menuContaCorrente() {
        System.out.println("(1) Nova Conta Corrente");
        System.out.println("(2) Listar Contas Correntes");
        System.out.println("(3) Debitar Valor");
    }
}