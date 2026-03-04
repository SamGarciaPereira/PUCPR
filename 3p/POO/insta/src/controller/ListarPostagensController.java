package controller;

import dao.PostagemDAO;
import view.ListarPostagensView;
import model.Postagem;
import java.util.ArrayList;

public class ListarPostagensController {
    private ListarPostagensView lpv;

    public ListarPostagensController() {
        lpv = new ListarPostagensView();
        PostagemDAO pDAO = new PostagemDAO();
        int idUsuario = lpv.pedirIdUsuario();
        ArrayList<Postagem> lista = pDAO.listarPostagens(idUsuario);
        lpv.listarPostagens(lista);
    }
}
