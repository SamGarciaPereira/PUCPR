public class Papagaio extends Animal{
    public Papagaio(String nome, String locomocao, double peso, double comprimento) {
        super(nome, locomocao, peso, comprimento);
    }

    @Override
    public void som() {
        System.out.println("cocoricooo");
    }
}
