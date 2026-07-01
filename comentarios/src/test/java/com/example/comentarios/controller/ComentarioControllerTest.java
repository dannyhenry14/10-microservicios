package com.example.comentarios.controller;

import com.example.comentarios.dto.ComentarioDTO;
import com.example.comentarios.service.ComentarioService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(ComentarioController.class)
public class ComentarioControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ComentarioService comentarioService;

    @Test
    void listarTest() throws Exception {
        when(comentarioService.listar()).thenReturn(Collections.emptyList());

        mockMvc.perform(get("/comentarios"))
                .andExpect(status().isOk());

        verify(comentarioService, times(1)).listar();
    }

    @Test
    void guardarTest() throws Exception {
        String json = "{\"texto\":\"contenido\"}";

        mockMvc.perform(post("/comentarios")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(status().isOk());

        verify(comentarioService, times(1)).guardar(any(ComentarioDTO.class));
    }
}