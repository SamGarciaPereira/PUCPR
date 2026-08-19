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

    public static void quickSort(int[] numeros, int inicio, int fim){
        if(inicio >= fim){
            return;
        }

        int pivo = numeros[fim];

        int ponteiroEsq = inicio;
        int ponteiroDir = fim;

        while(ponteiroEsq < ponteiroDir){
            while(numeros[ponteiroEsq] <= pivo && ponteiroEsq < ponteiroDir){
                ponteiroEsq++;
            }

            while(numeros[ponteiroDir] >= pivo && ponteiroDir > ponteiroEsq){
                ponteiroDir--;
            }

            troca(numeros, ponteiroEsq, ponteiroDir);
        }
        troca(numeros, ponteiroEsq, fim);

        quickSort(numeros, inicio, ponteiroEsq - 1);
        quickSort(numeros, ponteiroEsq + 1, fim);
    }

    public static void troca(int[] vetor, int p1, int p2){
        int temp = vetor[p1];
        vetor[p1] = vetor[p2];
        vetor[p2] = temp;
    }
}