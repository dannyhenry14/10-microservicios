package com.example.libro.dto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibroDTOTest {

    @Test
    void testLibroDTO() {
        LibroDTO dto1 = new LibroDTO();
        dto1.setId(1L);
        dto1.setTitulo("Test");
        dto1.setAutor("Autor");
        dto1.setIsbn("123");
        dto1.setPrecio(10.0);

        LibroDTO dto2 = new LibroDTO(1L, "Test", "Autor", "123", 10.0);
        LibroDTO dto3 = new LibroDTO(2L, "Otro", "Otro", "456", 20.0);

        assertEquals(1L, dto1.getId());
        assertEquals("Test", dto1.getTitulo());
        assertEquals("Autor", dto1.getAutor());
        assertEquals("123", dto1.getIsbn());
        assertEquals(10.0, dto1.getPrecio());

        assertEquals(dto1, dto2);
        assertNotEquals(dto1, dto3);
        assertEquals(dto1.hashCode(), dto2.hashCode());

        assertNotNull(dto1.toString());
        assertTrue(dto1.canEqual(dto2));
    }
}