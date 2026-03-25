import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao, n;
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        do{
            System.out.println("===MENU===");
            System.out.println("1 - inserir");
            System.out.println("2 - excluir");
            System.out.println("0 - sair");
            System.out.print("Insira sua opção: ");
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Você escolheu a opção 1 - inserir.");
                    System.out.println("Digite o número que deseja inserir na lista encadeada: ");
                    n = sc.nextInt();
                    lista.adiciona(n);
                    System.out.println(lista);
                    break;
                case 2:
                    System.out.println("Você escolheu a opção 2 - remover.");
                    System.out.println(lista);
                    System.out.println("Digite o número que deseja remover da lista encadeada: ");
                    n = sc.nextInt();
                    lista.remove(n);
                    System.out.println(lista);
                    break;
                default:
                    System.out.println("Digite uma opção válida e tente novamente!");
                    break;
            }
        }while(opcao != 0);

        System.out.println(lista);
        System.out.println("Encerrando programa...");
    }
}