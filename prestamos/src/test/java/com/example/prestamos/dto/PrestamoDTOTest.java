package com.example.prestamos.dto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrestamoDTOTest {

    @Test
    void testPrestamoDTO() {
        PrestamoDTO dto1 = new PrestamoDTO();
        dto1.setId(1L);
        dto1.setUsuarioId(10L);
        dto1.setLibroId(20L);


        PrestamoDTO dto2 = new PrestamoDTO(1L, 10L, 20L);
        PrestamoDTO dto3 = new PrestamoDTO(2L, 22L, 30L);


        assertEquals(1L, dto1.getId());
        assertEquals(10L, dto1.getUsuarioId());
        assertEquals(20L, dto1.getLibroId());


        assertEquals(dto1, dto2);
        assertNotEquals(dto1, dto3);
        assertEquals(dto1.hashCode(), dto2.hashCode());


        assertNotNull(dto1.toString());
        assertTrue(dto1.canEqual(dto2));
    }
}