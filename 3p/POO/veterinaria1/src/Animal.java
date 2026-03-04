public abstract class Animal {
    private String nome;
    private String locomocao;
    private double peso;
    private double comprimento;

    public Animal(String nome, String locomocao, double peso, double comprimento){
        this.nome = nome;
        this.locomocao = locomocao;
        this.peso = peso;
        this.comprimento = comprimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocomocao() {
        return locomocao;
    }

    public void setLocomocao(String locomocao) {
        this.locomocao = locomocao;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public abstract void som();



}
