package view;

import model.Usuario;

import java.util.Scanner;

public class CadastrarUsuarioView {

    private Scanner sc;

    public CadastrarUsuarioView(){
        this.sc = new Scanner(System.in);
    }
    public Usuario cadastrarUsuario(){
        System.out.println("**CADASTRAR USUÁRIO**");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();

        return new Usuario(nome, senha);
    }
}
