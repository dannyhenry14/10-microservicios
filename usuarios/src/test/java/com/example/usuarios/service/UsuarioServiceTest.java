package com.example.usuarios.service;

import com.example.usuarios.dto.UsuarioDTO;
import com.example.usuarios.model.Usuario;
import com.example.usuarios.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UsuarioServiceTest {

    @Mock
    private UsuarioRepository usuarioRepository;

    @InjectMocks
    private UsuarioService usuarioService;

    @Test
    void listarTest() {
        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("Test User");

        when(usuarioRepository.findAll()).thenReturn(List.of(usuario));

        List<UsuarioDTO> resultado = usuarioService.listar();

        assertNotNull(resultado);
        assertFalse(resultado.isEmpty());
        assertEquals(1, resultado.size());

        verify(usuarioRepository, times(1)).findAll();
    }
}