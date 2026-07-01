package com.example.reserva.dto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReservaDTOTest {

    @Test
    void testReservaDTO() {
        ReservaDTO dto1 = new ReservaDTO();
        dto1.setId(1L);
        dto1.setUsuarioId(10L);
        dto1.setLibroId(20L);

        ReservaDTO dto2 = new ReservaDTO(1L, 10L, 20L);
        ReservaDTO dto3 = new ReservaDTO(2L, 22L, 30L);

        assertEquals(1L, dto1.getId());
        assertEquals(10L, dto1.getUsuarioId());
        assertEquals(20L, dto1.getLibroId());

        assertEquals(dto1, dto2);
        assertNotEquals(dto1, dto3);
        assertEquals(dto1.hashCode(), dto2.hashCode());
        assertTrue(dto1.canEqual(dto2));

        assertNotNull(dto1.toString());
    }
}