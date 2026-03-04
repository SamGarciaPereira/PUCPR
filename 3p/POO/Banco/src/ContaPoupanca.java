public class ContaPoupanca extends Conta{
    private double taxaRendimento;

    public ContaPoupanca(Conta conta) {
        super(conta.getNumeroConta(), conta.getSaldo(), conta.getDataAbertura(), conta.getTitular());
        this.taxaRendimento = 1.1;
    }

    public void debitarRendimento(){
        this.setSaldo(this.getSaldo() * this.taxaRendimento);
    }
}
