import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcao, n;
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        do{
            System.out.println("=====MENU=====");
            System.out.println("1 - Inserir");
            System.out.println("0 - Parar");
            System.out.print("Insira uma opção: ");

            opcao = input.nextInt();

            switch(opcao){
                case 1:
                    System.out.print("Insira o número que deseja inserir na lista: ");
                    n = input.nextInt();
                    lista.insereOrdenado(n);
                    System.out.println("=====LISTA ENCADEADA ORDENADA COMPLETA=====");
                    lista.imprime();
                    break;
                default:
                    System.out.println("Insira uma opção válida e tente novamente!");
            }
        }while(opcao != 0);

        System.out.println("=====LISTA ENCADEADA COMPLETA=====");
        lista.imprime();
    }

}
