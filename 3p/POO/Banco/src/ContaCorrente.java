public class ContaCorrente extends Conta{
    private double taxaManutencao;

    public ContaCorrente(Conta conta){
        super(conta.getNumeroConta(), conta.getSaldo(), conta.getDataAbertura(), conta.getTitular());
        this.taxaManutencao = 1.15;
    }

    public void debitarTaxaManutencao(){
        this.setSaldo(this.getSaldo() * this.taxaManutencao);
    }



}
