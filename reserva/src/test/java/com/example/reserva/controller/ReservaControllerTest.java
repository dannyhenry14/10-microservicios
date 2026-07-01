package com.example.reserva.controller;

import com.example.reserva.dto.ReservaDTO;
import com.example.reserva.service.ReservaService;
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

@WebMvcTest(ReservaController.class)
public class ReservaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ReservaService reservaService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void listarTest() throws Exception {
        when(reservaService.listar()).thenReturn(Collections.emptyList());

        mockMvc.perform(get("/reserva"))
                .andExpect(status().isOk());

        verify(reservaService, times(1)).listar();
    }

    @Test
    void guardarTest() throws Exception {
        ReservaDTO dto = new ReservaDTO();

        mockMvc.perform(post("/reserva")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(dto)))
                .andExpect(status().isOk());

        verify(reservaService, times(1)).guardar(any(ReservaDTO.class));
    }
}