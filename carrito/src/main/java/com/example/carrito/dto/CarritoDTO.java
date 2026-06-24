package com.example.carrito.dto;

public class CarritoDTO {

    private Long id;
    private Long usuarioId;
    private Long libroId;
    private int cantidad;

    // Constructor vacío
    public CarritoDTO() {
    }

    // Constructor con parámetros
    public CarritoDTO(Long id, Long usuarioId, Long libroId, int cantidad) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.libroId = libroId;
        this.cantidad = cantidad;
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
