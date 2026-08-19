import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random r = new Random();
        int tamanho = 10;
        int[] numeros = new int[tamanho];

        for(int i = 0; i < tamanho; i++){
            numeros[i] = r.nextInt(100);
        }

        System.out.println("Antes:");
        imprimeVetor(numeros, tamanho);

        selectionSort(numeros, tamanho);

        System.out.println("Depois:");
        imprimeVetor(numeros, tamanho);
    }

    public static void selectionSort(int[] numeros, int tamanho){
        
    }

    public static void troca(int[] vetor, int p1, int p2){
        int temp = vetor[p1];
        vetor[p1] = vetor[p2];
        vetor[p2] = temp;
    }

    public static void imprimeVetor(int[] numeros, int tamanho){
        for(int i = 0; i < tamanho; i++){
            System.out.println(numeros[i]);
        }
    }
}