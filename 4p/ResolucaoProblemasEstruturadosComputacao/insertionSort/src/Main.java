import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int tamanho = 10;
        int[] numbers = new int[tamanho];

        for (int i = 0; i < tamanho; i++){
            numbers[i] = r.nextInt(100);
        }

        System.out.println("Antes:");
        printArray(numbers, tamanho);

        insertionSort(numbers, tamanho);

        System.out.println("Depois:");
        printArray(numbers, tamanho);

    }

    private static void printArray(int[] numbers, int tamanho){
        for(int i = 0; i < tamanho; i++){
            System.out.println(numbers[i]);
        }
    }

    private static void insertionSort(int[] inputArray, int tamanho){
        for (int i = 1; i < tamanho; i++){
            int currentValue = inputArray[i];

            int j = i - 1;
            while(j >= 0 && inputArray[j] > currentValue){
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j + 1] = currentValue;
        }
    }
}