public class Main {
    public static void main(String[] args) {
        int contador = 1;

        Personagem p1 = new Personagem("Aragorn", 10, "Guerreiro");
        System.out.print("[" + contador++ + "] "); p1.desenha();

        Personagem p2 = new Personagem("Gandalf", 15, "Mago");
        System.out.print("[" + contador++ + "] "); p2.desenha();

        p1.subir_nivel(5);
        System.out.print("[" + contador++ + "] "); p1.desenha();

        p2.troca_classe(p1);
        System.out.print("[" + contador++ + "] "); p2.desenha();
        System.out.print("[" + contador++ + "] "); p1.desenha();
    }
}