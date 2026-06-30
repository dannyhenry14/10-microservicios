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
        return repo.findAll().stream()
                .map(r -> {
                    ReservaDTO dto = new ReservaDTO();
                    dto.setId(r.getId());
                    dto.setUsuarioId(r.getUsuarioId());
                    dto.setLibroId(r.getLibroId());
                    return dto;
                })
                .collect(Collectors.toList());
    }


    public ReservaDTO guardar(ReservaDTO dto) {
        Reserva reserva = new Reserva();
        reserva.setUsuarioId(dto.getUsuarioId());
        reserva.setLibroId(dto.getLibroId());

        Reserva guardada = repo.save(reserva);

        ReservaDTO resultadoDto = new ReservaDTO();
        resultadoDto.setId(guardada.getId());
        resultadoDto.setUsuarioId(guardada.getUsuarioId());
        resultadoDto.setLibroId(guardada.getLibroId());

        return resultadoDto;
    }
}