package com.example.libro.dto;

public class LibroDTO {

    private Long id;
    private String titulo;
    private String autor;

    // Constructor vacío
    public LibroDTO() {
    }

    // NUEVO: Constructor con 2 parámetros (Resuelve el error del Service)
    public LibroDTO(Long id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    // Constructor con 3 parámetros
    public LibroDTO(Long id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}