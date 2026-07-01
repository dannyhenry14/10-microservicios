package com.example.comentarios.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComentarioTest {

    @Test
    void testModel() {
        Comentario c1 = new Comentario();
        c1.setId(1L);
        c1.setUsuarioId(10L);
        c1.setLibroId(20L);
        c1.setTexto("Prueba");

        Comentario c2 = new Comentario(1L, 10L, 20L, "Prueba");

        assertEquals(1L, c1.getId());
        assertEquals(10L, c1.getUsuarioId());
        assertEquals(20L, c1.getLibroId());
        assertEquals("Prueba", c1.getTexto());

        assertEquals(c1, c2);
        assertEquals(c1.hashCode(), c2.hashCode());
        assertNotNull(c1.toString());
        assertTrue(c1.canEqual(c2));
    }
}