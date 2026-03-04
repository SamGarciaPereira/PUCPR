package view;

import model.Usuario;
import java.time.LocalDateTime;
import java.sql.Timestamp;

import java.util.Scanner;

public class CriarUsuarioView {
    private Scanner sc;

    public CriarUsuarioView(){
        this.sc = new Scanner(System.in);
    }
    public Usuario criarUsuario(){
        System.out.println("**CRIAR NOVO USUÁRIO**");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();

        return new Usuario(nome, email);
    }

}
