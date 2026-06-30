package com.example.libro.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LibroDTO {

    private Long id;
    private String titulo;
    private String autor;
    private String isbn;
    private Double precio;
}