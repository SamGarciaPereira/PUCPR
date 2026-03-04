
public class Funcoes {
    public void imprimirPares(){
        for(int i = 0; i <= 100; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

    }

    public void imprimirImpares(){
        for(int i = 0; i <= 100; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public String inverterString(String texto) {
        String invertida = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida = invertida + texto.charAt(i);
        }
        return invertida;
    }

    public boolean verificaPrimo(int n){
        if(n <= 2){
            return false;
        }
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public void imprimirPrimos100(){
        for(int n = 2; n <= 100; n++){
            boolean primo = true;
            for(int d = 2; d <= n/2; d++){
                if(n % d == 0){
                    primo = false;
                    break;
                }
            }
            if(primo){
                System.out.println(n);
            }
        }
    }

    public void imprimirPrimosAteLimite(int limite){
        if(limite <= 2){
            System.out.print("Não existem primos menor que 2");
            return;
        }
        for(int n = 2; n <= limite; n++){
            boolean primo = true;
            for(int d = 2; d <= n/2; d++){
                if(n % d == 0){
                    primo = false;
                    break;
                }
            }
            if(primo){
                System.out.println(n);
            }
        }
    }

    public void imprimirParesAteLimite(int limite){
        for(int i = 0; i <= limite; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    public boolean verificarPalindromo(String palavra){
        String invertida = "";
        for(int i = palavra.length()-1; i>=0; i--){
            invertida += palavra.charAt(i);
        }
        if(palavra.equals(invertida)){
            return true;
        }else{
            return false;
        }
    }

    public int calculaFatorial(int n){
        int resultado = 1;
        for(int i = n; i>0; i--){
            resultado = resultado * i;
        }
        return resultado;
    }

    public void calcularFibonnaci(int n){
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        for(int i = 2; i < n; i++){
            int proximo = a + b;
            System.out.print(" " + proximo);
            a = b;
            b = proximo;
        }
    }
}
