import java.util.ArrayList;

public class Casamento {
    private Casal casal;
    private Buffet buffet;
    private ArrayList<Convidado> convidados;
    private String local;
    private String dataCasamento;
    private Pessoa padre;

    public Casamento(Casal casal, Buffet buffet, String local, String dataCasamento, Pessoa padre) {
        this.casal = casal;
        this.buffet = buffet;
        this.local = local;
        this.padre = padre;
        this.dataCasamento = dataCasamento;
        this.convidados = new ArrayList<Convidado>();
    }

    public Casal getCasal() {
        return casal;
    }

    public Buffet getBuffet() {
        return buffet;
    }

    public ArrayList<Convidado> getConvidados() {
        return convidados;
    }

    public String getLocal() {
        return local;
    }

    public Pessoa getPadre() {
        return padre;
    }

    public String getDataCasamento() {
        return dataCasamento;
    }

    public void setCasal(Casal casal) {
        this.casal = casal;
    }

    public void setBuffet(Buffet buffet) {
        this.buffet = buffet;
    }

    public void setConvidados(ArrayList<Convidado> convidados) {
        this.convidados = convidados;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setPadre(Pessoa padre) {
        this.padre = padre;
    }

    public void setDataCasamento(String dataCasamento) {
        this.dataCasamento = dataCasamento;
    }

    public void adicionarConvidado(Convidado convidado) {
        this.convidados.add(convidado);
    }

    public void exibirDetalhes() {
        System.out.println("Detalhes do Casamento:");
        System.out.println("Local: " + this.local);
        System.out.println("Data: " + this.dataCasamento);
        System.out.println("Padre: " + this.padre.getNome());
        System.out.println("Casal: " + casal.getPessoa1().getNome() + " e " + casal.getPessoa2().getNome());
        System.out.println("\nBuffet:");
        buffet.exibirBuffet();
        System.out.println("\nConvidados:");
        for (int i = 0; i < convidados.size(); i++) {
            Convidado convidado = convidados.get(i);
            String status = convidado.isConfirmouPresenca() ? "Confirmado" : "Não confirmado";
            System.out.println(convidado.getPessoa().getNome() + " - Email: " + convidado.getEmail() + " - Presença: " + status);
        }
    }
}
