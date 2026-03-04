public class Cachorro extends Animal{
    public Cachorro(String nome, String locomocao, double peso, double comprimento) {
        super(nome, locomocao, peso, comprimento);
    }

    @Override
    public void som() {
        System.out.println("auauau");
    }
}
