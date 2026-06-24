package com.example.talleres.service;

import com.example.talleres.dto.TallerDTO;
import com.example.talleres.model.Taller;
import com.example.talleres.repository.TallerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TallerService {

    private final TallerRepository repo;

    public TallerService(TallerRepository repo) {
        this.repo = repo;
    }

    public List<TallerDTO> listar() {
        return repo.findAll().stream().map(t ->
                new TallerDTO(
                        t.getId(),
                        t.getNombre(),
                        t.getDescripcion()
                )
        ).collect(Collectors.toList());
    }

    public TallerDTO guardar(TallerDTO dto) {
        Taller taller = new Taller(
                null,
                dto.getNombre(),
                dto.getDescripcion()
        );

        Taller guardado = repo.save(taller);

        return new TallerDTO(
                guardado.getId(),
                guardado.getNombre(),
                guardado.getDescripcion()
        );
    }
}
