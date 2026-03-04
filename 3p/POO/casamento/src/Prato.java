public class Prato {
    private String nome;
    private String tipo;

    public Prato(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void exibirPrato() {
        System.out.println(this.nome + ": " + this.tipo);
    }
}