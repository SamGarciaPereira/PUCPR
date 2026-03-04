public class Fornecedor extends Pessoa{
    private String cnpj;
    private String endereco;


    public Fornecedor(int idade, String cnpj, String endereco) {
        super(idade);
        this.cnpj = cnpj;
        this.endereco = endereco;
    }
    @Override
    public String toString() {
        return "Fornecedor { idade = " + getIdade() + ", cnpj = '" + cnpj + "', endereco = '" + endereco + "' }";
    }
}
