package com.example.libro.dto;

public class LibroDTO {
    private Long id;
    private String titulo;
    private String autor;
    private String isbn;
    private Double precio;

    // Constructor vacío (necesario para frameworks)
    public LibroDTO() {}

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }


    public LibroDTO(Long id, String titulo, String autor, String isbn, Double precio) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
    }
}