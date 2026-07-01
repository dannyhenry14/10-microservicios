package com.example.carrito.controller;

import com.example.carrito.model.Carrito;
import com.example.carrito.service.CarritoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(CarritoController.class)
class CarritoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CarritoService carritoService;

    @Test
    void testListar() throws Exception {
        when(carritoService.listar()).thenReturn(Collections.emptyList());

        mockMvc.perform(get("/carrito"))
                .andExpect(status().isOk());
    }

    @Test
    void testGuardar() throws Exception {
        Carrito carrito = new Carrito();
        String json = "{\"id\":1}";

        mockMvc.perform(post("/carrito")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(status().isOk());
    }
}