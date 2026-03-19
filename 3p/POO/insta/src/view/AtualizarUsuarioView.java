package view;

import model.Usuario;

import java.util.Scanner;

public class AtualizarUsuarioView {
    private Scanner sc;

    public AtualizarUsuarioView(){
        this.sc = new Scanner(System.in);
    }
    public Usuario atualizarUsuario(){

        System.out.println("**ATUALIZAR USUÁRIO**");
        System.out.print("Insira o ID do usuário que deseja atualizar: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nome: ");
        String newNome = sc.nextLine();
        System.out.print("Email: ");
        String newEmail = sc.nextLine();
        return new Usuario(id, newNome, newEmail);
    }
}
