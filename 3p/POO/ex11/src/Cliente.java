public class Cliente extends Pessoa{
    private int id;
    public Cliente(int idade, int id) {
        super(idade);
        this.id = id;
    }
    @Override
    public String toString() {
        return "Cliente { idade = " + getIdade() + ", idCliente = " + id + " }";
    }
}
