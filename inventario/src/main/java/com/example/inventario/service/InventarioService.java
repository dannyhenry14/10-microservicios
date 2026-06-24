package com.example.inventario.service;

import com.example.inventario.dto.InventarioDTO;
import com.example.inventario.repository.InventarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;

import java.util.stream.Collectors;

@Service
public class InventarioService {

    private final InventarioRepository repository;

    public InventarioService(InventarioRepository repository) {
        this.repository = repository;
    }

    public List<InventarioDTO> listar() {
        return repository.listar()
                .stream()
                .map(i -> new InventarioDTO(i.getLibroId(), i.getCantidad()))
                .collect(Collectors.toList());
    }
}