package com.example.prestamos.controller;

import com.example.prestamos.dto.PrestamoDTO;
import com.example.prestamos.service.PrestamoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prestamos")
public class PrestamoController {

    private final PrestamoService service;

    public PrestamoController(PrestamoService service) {
        this.service = service;
    }

    @GetMapping
    public List<PrestamoDTO> listar() {
        return service.listar();
    }
}
