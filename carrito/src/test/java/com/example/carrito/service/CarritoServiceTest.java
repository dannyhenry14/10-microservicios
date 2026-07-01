package com.example.carrito.service;

import com.example.carrito.model.Carrito;
import com.example.carrito.repository.CarritoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CarritoServiceTest {

    @Mock
    private CarritoRepository carritoRepository;

    @InjectMocks
    private CarritoService carritoService;

    @Test
    void testListar() {
        when(carritoRepository.findAll()).thenReturn(Collections.emptyList());

        List<Carrito> resultado = carritoService.listar();

        assertNotNull(resultado);
        verify(carritoRepository, times(1)).findAll();
    }

    @Test
    void testGuardar() {
        Carrito carrito = new Carrito();
        when(carritoRepository.save(any(Carrito.class))).thenReturn(carrito);

        Carrito resultado = carritoService.guardar(carrito);

        assertNotNull(resultado);
        verify(carritoRepository, times(1)).save(carrito);
    }
}