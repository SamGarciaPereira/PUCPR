public class Musica {
    private String titulo;
    private String duracao;

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getDuracao(){
        return this.duracao;
    }
    public void setDuracao(String duracao){
        this.duracao = duracao;
    }

    public void tocarMusica(){
        System.out.println("Tocando música " + this.titulo);
    }
}
