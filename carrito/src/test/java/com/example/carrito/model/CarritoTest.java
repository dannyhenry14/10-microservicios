package com.example.carrito.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarritoTest {

    @Test
    void testCarrito() {
        Carrito c1 = new Carrito();
        c1.setId(1L);
        c1.setUsuarioId(2L);
        c1.setLibroId(3L);
        c1.setCantidad(1);

        assertEquals(1L, c1.getId());
        assertEquals(2L, c1.getUsuarioId());
        assertEquals(3L, c1.getLibroId());
        assertEquals(1, c1.getCantidad());

        Carrito c2 = new Carrito(1L, 2L, 3L, 1);

        assertEquals(c1, c2);
        assertEquals(c1.hashCode(), c2.hashCode());
        assertNotNull(c1.toString());
        assertTrue(c1.canEqual(c2));
        assertFalse(c1.canEqual("String"));
    }
}