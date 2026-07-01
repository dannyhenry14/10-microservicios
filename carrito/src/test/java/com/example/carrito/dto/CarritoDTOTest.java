package com.example.carrito.dto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarritoDTOTest {

    @Test
    void testCarritoDTO() {
        CarritoDTO dto = new CarritoDTO();
        dto.setId(1L);
        dto.setUsuarioId(2L);
        dto.setLibroId(3L);
        dto.setCantidad(1);

        assertEquals(1L, dto.getId());
        assertEquals(2L, dto.getUsuarioId());
        assertEquals(3L, dto.getLibroId());
        assertEquals(1, dto.getCantidad());

        CarritoDTO igual = new CarritoDTO(1L, 2L, 3L, 1);
        CarritoDTO distinto = new CarritoDTO(9L, 9L, 9L, 9);

        assertEquals(dto, igual);
        assertEquals(dto.hashCode(), igual.hashCode());
        assertNotEquals(dto, distinto);
        assertNotNull(dto.toString());
        assertTrue(dto.canEqual(igual));
        assertFalse(dto.canEqual("String"));
    }
}