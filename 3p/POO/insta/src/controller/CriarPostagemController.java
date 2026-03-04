package controller;

import dao.PostagemDAO;
import model.Postagem;
import view.CriarPostagemView;

public class CriarPostagemController {
    private CriarPostagemView cpv;

    public CriarPostagemController(){
        cpv = new CriarPostagemView();
        Postagem p = cpv.criarPostagem();
        PostagemDAO pDAO = new PostagemDAO();
        pDAO.criarPostagem(p);
    }
}
