public class Convidado {
    private Pessoa pessoa;
    private String email;
    private boolean confirmouPresenca;

    public Convidado(Pessoa pessoa, String email) {
        this.pessoa = pessoa;
        this.email = email;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }
    public String getEmail() {
        return this.email;
    }

    public boolean isConfirmouPresenca() {
        return confirmouPresenca;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setConfirmouPresenca() {
        this.confirmouPresenca = true;
    }
}
