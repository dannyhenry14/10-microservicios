package com.example.inventario.service;

import com.example.inventario.model.Inventario;
import com.example.inventario.repository.InventarioRepository;
import com.example.inventario.dto.InventarioDTO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class InventarioServiceTest {

    @Mock
    private InventarioRepository inventarioRepository;

    @InjectMocks
    private InventarioService inventarioService;

    @Test
    void listarTest() {
        Inventario item = new Inventario(1L, 1L, 10);
        when(inventarioRepository.listar()).thenReturn(List.of(item));

        List<InventarioDTO> resultado = inventarioService.listar();

        assertNotNull(resultado);
        assertEquals(1, resultado.size());
        assertEquals(10, resultado.get(0).getCantidad());

        verify(inventarioRepository, times(1)).listar();
    }
}