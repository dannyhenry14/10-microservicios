package com.example.blog.service;

import com.example.blog.dto.BlogDTO;
import com.example.blog.model.Blog;
import com.example.blog.repository.BlogRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
class BlogServiceTest {

    @Mock
    private BlogRepository repo;

    @InjectMocks
    private BlogService service;

    @Test
    void testObtenerTodos() {
        Blog blog = new Blog();
        blog.setId(1L);
        blog.setTitulo("Test");
        blog.setContenido("Contenido");

        when(repo.findAll()).thenReturn(List.of(blog));

        List<BlogDTO> resultado = service.obtenerTodos();

        assertEquals(1, resultado.size());
        assertEquals("Test", resultado.get(0).getTitulo());
    }

    @Test
    void testGuardar() {
        BlogDTO dto = new BlogDTO();
        dto.setTitulo("Nuevo Post");
        dto.setContenido("Contenido del post");

        Blog blogGuardado = new Blog();
        blogGuardado.setId(1L);
        blogGuardado.setTitulo("Nuevo Post");
        blogGuardado.setContenido("Contenido del post");

        when(repo.save(any(Blog.class))).thenReturn(blogGuardado);

        BlogDTO resultado = service.guardar(dto);

        assertEquals(1L, resultado.getId());
        assertEquals("Nuevo Post", resultado.getTitulo());
    }
}