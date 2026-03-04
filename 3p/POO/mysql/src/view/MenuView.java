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
        System.out.println("(3) Deletar usuário");
        System.out.println("(4) Atualizar usuário");
        System.out.print("Opção: ");
        return this.sc.nextInt();
    }

    public void opcaoIncorreta(){
        System.out.println("Opção Incorreta!");
    }
}
