package controller;

import dao.UsuarioDAO;
import model.Usuario;
import view.CadastrarUsuarioView;

public class CadastrarUsuarioController {

    private CadastrarUsuarioView cuv;

    public CadastrarUsuarioController(){
        cuv = new CadastrarUsuarioView();
        Usuario u = cuv.cadastrarUsuario();
        UsuarioDAO uDAO = new UsuarioDAO();
        uDAO.cadastrarUsuario(u);
    }
}
