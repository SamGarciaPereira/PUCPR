package view;

import java.util.Scanner;

public class MenuView {

    private Scanner sc;

    public MenuView(){
        sc = new Scanner(System.in);
    }

    public int menu(){

        System.out.println("***MENU***");
        System.out.println("(1) Cadastrar usuário");
        System.out.println("(2) Listar usuários");
        System.out.println("(3) Criar postagem");
        System.out.println("(4) Listar postagens de um usuário");
        System.out.println("(5) Deletar postagem");
        System.out.println("(6) Atualizar usuário");
        System.out.println("(9) Sair");

        System.out.print("Opção: ");
        return this.sc.nextInt();
    }

    public void opcaoIncorreta(){
        System.out.println("Opção Incorreta!");
    }
}
