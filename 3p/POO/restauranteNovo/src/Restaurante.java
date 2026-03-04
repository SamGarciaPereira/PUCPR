public class Restaurante {
    private String nome;
    private int numero;
    private String endereco;
    private String cep;
    private int capacidade;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getCep(){
        return this.cep;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    public int getCepacidade(){
        return this.capacidade;
    }

    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }
}


