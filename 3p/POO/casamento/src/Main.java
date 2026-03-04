import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da Pessoa 1 do casal: ");
        String nome1 = sc.nextLine();
        System.out.println("Digite o telefone da Pessoa 1: ");
        String telefone1 = sc.nextLine();
        Pessoa pessoa1 = new Pessoa(nome1, telefone1);

        System.out.println("Digite o nome da Pessoa 2 do casal: ");
        String nome2 = sc.nextLine();
        System.out.println("Digite o telefone da Pessoa 2: ");
        String telefone2 = sc.nextLine();
        Pessoa pessoa2 = new Pessoa(nome2, telefone2);

        Casal casal = new Casal(pessoa1, pessoa2);

        System.out.println("Digite o nome do padre: ");
        String nomePadre = sc.nextLine();
        System.out.println("Digite o telefone do padre: ");
        String telefonePadre = sc.nextLine();
        Pessoa padre = new Pessoa(nomePadre, telefonePadre);

        System.out.println("Digite o local do casamento: ");
        String local = sc.nextLine();
        System.out.println("Digite a data do casamento: ");
        String data = sc.nextLine();

        Buffet buffet = new Buffet(casal);

        Casamento casamento = new Casamento(casal, buffet, local, data, padre);

        int opcao = -1;

        while (opcao != 9) {
            System.out.println("\n*** MENU DO CASAMENTO ***");
            System.out.println("(1) Adicionar prato ao buffet");
            System.out.println("(2) Adicionar convidado");
            System.out.println("(3) Confirmar presença de convidado");
            System.out.println("(4) Exibir todos os detalhes do casamento");
            System.out.println("(9) Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do prato: ");
                    String nomePrato = sc.nextLine();
                    System.out.println("Digite o tipo do prato (entrada/principal/sobremesa): ");
                    String tipoPrato = sc.nextLine();
                    Prato prato = new Prato(nomePrato, tipoPrato);
                    buffet.adicionarPrato(prato);
                    System.out.println("Prato adicionado ao buffet!");
                    break;

                case 2:
                    System.out.println("Digite o nome do convidado: ");
                    String nomeConvidado = sc.nextLine();
                    System.out.println("Digite o telefone do convidado: ");
                    String telefoneConvidado = sc.nextLine();
                    System.out.println("Digite o email do convidado: ");
                    String emailConvidado = sc.nextLine();
                    Pessoa convidadoPessoa = new Pessoa(nomeConvidado, telefoneConvidado);
                    Convidado convidado = new Convidado(convidadoPessoa, emailConvidado);
                    casamento.adicionarConvidado(convidado);
                    System.out.println("Convidado adicionado!");
                    break;

                case 3:
                    System.out.println("Digite o nome do convidado para confirmar presença: ");
                    String nomeConfirmar = sc.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < casamento.getConvidados().size(); i++) {
                        Convidado c = casamento.getConvidados().get(i);
                        if (c.getPessoa().getNome().equalsIgnoreCase(nomeConfirmar)) {
                            c.setConfirmouPresenca();
                            System.out.println("Presença confirmada! ");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Convidado não encontrado. ");
                    }
                    break;

                case 4:
                    casamento.exibirDetalhes();
                    break;
            }
        }
        sc.close();
    }
}
