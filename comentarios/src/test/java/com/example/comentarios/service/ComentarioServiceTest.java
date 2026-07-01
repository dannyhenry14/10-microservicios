package com.example.comentarios.service;

import com.example.comentarios.dto.ComentarioDTO;
import com.example.comentarios.model.Comentario;
import com.example.comentarios.repository.ComentarioRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ComentarioServiceTest {

    @Mock
    private ComentarioRepository comentarioRepository;

    @InjectMocks
    private ComentarioService comentarioService;

    @Test
    void listarTest() {
        when(comentarioRepository.findAll()).thenReturn(Collections.emptyList());

        List<ComentarioDTO> resultado = comentarioService.listar();

        assertNotNull(resultado);
        verify(comentarioRepository, times(1)).findAll();
    }

    @Test
    void guardarTest() {
        ComentarioDTO dto = new ComentarioDTO();
        Comentario comentarioSimulado = new Comentario();
        comentarioSimulado.setId(1L);

        when(comentarioRepository.save(any(Comentario.class))).thenReturn(comentarioSimulado);

        comentarioService.guardar(dto);

        verify(comentarioRepository, times(1)).save(any(Comentario.class));
    }
}