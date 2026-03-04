public class ContaBancaria {
    int nroConta;
    int agencia;
    Cartao cartao;

    public ContaBancaria(int nroConta, int agencia) {
        cartao = new Cartao();
        this.nroConta = nroConta;
        this.agencia = agencia;
    }

    public void mostrarTodasInformacoes(){
        System.out.println(nroConta);
        System.out.println(agencia);
        System.out.println(cartao.nroCartao);

    }
}
