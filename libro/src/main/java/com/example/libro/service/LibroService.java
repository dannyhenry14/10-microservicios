package com.example.libro.service;

import com.example.libro.dto.LibroDTO;
import com.example.libro.model.Libro;
import com.example.libro.repository.LibroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LibroService {

    private final LibroRepository repository;

    public LibroService(LibroRepository repository) {
        this.repository = repository;
    }

    public List<LibroDTO> listar() {
        // Usamos findAll() que es el estándar de JpaRepository
        return repository.findAll().stream()
                .map(this::convertirADTO)
                .collect(Collectors.toList());
    }

    private LibroDTO convertirADTO(Libro libro) {
        LibroDTO dto = new LibroDTO();
        dto.setId(libro.getId());
        dto.setTitulo(libro.getTitulo());
        dto.setAutor(libro.getAutor());
        dto.setIsbn(libro.getIsbn());
        dto.setPrecio(libro.getPrecio());
        return dto;
    }
}