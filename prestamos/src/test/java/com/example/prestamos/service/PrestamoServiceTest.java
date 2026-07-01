package com.example.prestamos.service;

import com.example.prestamos.dto.PrestamoDTO;
import com.example.prestamos.model.Prestamo;
import com.example.prestamos.repository.PrestamoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PrestamoServiceTest {

    @Mock
    private PrestamoRepository prestamoRepository;

    @InjectMocks
    private PrestamoService prestamoService;

    @Test
    void listarTest() {
        Prestamo p = new Prestamo();

        when(prestamoRepository.findAll()).thenReturn(List.of(p));

        List<PrestamoDTO> resultado = prestamoService.listar();

        assertNotNull(resultado);
        assertFalse(resultado.isEmpty());

        verify(prestamoRepository, times(1)).findAll();
    }
}