package com.example.libro.model;

import jakarta.persistence.*;

@Entity
@Table(name = "libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String autor;
    private String isbn;
    private Double precio;

    // --- ESCRÍBELOS MANUALMENTE O GENÉRALOS CON INTELIJ ---
    public Long getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getIsbn() { return isbn; }
    public Double getPrecio() { return precio; }
    // ... agrega los setters si los necesitas más adelante
}