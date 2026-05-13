public class Main {
    public static void bubblesort(int tamanho, int []vetor) {
        int temp = 0;
        boolean flag;
        for(int i = 0; i < tamanho; i++){
            flag = false;
            for(int j = 1; j < tamanho-i; j++){
                if(vetor[j-1] > vetor [j]){

                    temp = vetor[j-1];
                    vetor[j-1] = vetor [j];
                    vetor[j] = temp;
                    flag = true;
                }
            }
            if(flag == false){
                break;
            }
        }
    }
}
