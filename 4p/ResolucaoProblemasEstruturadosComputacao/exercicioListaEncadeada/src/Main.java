import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaEncadeada lista = new ListaEncadeada();
        int opcao;

        do {
            System.out.println("\n========= MENU DA LISTA =========");
            lista.imprime();
            System.out.println("1 - Inserir no Fim");
            System.out.println("2 - Inserir no Início");
            System.out.println("3 - Remover do Início");
            System.out.println("4 - Remover por Posição");
            System.out.println("5 - Consultar Posição");
            System.out.println("0 - Sair");
            System.out.println("=================================");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para inserir no FIM: ");
                    int valorFim = scanner.nextInt();
                    lista.insereFim(valorFim);
                    break;

                case 2:
                    System.out.print("Digite o valor para inserir no INÍCIO: ");
                    int valorInicio = scanner.nextInt();
                    lista.insereInicio(valorInicio);
                    break;

                case 3:
                    lista.removeInicio();
                    break;

                case 4:
                    System.out.print("Digite a POSIÇÃO que deseja remover: ");
                    int posRemover = scanner.nextInt();
                    lista.removePorPosicao(posRemover);
                    break;

                case 5:
                    System.out.print("Digite a POSIÇÃO que deseja consultar: ");
                    int posConsulta = scanner.nextInt();
                    lista.consulta(posConsulta);
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}