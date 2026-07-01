package com.example.inventario.dto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InventarioDTOTest {

    @Test
    void testDTO() {
        InventarioDTO d1 = new InventarioDTO();
        d1.setId(1L);
        d1.setLibroId(10L);
        d1.setCantidad(5);

        InventarioDTO d2 = new InventarioDTO(1L, 10L, 5);
        InventarioDTO d3 = new InventarioDTO(2L, 20L, 2);

        assertEquals(1L, d1.getId());
        assertEquals(10L, d1.getLibroId());
        assertEquals(5, d1.getCantidad());

        assertEquals(d1, d2);
        assertNotEquals(d1, d3);

        assertEquals(d1.hashCode(), d2.hashCode());
        assertNotNull(d1.toString());
        assertTrue(d1.canEqual(d2));
    }
}