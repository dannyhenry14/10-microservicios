package com.example.talleres.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TallerTest {

    @Test
    void testTaller() {
        Taller t1 = new Taller();
        t1.setId(1L);
        t1.setNombre("Java");
        t1.setDescripcion("Curso básico");

        Taller t2 = new Taller(1L, "Java", "Curso básico");
        Taller t3 = new Taller(2L, "Spring", "Curso avanzado");

        assertEquals(1L, t1.getId());
        assertEquals("Java", t1.getNombre());
        assertEquals("Curso básico", t1.getDescripcion());

        assertEquals(t1, t2);
        assertNotEquals(t1, t3);
        assertEquals(t1.hashCode(), t2.hashCode());
        assertTrue(t1.canEqual(t2));
        assertFalse(t1.canEqual("Otro Objeto"));

        assertNotNull(t1.toString());
    }
}