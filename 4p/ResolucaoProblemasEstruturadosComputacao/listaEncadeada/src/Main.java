import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int opcao, n;
            ListaEncadeada<Integer> lista = new ListaEncadeada<>();

            do{
                System.out.println("=====MENU=====");
                System.out.println("1 - Inserir");
                System.out.println("2 - Excluir");
                System.out.println("0 - Parar");
                System.out.print("Insira uma opção: ");

                opcao = input.nextInt();

                switch(opcao){
                    case 1:
                        System.out.print("Insira o número que deseja inserir na lista: ");
                        n = input.nextInt();
                        lista.adiciona(n);
                        System.out.println("=====LISTA ENCADEADA COMPLETA=====");
                        System.out.println(lista);
                        break;
                    case 2:
                        System.out.println("=====LISTA ENCADEADA COMPLETA=====");
                        System.out.println(lista);
                        System.out.print("Insira o número que deseja excluir da lista: ");
                        n = input.nextInt();
                        lista.remove(n);
                        System.out.println("=====LISTA ENCADEADA COMPLETA=====");
                        System.out.println(lista);
                        break;
                    default:
                        System.out.println("Insira uma opção válida e tente novamente!");
                }
            }while(opcao != 0);

            System.out.println("=====LISTA ENCADEADA COMPLETA=====");
            System.out.println(lista);
        }
}
