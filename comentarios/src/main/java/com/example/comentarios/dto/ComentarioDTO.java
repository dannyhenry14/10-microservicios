package com.example.comentarios.dto;

public class ComentarioDTO {

    private Long id;
    private Long usuarioId;
    private Long libroId;
    private String texto;


    public ComentarioDTO() {
    }


    public ComentarioDTO(Long id, Long usuarioId, Long libroId, String texto) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.libroId = libroId;
        this.texto = texto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Long getLibroId() {
        return libroId;
    }

    public void setLibroId(Long libroId) {
        this.libroId = libroId;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}