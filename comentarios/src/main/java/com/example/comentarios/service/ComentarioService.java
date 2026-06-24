package com.example.comentarios.service;

import com.example.comentarios.dto.ComentarioDTO;
import com.example.comentarios.model.Comentario;
import com.example.comentarios.repository.ComentarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ComentarioService {

    private final ComentarioRepository repo;

    public ComentarioService(ComentarioRepository repo) {
        this.repo = repo;
    }

    public List<ComentarioDTO> listar() {
        return repo.findAll().stream().map(c ->
                new ComentarioDTO(
                        c.getId(),
                        c.getUsuarioId(),
                        c.getLibroId(),
                        c.getTexto()
                )
        ).collect(Collectors.toList());
    }

    public ComentarioDTO guardar(ComentarioDTO dto) {
        Comentario comentario = new Comentario(
                null,
                dto.getUsuarioId(),
                dto.getLibroId(),
                dto.getTexto()
        );

        Comentario guardado = repo.save(comentario);

        return new ComentarioDTO(
                guardado.getId(),
                guardado.getUsuarioId(),
                guardado.getLibroId(),
                guardado.getTexto()
        );
    }
}
