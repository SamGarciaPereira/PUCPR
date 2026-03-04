import java.util.ArrayList;

public class Banco {
    private String nomeBanco;
    private Pessoa gerente;
    private ArrayList<ContaCorrente> listaContaCorrente;
    private ArrayList<ContaPoupanca> listaContaPoupanca;

    public Banco(String nomeBanco, Pessoa gerente){
        this.nomeBanco = nomeBanco;
        this.gerente = gerente;
        this.listaContaCorrente = new ArrayList<ContaCorrente>();
        this.listaContaPoupanca = new ArrayList<ContaPoupanca>();
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public Pessoa getGerente() {
        return gerente;
    }

    public void setGerente(Pessoa gerente) {
        this.gerente = gerente;
    }

    public ArrayList<ContaCorrente> getListaContaCorrente() {
        return listaContaCorrente;
    }

    public void setListaContaCorrente(ArrayList<ContaCorrente> listaContaCorrente) {
        this.listaContaCorrente = listaContaCorrente;
    }

    public ArrayList<ContaPoupanca> getListaContaPoupanca() {
        return listaContaPoupanca;
    }

    public void setListaContaPoupanca(ArrayList<ContaPoupanca> listaContaPoupanca) {
        this.listaContaPoupanca = listaContaPoupanca;
    }
}

