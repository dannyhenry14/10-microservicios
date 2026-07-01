package com.example.notificaciones.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotificacionTest {

    @Test
    void testNotificacionModel() {
        Notificacion n1 = new Notificacion();
        n1.setId(1L);
        n1.setUsuarioId(10L);
        n1.setMensaje("Hola");

        Notificacion n2 = new Notificacion(1L, 10L, "Hola");
        Notificacion n3 = new Notificacion(2L, 20L, "Adios");

        assertEquals(1L, n1.getId());
        assertEquals(10L, n1.getUsuarioId());
        assertEquals("Hola", n1.getMensaje());

        assertEquals(n1, n2);
        assertNotEquals(n1, n3);
        assertEquals(n1.hashCode(), n2.hashCode());

        assertNotNull(n1.toString());
        assertTrue(n1.canEqual(n2));
    }
}