public class Main  {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Samuel Pereira");
        ContaBancaria c1 = new ContaBancaria(123, 321);
        Cartao cartao = new Cartao();
        
        cartao.nroCartao = 12345;
        p1.email = "samgarciapereira@gmail.com";
        p1.dataNascimento = "27/07/2005";
        p1.cpf = "123456789";
        p1.endereco.rua = "Rua Bahia";
        p1.endereco.numero = 984;
        p1.endereco.cep = "00000-000";

        p1.mostrarInformacoes();
        c1.mostrarTodasInformacoes();


    }
}