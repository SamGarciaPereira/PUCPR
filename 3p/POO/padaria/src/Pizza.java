public class Pizza {
    private String sabor;

    public Pizza(String sabor){
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void mostrarMensagem(){
        System.out.println("Assando pizza sabor " + sabor);
    }
}
