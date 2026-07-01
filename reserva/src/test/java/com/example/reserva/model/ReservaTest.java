package com.example.reserva.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReservaTest {

    @Test
    void testReserva() {
        Reserva r1 = new Reserva();
        r1.setId(1L);
        r1.setUsuarioId(10L);
        r1.setLibroId(20L);

        Reserva r2 = new Reserva(1L, 10L, 20L);
        Reserva r3 = new Reserva(2L, 22L, 30L);

        assertEquals(1L, r1.getId());
        assertEquals(10L, r1.getUsuarioId());
        assertEquals(20L, r1.getLibroId());

        assertEquals(r1, r2);
        assertNotEquals(r1, r3);
        assertEquals(r1.hashCode(), r2.hashCode());
        assertTrue(r1.canEqual(r2));

        assertNotNull(r1.toString());
    }
}