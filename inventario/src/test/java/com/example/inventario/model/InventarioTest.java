package com.example.inventario.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InventarioTest {

    @Test
    void testModelo() {
        Inventario i1 = new Inventario();
        i1.setId(1L);
        i1.setLibroId(10L);
        i1.setCantidad(5);

        Inventario i2 = new Inventario(1L, 10L, 5);
        Inventario i3 = new Inventario(2L, 20L, 2);

        assertEquals(1L, i1.getId());
        assertEquals(10L, i1.getLibroId());
        assertEquals(5, i1.getCantidad());

        assertEquals(i1, i2);
        assertNotEquals(i1, i3);

        assertEquals(i1.hashCode(), i2.hashCode());
        assertNotNull(i1.toString());
        assertTrue(i1.canEqual(i2));
    }
}