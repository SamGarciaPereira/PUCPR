import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Menu menu = new Menu();
        int opcao;

        do {
            menu.exibir();
            opcao = entrada.nextInt();
            entrada.nextLine();

            if (opcao == 1) {
                System.out.print("Base: ");
                String base = entrada.nextLine();
                System.out.print("Altura: ");
                String altura = entrada.nextLine();
                Area areaTriangulo = new Area(base, altura);
                System.out.println("Área do Triângulo: " + areaTriangulo.triangulo());

            } else if (opcao == 2) {
                System.out.print("Base: ");
                String base = entrada.nextLine();
                System.out.print("Altura: ");
                String altura = entrada.nextLine();
                Area areaQuadrado = new Area(base, altura);
                System.out.println("Área do Quadrado/Retângulo: " + areaQuadrado.quadrado());

            } else if (opcao == 9) {
                System.out.println("Encerrando...");
            } else {
                System.out.println("Opção inválida!");
            }

            System.out.println();

        } while (opcao != 9);

        entrada.close();
    }
}
