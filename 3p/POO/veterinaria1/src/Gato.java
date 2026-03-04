public class Gato extends Animal{
    public Gato(String nome, String locomocao, double peso, double comprimento) {
        super(nome, locomocao, peso, comprimento);
    }

    @Override
    public void som() {
        System.out.println("miau");
    }
}
