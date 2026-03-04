public class Prato {
    private String nome;
    private double preco;

    public Prato(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public void exibirDetalhes(){
        System.out.println(nome + " - R$ " + preco);
    }
    public double getPreco(){
        return this.preco;
    }
}
