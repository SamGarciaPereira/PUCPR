import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Animal [] meusPets = new Animal[3];
        int opcao = -1;


        while(opcao != 9){
            System.out.println("===BEM VINDO A CLÍNICA VETERINÁRIA===");
            System.out.println("(1) CONSULTAR ANIMAL");
            System.out.println("(9) SAIR");
            System.out.print("INSIRA A OPÇÃO DESEJADA: ");
            opcao = input.nextInt();
            input.nextLine();
            if(opcao == 1){
                System.out.println("INSIRA O NOME DO SEU BICHINHO: ");
                String nomeAnimal = input.nextLine();
                System.out.println("INSIRA O MEIO DE LOCOMOÇÃO DO SEU BICHINHO: ");
                System.out.println("(1) ANDAR/CORRER");
                System.out.println("(2) VOAR");
                int opcaoLocomocao = input.nextInt();
                input.nextLine();
                if(opcaoLocomocao == 1){
                    System.out.println("Insira a opção desejada: ");
                    System.out.println("(1) Cachorro");
                    System.out.println("(2) Gato");
                    int opcaoQuatroPatas = input.nextInt();
                    if(opcaoQuatroPatas == 1){
                        System.out.println("Insira o peso do(a) " + nomeAnimal + ": ");
                        double pesoAnimal = input.nextDouble();
                        System.out.println("Insira o comprimento do(a) " + nomeAnimal + ": ");
                        double comprimentoAnimal = input.nextDouble();
                        meusPets[0] = new Cachorro(nomeAnimal, "Quatro Patas", pesoAnimal, comprimentoAnimal);
                    }else if(opcaoQuatroPatas == 2){
                        System.out.println("Insira o peso do(a) " + nomeAnimal + ": ");
                        double pesoAnimal = input.nextDouble();
                        System.out.println("Insira o comprimento do(a) " + nomeAnimal + ": ");
                        double comprimentoAnimal = input.nextDouble();
                        meusPets[1] = new Gato(nomeAnimal, "Quatro Patas", pesoAnimal, comprimentoAnimal);
                    }else{
                        System.out.println("Opção inválida, insira novamente:");
                    }
                }else if(opcaoLocomocao == 2){
                    System.out.println("Insira a opção desejada: ");
                    System.out.println("(1) Papagaio");
                    int opcaoVoador = input.nextInt();
                    input.nextLine();
                    if(opcaoVoador == 1){
                        System.out.println("Insira o peso do(a) " + nomeAnimal + ": ");
                        double pesoAnimal = input.nextDouble();
                        System.out.println("Insira o comprimento do(a) " + nomeAnimal + ": ");
                        double comprimentoAnimal = input.nextDouble();
                        meusPets[2] = new Papagaio(nomeAnimal, "Voador", pesoAnimal, comprimentoAnimal);
                    }
                }else{
                    System.out.println("Opção inválida, insira uma opção válida");
                }
                for(int i = 0; i < meusPets.length; i++){
                    if (meusPets[i] != null) { 
                        meusPets[i].som();
                    }
                }
            }else if(opcao == 9){
                System.out.println("Saindo...");
            }
        }


    }
}