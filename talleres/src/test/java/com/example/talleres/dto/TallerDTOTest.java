package com.example.talleres.dto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TallerDTOTest {

    @Test
    void testTallerDTO() {
        TallerDTO dto1 = new TallerDTO();
        TallerDTO dto2 = new TallerDTO(1L, "Taller de Java", "Descripción");
        TallerDTO dto3 = new TallerDTO(2L, "Taller de Spring", "Descripción");

        dto1.setId(1L);
        dto1.setNombre("Taller de Java");
        dto1.setDescripcion("Descripción");

        assertEquals(1L, dto1.getId());
        assertEquals("Taller de Java", dto1.getNombre());
        assertEquals("Descripción", dto1.getDescripcion());

        assertEquals(dto1, dto2);
        assertNotEquals(dto1, dto3);
        assertEquals(dto1.hashCode(), dto2.hashCode());
        assertTrue(dto1.canEqual(dto2));
        assertFalse(dto1.canEqual("Otro objeto"));

        assertNotNull(dto1.toString());
    }
}