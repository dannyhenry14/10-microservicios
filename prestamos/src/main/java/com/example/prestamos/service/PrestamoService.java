package com.example.prestamos.service;

import com.example.prestamos.dto.PrestamoDTO;
import com.example.prestamos.repository.PrestamoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PrestamoService {

    private final PrestamoRepository repository;

    public PrestamoService(PrestamoRepository repository) {
        this.repository = repository;
    }

    public List<PrestamoDTO> listar() {
        return repository.findAll()
                .stream()
                .map(p -> new PrestamoDTO(
                        p.getId(),
                        p.getUsuarioId(),
                        p.getLibroId()))
                .collect(Collectors.toList());
    }
}