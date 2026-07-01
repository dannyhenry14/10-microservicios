package com.example.reserva.service;

import com.example.reserva.dto.ReservaDTO;
import com.example.reserva.model.Reserva;
import com.example.reserva.repository.ReservaRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ReservaServiceTest {

    @Mock
    private ReservaRepository reservaRepository;

    @InjectMocks
    private ReservaService reservaService;

    @Test
    void listarTest() {
        Reserva r = new Reserva();
        when(reservaRepository.findAll()).thenReturn(List.of(r));

        List<ReservaDTO> resultado = reservaService.listar();

        assertNotNull(resultado);
        assertFalse(resultado.isEmpty());
        verify(reservaRepository, times(1)).findAll();
    }

    @Test
    void guardarTest() {
        ReservaDTO dto = new ReservaDTO();
        Reserva r = new Reserva();

        when(reservaRepository.save(any(Reserva.class))).thenReturn(r);

        ReservaDTO resultado = reservaService.guardar(dto);

        assertNotNull(resultado);
        verify(reservaRepository, times(1)).save(any(Reserva.class));
    }
}