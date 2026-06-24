package com.example.libro.controller;


import com.example.libro.dto.LibroDTO;
import com.example.libro.service.LibroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibroController {

    private final LibroService service;

    public LibroController(LibroService service) {
        this.service = service;
    }

    @GetMapping
    public List<LibroDTO> listar() {
        return service.listar();
    }
}
