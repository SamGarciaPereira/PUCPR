import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pilha pilha = new Pilha(5);
        int opcao;

        do{
            System.out.println("-----MENU-----");
            System.out.println("1 - Inserir");
            System.out.println("2 - Remover");
            System.out.println("3 - Imprimir pilha");
            System.out.println("4 - Verificar se está cheia");
            System.out.println("5 - Verificar se está vazia");
            System.out.println("0 - Encerrar programa");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch(opcao){
                case 1:
                    System.out.print("Escolha o valor a ser inserido: ");
                    int valor = input.nextInt();
                    pilha.Insere(valor);
                    break;
                case 2:
                    if (!pilha.vazia()) {
                        System.out.println("Excluindo topo da lista...");
                        System.out.println("Valor removido: " + pilha.Remove());
                    } else {
                        pilha.Remove();
                    }
                    break;
                case 3:
                    pilha.Imprime();
                    break;
                case 4:
                    System.out.println("Pilha cheia? Status: " + pilha.cheia());
                    break;
                case 5:
                    System.out.println("Pilha vazia? Status: " + pilha.vazia());
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Valor inválido! Escolha de 1 a 5 e tente novamente");
                    break;
            }
        }while(opcao != 0);
        input.close();
    }
}