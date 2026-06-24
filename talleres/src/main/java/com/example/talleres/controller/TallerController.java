package com.example.talleres.controller;

import com.example.talleres.dto.TallerDTO;
import com.example.talleres.service.TallerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/talleres")
public class TallerController {

    private final TallerService service;

    public TallerController(TallerService service) {
        this.service = service;
    }

    @GetMapping
    public List<TallerDTO> listar() {
        return service.listar();
    }

    @PostMapping
    public TallerDTO guardar(@RequestBody TallerDTO dto) {
        return service.guardar(dto);
    }
}
