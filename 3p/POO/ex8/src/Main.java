import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Gabrielly");
        nomes.add("Samuel");
        nomes.add("Marco");
        nomes.add("Manuela");
        nomes.add("Danielly");

        ArrayList<String> nomesDef = new ArrayList<>(nomes);

        int opcao = -1;
        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);
        while(opcao != 9){
            menu.imprimirMenu();
            opcao = input.nextInt();

            if (opcao == 1){
                Collections.sort(nomes);
                System.out.println(nomes);
            }else if(opcao == 2){
                System.out.println(nomesDef);
            }else if(opcao == 9){
                System.out.println("Encerrando...");
            }else{
                System.out.println("Opcão inválida!");
            }
        }
    }
}