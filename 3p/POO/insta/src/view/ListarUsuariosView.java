package view;

import model.Usuario;

import java.util.ArrayList;

public class ListarUsuariosView {
    public ListarUsuariosView(){

    }
    public void listarUsuarios(ArrayList<Usuario> lista){
        System.out.println("***USUÁRIOS***");
        for(int i = 0; i < lista.size(); i++){
            System.out.println("Id: " + lista.get(i).getIdUsuario());
            System.out.println("Nome: " + lista.get(i).getNome());
            System.out.println("Email: " + lista.get(i).getEmail());
            System.out.println("*******");

        }

    }
}
