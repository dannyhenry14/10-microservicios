package com.example.usuarios.controller;

import com.example.usuarios.service.UsuarioService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(UsuarioController.class)
public class UsuarioControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UsuarioService usuarioService;

    @Test
    void listarTest() throws Exception {
        when(usuarioService.listar()).thenReturn(Collections.emptyList());

        mockMvc.perform(get("/usuarios")) // Asegúrate de que la ruta coincida con tu @RequestMapping
                .andExpect(status().isOk());

        verify(usuarioService, times(1)).listar();
    }
}