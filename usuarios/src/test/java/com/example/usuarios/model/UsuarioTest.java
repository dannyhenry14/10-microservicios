package com.example.usuarios.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void testUsuario() {
        Usuario u1 = new Usuario();
        u1.setId(1L);
        u1.setNombre("Juan");
        u1.setCorreo("juan@email.com");

        Usuario u2 = new Usuario(1L, "Juan", "juan@email.com");
        Usuario u3 = new Usuario(2L, "Ana", "ana@email.com");

        assertEquals(1L, u1.getId());
        assertEquals("Juan", u1.getNombre());
        assertEquals("juan@email.com", u1.getCorreo());

        assertEquals(u1, u2);
        assertNotEquals(u1, u3);
        assertEquals(u1.hashCode(), u2.hashCode());
        assertTrue(u1.canEqual(u2));
        assertFalse(u1.canEqual("Otro objeto"));

        assertNotNull(u1.toString());
    }
}