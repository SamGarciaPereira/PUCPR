import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Musica m1 = new Musica();
        Album a1 = new Album();

        System.out.print("Insira seu nome: ");
        String nome = input.nextLine();

        System.out.print("Insira sua idade: ");
        int idade = input.nextInt();

        Pessoa p1 = new Pessoa(nome, idade);

        m1.setTitulo("Paranoid");
        m1.setDuracao("2:57");

        a1.setNome("Black Sabbath");
        a1.setArtista(p1);
        a1.setAno(1970);
        a1.setGenero("Rock");
        a1.setMusica(m1);

        a1.mostrarTodosOsDados();

    }
}