package view;

import model.Postagem;
import model.Usuario;

import java.time.LocalDateTime;
import java.util.Scanner;

public class CriarPostagemView {
    private Scanner sc;

    public CriarPostagemView(){
        this.sc = new Scanner(System.in);
    }
    public Postagem criarPostagem() {
        System.out.println("**PUBLICAR**");
        System.out.print("ID do usuário vinculado à postagem: ");
        int idUsuario = sc.nextInt();
        sc.nextLine();
        System.out.print("Texto da postagem: ");
        String texto = sc.nextLine();
        LocalDateTime dataPostagem = LocalDateTime.now();

        Usuario usuario = new Usuario(idUsuario);

        return new Postagem(texto, dataPostagem, usuario);
    }
}
