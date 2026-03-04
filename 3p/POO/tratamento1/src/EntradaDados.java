import java.util.Scanner;

public class EntradaDados {
    public double leNumeros() throws NullPointerException, Exception{
        Scanner s = new Scanner(System.in);
        double num = s.nextDouble();
        return num;
    }
}
