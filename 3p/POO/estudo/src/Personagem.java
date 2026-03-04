public class Personagem {
    private String nome;
    private int nivel;
    private String classe;

    public Personagem(String nome, int nivel, String classe) {
        this.nome = nome;
        this.nivel = nivel;
        this.classe = classe;
    }

    public void subir_nivel(int lvls) {
        this.nivel = this.nivel + lvls;
    }

    public void troca_classe(Personagem outro) {
        String classe_temp = this.classe;
        this.classe = outro.classe;
        outro.classe = classe_temp;
    }

    public void desenha() {
        System.out.println(nome + " [Nível: " + nivel + "] - Classe: " + classe);
    }
}