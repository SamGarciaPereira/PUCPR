import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Defina a capacidade da fila circular para o teste: ");
        int capacidade = input.nextInt();

        FilaCircular fila = new FilaCircular(capacidade);
        int opcao;

        do {
            System.out.println("\n========= TESTE: FILA CIRCULAR =========");
            System.out.println("1 - Inserir elemento (insere)");
            System.out.println("2 - Remover elemento (remove)");
            System.out.println("3 - Imprimir estado da fila (imprime)");
            System.out.println("4 - Verificar se está cheia");
            System.out.println("5 - Verificar se está vazia");
            System.out.println("0 - Sair");
            System.out.println("========================================");
            System.out.print("Escolha uma opção: ");

            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    if (!fila.cheia()) {
                        System.out.print("Digite o valor inteiro para inserir: ");
                        int valor = input.nextInt();
                        fila.insere(valor);
                        System.out.println("Valor inserido com sucesso.");
                    } else {
                        System.out.println("Aviso: A fila já atingiu o limite máximo.");
                    }
                    break;

                case 2:
                    if(!fila.vazia()){
                        fila.remove();
                    }
                    break;

                case 3:
                    fila.imprime();
                    break;

                case 4:
                    if (fila.cheia()) {
                        System.out.println("Status: A fila está CHEIA.");
                    } else {
                        System.out.println("Status: A fila ainda possui espaço.");
                    }
                    break;

                case 5:
                    if (fila.vazia()) {
                        System.out.println("Status: A fila está VAZIA.");
                    } else {
                        System.out.println("Status: A fila contém elementos.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa de testes...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        input.close();
    }
}