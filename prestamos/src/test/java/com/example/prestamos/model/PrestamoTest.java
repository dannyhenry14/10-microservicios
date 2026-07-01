package com.example.prestamos.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrestamoTest {
    @Test
    void testPrestamo() {
        Prestamo p1 = new Prestamo(1L, 1L, 1L);
        Prestamo p2 = new Prestamo(1L, 1L, 1L);
        Prestamo p3 = new Prestamo(2L, 2L, 2L);

        assertEquals(p1, p2);
        assertNotEquals(p1, p3);
        assertEquals(p1.hashCode(), p2.hashCode());
        assertNotNull(p1.toString());

        p1.setId(99L);
        assertEquals(99L, p1.getId());
        assertTrue(p1.canEqual(p2));
    }
}