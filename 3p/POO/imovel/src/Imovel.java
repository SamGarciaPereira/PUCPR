public class Imovel {
    private double valor;

    public Imovel(double valor){
        this.valor = valor;
    }
    public double getValor(){
        return this.valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }

    public void imprimirImovel(){
        System.out.println("Valor do imovel: " + valor);
    }

}
