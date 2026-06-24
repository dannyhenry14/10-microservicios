package com.example.reserva.controller;

import com.example.reserva.dto.ReservaDTO;
import com.example.reserva.service.ReservaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    private final ReservaService service;

    public ReservaController(ReservaService service) {
        this.service = service;
    }

    @GetMapping
    public List<ReservaDTO> listar() {
        return service.listar();
    }

    @PostMapping
    public ReservaDTO guardar(@RequestBody ReservaDTO dto) {
        return service.guardar(dto);
    }
}
