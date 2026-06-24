package com.example.reserva.service;

import com.example.reserva.dto.ReservaDTO;
import com.example.reserva.model.Reserva;
import com.example.reserva.repository.ReservaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReservaService {

    private final ReservaRepository repo;

    public ReservaService(ReservaRepository repo) {
        this.repo = repo;
    }

    public List<ReservaDTO> listar() {
        return repo.findAll().stream().map(r ->
                new ReservaDTO(r.getId(), r.getUsuarioId(), r.getLibroId())
        ).collect(Collectors.toList());
    }

    public ReservaDTO guardar(ReservaDTO dto) {
        Reserva reserva = new Reserva(null, dto.getUsuarioId(), dto.getLibroId());
        Reserva guardado = repo.save(reserva);
        return new ReservaDTO(guardado.getId(), guardado.getUsuarioId(), guardado.getLibroId());
    }
}
