public class Pessoa {
    String email;
    String nome;
    String cpf;
    String dataNascimento;
    Endereco endereco;

    public Pessoa(String nome){
        endereco = new Endereco();
        this.nome = nome;
    }

    public void mostrarInformacoes(){
        System.out.println(email);
        System.out.println(cpf);
        System.out.println(nome);
        System.out.println(dataNascimento);
        System.out.println(endereco.cep);
        System.out.println(endereco.numero);
        System.out.println(endereco.rua);

    }

}
