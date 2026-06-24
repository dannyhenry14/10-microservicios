package com.example.libro.service;


import com.example.libro.dto.LibroDTO;
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
        return repository.listar()
                .stream()
                .map(l -> new LibroDTO(l.getId(), l.getTitulo()))
                .collect(Collectors.toList());
    }
}
