package com.example.comentarios.dto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComentarioDTOTest {

    @Test
    void testDTO() {
        ComentarioDTO dto1 = new ComentarioDTO();
        dto1.setId(1L);
        dto1.setUsuarioId(10L);
        dto1.setLibroId(20L);
        dto1.setTexto("Contenido");

        ComentarioDTO dto2 = new ComentarioDTO(1L, 10L, 20L, "Contenido");

        assertEquals(1L, dto1.getId());
        assertEquals(10L, dto1.getUsuarioId());
        assertEquals(20L, dto1.getLibroId());
        assertEquals("Contenido", dto1.getTexto());

        assertEquals(dto1, dto2);
        assertEquals(dto1.hashCode(), dto2.hashCode());
        assertNotNull(dto1.toString());
        assertTrue(dto1.canEqual(dto2));
    }
}