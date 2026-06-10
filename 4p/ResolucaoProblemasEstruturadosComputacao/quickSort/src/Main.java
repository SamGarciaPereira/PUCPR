import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int tamanho = 10;
        int[] numeros = new int[tamanho];

        for (int i = 0; i < tamanho; i++){
            numeros[i] = r.nextInt(100);
        }

        System.out.println("Antes:");
        printArray(numeros, tamanho);

        quickSort(numeros, 0, tamanho - 1);

        System.out.println("Depois:");
        printArray(numeros, tamanho);

    }

    public static void printArray(int[] numeros, int tamanho){
        for(int i = 0; i < tamanho; i++){
            System.out.println(numeros[i]);
        }
    }

    public static void quickSort(int[] vetor, int inicio, int fim){
        if(inicio >= fim){
            return;
        }

        int pivo = vetor[fim];

        int ponteiroEsq = inicio;
        int ponteiroDir = fim;

        while(ponteiroEsq < ponteiroDir){
            while(vetor[ponteiroEsq] <= pivo && ponteiroEsq < ponteiroDir){
                ponteiroEsq++;
            }

            while(vetor[ponteiroDir] >= pivo && ponteiroDir > ponteiroEsq){
                ponteiroDir--;
            }

            troca(vetor, ponteiroEsq, ponteiroDir);
        }

        troca(vetor, ponteiroEsq, fim);

        quickSort(vetor, inicio, ponteiroEsq - 1);
        quickSort(vetor, ponteiroEsq + 1, fim);
    }

    private static void troca(int[] vetor, int index1, int index2){
        int temp = vetor[index1];
        vetor[index1] = vetor[index2];
        vetor[index2] = temp;
    }
}