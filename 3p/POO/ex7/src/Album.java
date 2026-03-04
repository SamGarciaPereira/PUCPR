public class Album {
    private String genero;
    private int ano;
    private String nome;
    private Pessoa artista;
    private Musica musica;

    public String getGenero(){
        return this.genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public int getAno(){
        return this.ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getArtista(){
        return this.artista.getNome();
    }
    public void setArtista(Pessoa artista){
        this.artista = artista;
    }
    public String getMusica(){
        return this.musica.getTitulo();
    }
    public void setMusica(Musica musica){
        this.musica = musica;
    }

    public void mostrarTodosOsDados(){
        System.out.println("Genero:  " + this.genero);
        System.out.println("Ano:  " + this.ano);
        System.out.println("Nome do Album:  " + this.nome);
        System.out.println("Nome do Artista:  " + this.artista.getNome());
        System.out.println("Musica:  " + this.musica.getTitulo());
        System.out.println("Duracao:  " + this.musica.getDuracao());

    }
}
