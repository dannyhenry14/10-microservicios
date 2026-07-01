package com.example.libro.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibroTest {

    @Test
    void testLibroModel() {
        Libro l1 = new Libro();
        l1.setId(1L);
        l1.setTitulo("Java");
        l1.setAutor("Oracle");
        l1.setIsbn("12345");
        l1.setPrecio(29.99);


        Libro l2 = new Libro(1L, "Java", "Oracle", "12345", 29.99);
        Libro l3 = new Libro(2L, "Python", "Guido", "67890", 39.99);


        assertEquals(1L, l1.getId());
        assertEquals("Java", l1.getTitulo());
        assertEquals("Oracle", l1.getAutor());
        assertEquals("12345", l1.getIsbn());
        assertEquals(29.99, l1.getPrecio());

        assertEquals(l1, l2);
        assertNotEquals(l1, l3);
        assertEquals(l1.hashCode(), l2.hashCode());

        assertNotNull(l1.toString());
        assertTrue(l1.canEqual(l2));
    }
}