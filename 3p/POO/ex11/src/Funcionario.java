public class Funcionario extends Pessoa {
    private double salario;
    private String dataContratacao;

    public Funcionario(int idade, double salario) {
        super(idade);
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "Funcionario { idade = " + getIdade() + ", salario = " + salario + " }";
    }
}
