package view;

import model.Usuario;

import java.util.ArrayList;
import java.util.Scanner;

public class DeletarUsuarioView {
    private Scanner sc;
    public DeletarUsuarioView(){
        this.sc = new Scanner(System.in);
    }
    public Usuario deletarUsuario(){
        System.out.println("***DELETAR USUÁRIO***");
        System.out.print("Id: ");
        int deletado = sc.nextInt();
        return new Usuario(deletado);
    }

}
