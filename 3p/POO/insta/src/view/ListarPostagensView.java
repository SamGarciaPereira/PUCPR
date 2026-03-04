package view;

import model.Postagem;

import java.util.ArrayList;
import java.util.Scanner;

public class ListarPostagensView {
    private Scanner sc;

    public ListarPostagensView(){
        this.sc = new Scanner(System.in);
    }
    public int pedirIdUsuario() {
        System.out.print("Digite o ID do usuário: ");
        return sc.nextInt();
    }
    public void listarPostagens(ArrayList<Postagem> lista){
        System.out.println("***LISTAR POSTAGENS***");
        for(int i = 0; i < lista.size(); i++){
            Postagem p = lista.get(i);
            System.out.println("ID da postagem: " + lista.get(i).getIdPostagem());
            System.out.println("Texto da postagem: " + lista.get(i).getTexto());
            System.out.println("Data da postagem: " + lista.get(i).getDataPostagem());
            System.out.println("*******");
        }
    }
}
