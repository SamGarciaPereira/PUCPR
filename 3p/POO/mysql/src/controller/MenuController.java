package controller;

import view.MenuView;

public class MenuController {
    private MenuView mv;

    public MenuController(){
        mv = new MenuView();


        int opcao = mv.menu();

        if(opcao == 1){
            new CadastrarUsuarioController();
        }else if(opcao == 2){
            new ListarUsuariosController();
        }else if(opcao == 3){
            new ListarUsuariosController();
            new DeletarUsuarioController();
        }else if(opcao == 4){
            new ListarUsuariosController();
            new AtualizarUsuarioController();
        }else{
            mv.opcaoIncorreta();
        }
    }
}
