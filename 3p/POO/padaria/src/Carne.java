public class Carne {
    private String corte;

    public Carne(String corte){
        this.corte = corte;
    }

    public String getCorte(){
        return corte;
    }

    public void setCorte(String corte){
        this.corte = corte;
    }
    public void mostrarMensagem(){
        System.out.println("Assando carne corte " + corte);
    }
}
