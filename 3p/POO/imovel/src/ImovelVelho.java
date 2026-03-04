public class ImovelVelho extends Imovel{

    public ImovelVelho(float valor) {
        super(valor);
    }

    public double getValorDepreciado() {
        return getValor() * 0.90;
    }
    public void imprimirValorVelho(){
        System.out.println("Valor atualizado (velho): " + getValorDepreciado());
    }
}
