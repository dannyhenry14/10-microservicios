package com.example.carrito.service;

import com.example.carrito.model.Carrito;
import com.example.carrito.repository.CarritoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarritoService {

    private final CarritoRepository repo;

    public CarritoService(CarritoRepository repo) {
        this.repo = repo;
    }

    public List<Carrito> listar() {
        return repo.findAll();
    }

    public Carrito guardar(Carrito c) {
        return repo.save(c);
    }
}
