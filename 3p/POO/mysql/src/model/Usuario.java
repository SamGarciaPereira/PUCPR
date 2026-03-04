package model;

public class Usuario {
    private int idUsuario;
    private String nome;
    private String senha;

    public Usuario(int idUsuario, String nome, String senha) {
        this.idUsuario = idUsuario;
        this.senha = senha;
        this.nome = nome;
    }

    public Usuario(String nome, String senha) {
        this.senha = senha;
        this.nome = nome;
    }

    public Usuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
