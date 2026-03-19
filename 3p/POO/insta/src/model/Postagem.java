package model;

import java.time.LocalDateTime;

public class Postagem {
    private int idPostagem;
    private String texto;
    private LocalDateTime dataPostagem;
    private Usuario u;

    public Postagem(int idPostagem, String texto, LocalDateTime dataPostagem, Usuario u) {
        this.idPostagem = idPostagem;
        this.texto = texto;
        this.dataPostagem = dataPostagem;
        this.u = u;
    }

    public Postagem(String texto, LocalDateTime dataPostagem, Usuario u) {
        this.texto = texto;
        this.dataPostagem = dataPostagem;
        this.u = u;
    }

    public int getIdPostagem() {
        return idPostagem;
    }

    public void setIdPostagem(int idPostagem) {
        this.idPostagem = idPostagem;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDateTime getDataPostagem() {
        return dataPostagem;
    }

    public void setDataPostagem(LocalDateTime dataPostagem) {
        this.dataPostagem = dataPostagem;
    }

    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }
}
