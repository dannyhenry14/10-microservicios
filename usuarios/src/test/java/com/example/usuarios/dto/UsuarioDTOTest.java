package com.example.usuarios.dto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UsuarioDTOTest {

    @Test
    void testUsuarioDTO() {
        UsuarioDTO dto1 = new UsuarioDTO();
        dto1.setId(1L);
        dto1.setNombre("Juan");
        dto1.setCorreo("juan@email.com");

        UsuarioDTO dto2 = new UsuarioDTO(1L, "Juan", "juan@email.com");
        UsuarioDTO dto3 = new UsuarioDTO(2L, "Ana", "ana@email.com");

        assertEquals(1L, dto1.getId());
        assertEquals("Juan", dto1.getNombre());
        assertEquals("juan@email.com", dto1.getCorreo());

        assertEquals(dto1, dto2);
        assertNotEquals(dto1, dto3);
        assertEquals(dto1.hashCode(), dto2.hashCode());
        assertTrue(dto1.canEqual(dto2));
        assertFalse(dto1.canEqual("Otro Objeto"));

        assertNotNull(dto1.toString());
    }
}