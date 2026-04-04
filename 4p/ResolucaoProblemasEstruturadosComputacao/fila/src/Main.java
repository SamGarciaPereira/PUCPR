import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Fila f = new Fila(4);
        Scanner sc = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("======PROGRAMA DE FILA CONVENCIONAL======");
            System.out.println("1 - Inserir");
            System.out.println("2 - Remover");
            System.out.println("3 - Imprimir");
            System.out.println("0 - Encerrar programa");
            System.out.println("==========================================");
            System.out.print("Insira sua opção: ");
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    System.out.print("Entre com o valor a ser inserido na fila: ");
                    int valor = sc.nextInt();
                    f.insere(valor);
                    f.imprime();
                    break;

                case 2:
                    f.remove();
                    f.imprime();
                    break;

                case 3:
                    f.imprime();
                    break;

                case 0:

                    break;

                default:
                    System.out.println("Opcao invalida, tente novamente");

            }

        }while(opcao != 0);

        f.imprime();
        System.out.println("Encerrando programa...");

    }
}
