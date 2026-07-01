package com.example.blog.controller;

import com.example.blog.dto.BlogDTO;
import com.example.blog.service.BlogService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(BlogController.class)
class BlogControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BlogService blogService;

    @Test
    void testObtenerTodos() throws Exception {
        when(blogService.obtenerTodos()).thenReturn(List.of(new BlogDTO()));

        mockMvc.perform(get("/blog"))
                .andExpect(status().isOk());
    }

    @Test
    void testCrear() throws Exception {
        when(blogService.guardar(any(BlogDTO.class))).thenReturn(new BlogDTO());

        mockMvc.perform(post("/blog")
                        .contentType(APPLICATION_JSON)
                        .content("{\"titulo\":\"Test\", \"contenido\":\"Contenido\"}"))
                .andExpect(status().isOk());
    }
}