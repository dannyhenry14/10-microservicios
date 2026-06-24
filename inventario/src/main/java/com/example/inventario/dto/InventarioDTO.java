package com.example.inventario.dto;

public class InventarioDTO {

    private Long id;
    private Long libroId;
    private int cantidad;

    // Constructor vacío
    public InventarioDTO() {
    }

    // NUEVO: Constructor con 2 parámetros (Resuelve el error del InventarioService)
    public InventarioDTO(Long id, int cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }

    // Constructor con 3 parámetros
    public InventarioDTO(Long id, Long libroId, int cantidad) {
        this.id = id;
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
