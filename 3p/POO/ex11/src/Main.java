import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        Scanner input = new Scanner(System.in);

        while(i == 0){
            System.out.print("Insira a idade da pessoa: ");
            int idadePessoa = input.nextInt();
            Pessoa p1 = new Pessoa(idadePessoa);

            System.out.print("Insira a idade do funcionário: ");
            int idadeFuncionario = input.nextInt();
            System.out.print("Insira o salário do funcionário: ");
            double salario = input.nextDouble();
            Funcionario f1 = new Funcionario(idadeFuncionario ,salario);

            System.out.print("Insira a idade do fornecedor: ");
            int idadeFornecedor = input.nextInt();
            input.nextLine(); // <-- consome o ENTER deixado pelo nextInt

            System.out.print("Insira o CNPJ do fornecedor: ");
            String cnpj = input.nextLine();

            System.out.print("Insira o endereço do fornecedor: ");
            String endereco = input.nextLine();
            Fornecedor ff1 = new Fornecedor(idadeFornecedor, cnpj, endereco);

            System.out.print("Insira a idade do cliente: ");
            int idadeCliente = input.nextInt();
            System.out.print("Insira o id do cliente: ");
            int idCliente = input.nextInt();
            Cliente c1 = new Cliente(idadeCliente, idCliente);

            System.out.println("\n===== RESULTADOS =====");
            System.out.println("Dados da Pessoa: ");
            System.out.println(p1);
            System.out.println("Dados do funcionário: ");
            System.out.println(f1);
            System.out.println("Dados do fornecedor: ");
            System.out.println(ff1);
            System.out.println("Dados do cliente: ");
            System.out.println(c1);

            i++;
        }
        input.close(); 
    }
}
