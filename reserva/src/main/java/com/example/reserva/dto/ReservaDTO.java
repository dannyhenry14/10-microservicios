package com.example.reserva.dto;

public class ReservaDTO {

    private Long id;
    private Long usuarioId;
    private Long libroId;


    public ReservaDTO() {
    }


    public ReservaDTO(Long id, Long usuarioId, Long libroId) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.libroId = libroId;
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
}