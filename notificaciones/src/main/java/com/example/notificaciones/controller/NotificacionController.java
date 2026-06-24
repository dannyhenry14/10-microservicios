package com.example.notificaciones.controller;

import com.example.notificaciones.dto.NotificacionDTO;
import com.example.notificaciones.service.NotificacionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notificaciones")
public class NotificacionController {

    private final NotificacionService service;

    public NotificacionController(NotificacionService service) {
        this.service = service;
    }

    @GetMapping
    public List<NotificacionDTO> listar() {
        return service.listar();
    }

    @PostMapping
    public NotificacionDTO guardar(@RequestBody NotificacionDTO dto) {
        return service.guardar(dto);
    }
}
