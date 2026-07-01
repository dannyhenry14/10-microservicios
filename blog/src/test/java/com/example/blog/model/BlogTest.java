package com.example.blog.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BlogTest {

    @Test
    void testBlogMethods() {
        Blog b1 = new Blog();
        b1.setId(1L);
        b1.setTitulo("Test");
        b1.setContenido("Contenido");

        Blog b2 = new Blog(1L, "Test", "Contenido");

        assertEquals(b1.getId(), b2.getId());
        assertEquals(b1.getTitulo(), b2.getTitulo());
        assertEquals(b1.getContenido(), b2.getContenido());

        // Esto dispara los métodos equals, hashCode y toString
        assertNotNull(b1.toString());
        assertTrue(b1.equals(b2));
        assertEquals(b1.hashCode(), b2.hashCode());
    }
}