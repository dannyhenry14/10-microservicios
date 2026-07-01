package com.example.talleres.service;

import com.example.talleres.dto.TallerDTO;
import com.example.talleres.model.Taller;
import com.example.talleres.repository.TallerRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TallerServiceTest {

    @Mock
    private TallerRepository repository;

    @InjectMocks
    private TallerService service;

    @Test
    void listarTest() {
        Taller taller = new Taller();
        when(repository.findAll()).thenReturn(List.of(taller));

        List<TallerDTO> resultado = service.listar();

        assertNotNull(resultado);
        assertFalse(resultado.isEmpty());
        verify(repository, times(1)).findAll();
    }

    @Test
    void guardarTest() {
        TallerDTO dto = new TallerDTO();
        Taller taller = new Taller();

        when(repository.save(any(Taller.class))).thenReturn(taller);

        TallerDTO resultado = service.guardar(dto);

        assertNotNull(resultado);
        verify(repository, times(1)).save(any(Taller.class));
    }
}