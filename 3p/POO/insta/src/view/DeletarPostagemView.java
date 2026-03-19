package view;

import dao.PostagemDAO;
import model.Postagem;

import java.util.Scanner;

public class DeletarPostagemView {
    private Scanner sc;
    private PostagemDAO pDAO;

    public DeletarPostagemView(){
        this.sc = new Scanner(System.in);
        this.pDAO = new PostagemDAO();
    }

    public void deletarPostagem(){
        System.out.println("***DELETAR POSTAGEM***");
        System.out.print("Informe o ID do usuário: ");
        int idUsuario = sc.nextInt();

        System.out.print("Informe o ID da postagem que deseja deletar: ");
        int idPostagem = sc.nextInt();

        boolean sucesso = pDAO.deletarPostagem(idUsuario, idPostagem);

        if (sucesso) {
            System.out.println("Postagem deletada com sucesso!");
        } else {
            System.out.println("Nenhuma postagem encontrada com esse ID para o usuário informado.");
        }
    }
}
