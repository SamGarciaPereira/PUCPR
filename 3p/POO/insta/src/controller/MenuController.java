package controller;

import view.MenuView;

public class MenuController {
    private MenuView mv;

    public MenuController(){
        mv = new MenuView();


        int opcao = mv.menu();

        if(opcao == 1){
            new CriarUsuarioController();
        }else if(opcao == 2){
            new ListarUsuariosController();
        }else if(opcao == 3){
            new ListarUsuariosController();
            new CriarPostagemController();
        }else if(opcao == 4){
            new ListarPostagensController();
        }else if(opcao == 5) {
            new ListarPostagensController();
            new DeletarPostagemController();
        }else if(opcao == 6){
            new ListarUsuariosController();
            new AtualizarUsuarioController();
        }else{
            mv.opcaoIncorreta();
        }
    }
}
