import java.util.ArrayList;

public class Buffet {
    private Casal casal;
    private ArrayList<Prato> prato;

    public Buffet(Casal casal) {
        this.casal = casal;
        this.prato = new ArrayList<Prato>();
    }

    public Casal getCasal() {
        return casal;
    }

    public ArrayList<Prato> getPrato() {
        return prato;
    }

    public void setCasal(Casal casal) {
        this.casal = casal;
    }

    public void setPrato(ArrayList<Prato> prato) {
        this.prato = prato;
    }

    public void adicionarPrato(Prato prato) {
        this.prato.add(prato);
    }

    public void exibirBuffet() {
        System.out.println("Detalhes do buffet:");
        System.out.println("Casal: " + this.casal.getPessoa1().getNome() + this.casal.getPessoa2().getNome());
        for (int i = 0; i < prato.size(); i++) {
            System.out.println(this.prato.get(i).getNome() + " - Tipo:" + this.prato.get(i).getTipo());
        }
    }
}
