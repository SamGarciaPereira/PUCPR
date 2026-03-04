package view;

import model.Usuario;

import java.util.ArrayList;

public class ListarUsuariosView {
    public ListarUsuariosView(){

    }
    public void listarUsuarios(ArrayList<Usuario> lista){

        System.out.println("***USUÁRIOS***");

        for(int i = 0; i < lista.size(); i++){

            System.out.println("ID: " + lista.get(i).getIdUsuario());
            System.out.println("Nome: " + lista.get(i).getNome());
            System.out.println("Senha: " + lista.get(i).getSenha());
            System.out.println("*******");

        }

    }

}
