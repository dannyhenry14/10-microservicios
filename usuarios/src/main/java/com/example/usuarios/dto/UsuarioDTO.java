package com.example.usuarios.dto;

public class UsuarioDTO {

    private Long id;
    private String nombre;

    // 1. Constructor sin argumentos (¡Obligatorio!)
    public UsuarioDTO() {
    }

    // 2. Constructor con argumentos (El que te está pidiendo la línea 21 del Service)
    public UsuarioDTO(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // 3. Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}