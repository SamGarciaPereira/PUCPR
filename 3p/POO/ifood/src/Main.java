import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int opcao = -1;
        int qtdPratos = -1;
        Scanner input = new Scanner(System.in);
        
        while(opcao != 9){
            System.out.println("======= IFOOD =======");
            System.out.println("(1) Cadastrar novo cliente");
            System.out.println("(9) Encerrar programa");
            System.out.print("Insira sua opção: ");

            opcao = input.nextInt();

            if(opcao == 1){
                input.nextLine();
                System.out.print("Insira seu nome: ");
                String nome = input.nextLine();


                System.out.print("Insira seu telefone: ");
                String telefone = input.nextLine();


                Cliente cliente = new Cliente(nome, telefone);

                Pedido pedido = new Pedido(cliente);

                System.out.print("Insira a quantidade de pratos que deseja comprar: ");
                qtdPratos = input.nextInt();
                input.nextLine();
                if(qtdPratos >= 5){
                    for(int i = 0; i <= qtdPratos; i++) {
                        System.out.println("Insira o nome do prato " + (i+1) + ": ");
                        String nomePrato = input.nextLine();

                        System.out.println("Insira o valor do prato " + (i+1) + ": ");
                        double precoPrato = input.nextDouble();
                        input.nextLine();

                        pedido.adicionarPrato(new Prato(nomePrato, precoPrato));
                    }
                    pedido.exibirPedido();
                }else{
                    System.out.println("Precisa adicionar mais de 5 pratos!");
                }

            }else if(opcao == 9){
                System.out.println("Encerrando...");
            }else{
                System.out.println("Opção inválida, tente novamente!");
            }
            input.close();
        }
    }
}