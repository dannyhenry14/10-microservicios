package com.example.libro.service;

import com.example.libro.model.Libro;
import com.example.libro.repository.LibroRepository;
import com.example.libro.dto.LibroDTO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class LibroServiceTest {

    @Mock
    private LibroRepository libroRepository;

    @InjectMocks
    private LibroService libroService;

    @Test
    void listarTest() {
        Libro libro = new Libro(1L, "Java", "Autor", "123", 20.0);
        when(libroRepository.findAll()).thenReturn(List.of(libro));


        List<LibroDTO> resultado = libroService.listar();


        assertNotNull(resultado);
        assertEquals(1, resultado.size());
        assertEquals("Java", resultado.get(0).getTitulo());


        verify(libroRepository, times(1)).findAll();
    }
}