package com.example.blog.dto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BlogDTOTest {

    @Test
    void testBlogDTO() {
        BlogDTO dto = new BlogDTO();
        dto.setId(1L);
        dto.setTitulo("Titulo");
        dto.setContenido("Contenido");

        assertEquals(1L, dto.getId());
        assertEquals("Titulo", dto.getTitulo());
        assertEquals("Contenido", dto.getContenido());

        BlogDTO igual = new BlogDTO();
        igual.setId(1L);
        igual.setTitulo("Titulo");
        igual.setContenido("Contenido");

        BlogDTO distinto = new BlogDTO();
        distinto.setId(2L);

        assertTrue(dto.equals(igual));
        assertFalse(dto.equals(distinto));
        assertFalse(dto.equals(null));
        assertFalse(dto.equals("otra clase"));
        assertEquals(dto.hashCode(), igual.hashCode());
        assertNotNull(dto.toString());

        BlogDTO constructorDTO = new BlogDTO(1L, "Titulo", "Contenido");
        assertNotNull(constructorDTO);
    }
}