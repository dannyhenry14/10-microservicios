package com.example.carrito.controller;

import com.example.carrito.model.Carrito;
import com.example.carrito.service.CarritoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carrito")
public class CarritoController {

    private final CarritoService service;

    public CarritoController(CarritoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Carrito> listar() {
        return service.listar();
    }

    @PostMapping
    public Carrito guardar(@RequestBody Carrito c) {
        return service.guardar(c);
    }
}
