import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme("Forrest Gump", "Drama", 1994));
        filmes.add(new Filme("O Regresso", "Aventura", 2015));
        filmes.add(new Filme("Bird Box", "Terror", 2018));
        filmes.add(new Filme("Interstellar", "Sci-fi", 2014));
        filmes.add(new Filme("2012", "Sci-fi", 2009));

        for(int i = 0; i < filmes.size(); i++){
            System.out.println(filmes.get(i).getTitulo());
            System.out.println(filmes.get(i).getGenero());
            System.out.println(filmes.get(i).getAnoLancamento());
            System.out.println("======================");
        }

    }
}