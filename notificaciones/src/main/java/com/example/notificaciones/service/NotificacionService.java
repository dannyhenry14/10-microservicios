package com.example.notificaciones.service;

import com.example.notificaciones.dto.NotificacionDTO;
import com.example.notificaciones.model.Notificacion;
import com.example.notificaciones.repository.NotificacionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NotificacionService {

    private final NotificacionRepository repo;

    public NotificacionService(NotificacionRepository repo) {
        this.repo = repo;
    }

    public List<NotificacionDTO> listar() {
        return repo.findAll().stream().map(n ->
                new NotificacionDTO(n.getId(), n.getUsuarioId(), n.getMensaje())
        ).collect(Collectors.toList());
    }

    public NotificacionDTO guardar(NotificacionDTO dto) {
        Notificacion n = new Notificacion(null, dto.getUsuarioId(), dto.getMensaje());
        Notificacion guardado = repo.save(n);
        return new NotificacionDTO(guardado.getId(), guardado.getUsuarioId(), guardado.getMensaje());
    }
}
