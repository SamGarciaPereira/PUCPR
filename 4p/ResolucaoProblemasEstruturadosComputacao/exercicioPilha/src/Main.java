import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pilha p = new Pilha(3);
        Scanner sc = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("=====PROGRAMA DE PILHA=====");
            System.out.println("1 - Imprime");
            System.out.println("2 - Verifica Cheia");
            System.out.println("3 - Verifica Vazia");
            System.out.println("4 - Insere");
            System.out.println("5- Remove");
            System.out.println("0- Encerrar programa");
            System.out.print("Selecione a sua opção: ");
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    p.imprime();
                    break;

                case 2:
                    p.cheia();
                    break;

                case 3:
                    p.vazia();
                    break;

                case 4:
                    System.out.println("Entre com o valor a ser inserido: ");
                    int valor = sc.nextInt();
                    p.insere(valor);
                    p.imprime();
                    break;

                case 5:
                    p.remove();
                    p.imprime();
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }

        }while(opcao != 0);

        p.imprime();
        System.out.println("Encerrando programa...");
    }
}