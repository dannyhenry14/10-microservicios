package com.example.prestamos.dto;

public class PrestamoDTO {

    private Long id;
    private Long usuarioId;
    private Long libroId;

    // Constructor vacío
    public PrestamoDTO() {
    }

    // Constructor con parámetros
    public PrestamoDTO(Long id, Long usuarioId, Long libroId) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.libroId = libroId;
    }

    // Getters y Setters
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
