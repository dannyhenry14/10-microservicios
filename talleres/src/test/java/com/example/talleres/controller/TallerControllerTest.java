package com.example.talleres.controller;

import com.example.talleres.dto.TallerDTO;
import com.example.talleres.service.TallerService;
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
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(TallerController.class)
public class TallerControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TallerService tallerService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void listarTest() throws Exception {
        when(tallerService.listar()).thenReturn(Collections.emptyList());

        mockMvc.perform(get("/talleres")) // Asegúrate de que esta sea tu ruta real
                .andExpect(status().isOk());

        verify(tallerService, times(1)).listar();
    }

    @Test
    void guardarTest() throws Exception {
        TallerDTO dto = new TallerDTO();

        mockMvc.perform(post("/talleres")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(dto)))
                .andExpect(status().isOk());

        verify(tallerService, times(1)).guardar(any(TallerDTO.class));
    }
}