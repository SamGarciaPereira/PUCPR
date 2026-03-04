public class Endereco {
    private String rua;
    private int numero;
    private String cidade;
    private String bairro;
    private String pais;
    private String cep;

    public Endereco(String rua, int numero, String cidade, String pais, String bairro, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.pais = pais;
        this.bairro = bairro;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}


