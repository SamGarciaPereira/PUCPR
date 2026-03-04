public class ImovelNovo extends Imovel {

    public ImovelNovo(float valor) {
        super(valor);
    }

    public double getValorComAdicional() {
        return getValor() * 1.10;
    }

    public void imprimirValorNovo(){
        System.out.println("Valor atualizado (novo): " + getValorComAdicional());
    }

}
