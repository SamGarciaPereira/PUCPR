public class Pao {
    private String tipo;

    public Pao(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void mostrarMensagem(){
        System.out.println("Assando pão tipo " + tipo);
    }
}
