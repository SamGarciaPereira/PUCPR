import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        int opcao;

        do {
            System.out.println("\n========= MENU: LISTA DUPLAMENTE ENCADEADA =========");
            System.out.println("Status atual da lista (Esquerda para Direita):");
            lista.imprimeNormal();
            System.out.println("----------------------------------------------------");
            System.out.println("1 - Inserir no Fim (Tail)");
            System.out.println("2 - Inserir no Início (Head)");
            System.out.println("3 - Remover do Início (Head)");
            System.out.println("4 - Remover do Fim (Tail)");
            System.out.println("5 - Remover por Posição");
            System.out.println("6 - Remover por Valor");
            System.out.println("7 - Buscar por Valor");
            System.out.println("8 - Imprimir Inverso (Direita para Esquerda)");
            System.out.println("0 - Sair");
            System.out.println("====================================================");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para inserir no FIM: ");
                    lista.insereTail(scanner.nextInt());
                    break;

                case 2:
                    System.out.print("Digite o valor para inserir no INÍCIO: ");
                    lista.insereHead(scanner.nextInt());
                    break;

                case 3:
                    lista.removeHead();
                    break;

                case 4:
                    lista.removeTail();
                    break;

                case 5:
                    System.out.print("Digite a POSIÇÃO que deseja remover (1, 2, 3...): ");
                    lista.removePorPosicao(scanner.nextInt());
                    break;

                case 6:
                    System.out.print("Digite o VALOR que deseja remover: ");
                    lista.removeElementoPorValor(scanner.nextInt());
                    break;

                case 7:
                    System.out.print("Digite o VALOR que deseja buscar: ");
                    lista.buscaElementoPorValor(scanner.nextInt());
                    break;

                case 8:
                    System.out.println("\n--- Navegação do Fim para o Início ---");
                    lista.imprimeInverso();
                    break;

                case 0:
                    System.out.println("Encerrando o programa de testes...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}