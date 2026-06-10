import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random r = new Random();
        int tamanho = 10;
        int[] numeros = new int[tamanho];

        for(int i = 0; i < tamanho; i++){
            numeros[i] = r.nextInt(100);
        }

        System.out.println("Antes:");
        imprimeVetor(numeros, tamanho);

        bubbleSort(numeros, tamanho);

        System.out.println("Depois:");
        imprimeVetor(numeros, tamanho);
    }

    public static void bubbleSort(int[] numeros, int tamanho){
        boolean trocouAlgo = true;

        while(trocouAlgo){
            trocouAlgo = false;

            for(int i = 0; i < tamanho - 1; i++){
                if(numeros[i] > numeros[i + 1]){
                    trocouAlgo = true;
                    int temp = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = temp;
                }
            }
        }
    }


    public static void imprimeVetor(int[] numeros, int tamanho){
        for(int i = 0; i < tamanho; i++){
            System.out.println(numeros[i]);
        }
    }
}
