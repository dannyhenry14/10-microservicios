package com.example.usuarios.service;

import com.example.usuarios.dto.UsuarioDTO;
import com.example.usuarios.model.Usuario;
import com.example.usuarios.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public List<UsuarioDTO> listar() {
        return repository.findAll().stream() // Usa findAll() aquí
                .map(u -> new UsuarioDTO(u.getId(), u.getNombre(), u.getCorreo()))
                .toList();
    }
}