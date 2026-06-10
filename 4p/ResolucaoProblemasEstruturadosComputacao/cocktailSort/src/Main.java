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

        cocktailSort(numeros, tamanho);

        System.out.println("Depois:");
        imprimeVetor(numeros, tamanho);


    }

    public static void cocktailSort(int[] vetor, int tamanho){
        boolean alterou = true;
        int inicio = 0;
        int fim = tamanho - 1;
        int temp;

        while(alterou){
            alterou = false;
            for(int i = inicio; i < fim; i++){
                if(vetor[i] > vetor[i+1]){
                    alterou = true;
                    temp = vetor [i];
                    vetor[i] = vetor[i+1];
                    vetor[i+1] = temp;
                }
            }

            if(!alterou){
                break;
            }

            alterou = false;
            fim--;

            for(int i  = fim; i > inicio; i--){
                if(vetor[i] < vetor[i-1]){
                    alterou = true;
                    temp = vetor[i];
                    vetor[i] = vetor[i-1];
                    vetor[i-1] = temp;
                }
            }
            inicio++;
        }
    }

    public static void imprimeVetor(int[] vetor, int tamanho){
        for(int i = 0; i < tamanho; i++){
            System.out.println(vetor[i]);
        }
    }
}