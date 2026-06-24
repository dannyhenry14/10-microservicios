package com.example.comentarios.controller;

import com.example.comentarios.dto.ComentarioDTO;
import com.example.comentarios.service.ComentarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {

    private final ComentarioService service;

    public ComentarioController(ComentarioService service) {
        this.service = service;
    }

    @GetMapping
    public List<ComentarioDTO> listar() {
        return service.listar();
    }

    @PostMapping
    public ComentarioDTO guardar(@RequestBody ComentarioDTO dto) {
        return service.guardar(dto);
    }
}
