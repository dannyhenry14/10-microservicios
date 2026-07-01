package com.example.notificaciones.controller;

import com.example.notificaciones.dto.NotificacionDTO;
import com.example.notificaciones.service.NotificacionService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(NotificacionController.class)
public class NotificacionControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private NotificacionService notificacionService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void listarTest() throws Exception {
        when(notificacionService.listar()).thenReturn(Collections.emptyList());

        mockMvc.perform(get("/notificaciones"))
                .andExpect(status().isOk());

        verify(notificacionService, times(1)).listar();
    }

    @Test
    void guardarTest() throws Exception {
        NotificacionDTO dto = new NotificacionDTO();

        mockMvc.perform(post("/notificaciones")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(dto)))
                .andExpect(status().isOk());

        verify(notificacionService, times(1)).guardar(any(NotificacionDTO.class));
    }
}