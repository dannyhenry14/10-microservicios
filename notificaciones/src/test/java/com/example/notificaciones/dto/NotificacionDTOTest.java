package com.example.notificaciones.dto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotificacionDTOTest {

    @Test
    void testNotificacionDTO() {
        NotificacionDTO dto1 = new NotificacionDTO();
        dto1.setId(1L);
        dto1.setUsuarioId(10L);
        dto1.setMensaje("Mensaje de prueba");

        NotificacionDTO dto2 = new NotificacionDTO(1L, 10L, "Mensaje de prueba");
        NotificacionDTO dto3 = new NotificacionDTO(2L, 20L, "Otro mensaje");

        assertEquals(1L, dto1.getId());
        assertEquals(10L, dto1.getUsuarioId());
        assertEquals("Mensaje de prueba", dto1.getMensaje());

        assertEquals(dto1, dto2);
        assertNotEquals(dto1, dto3);
        assertEquals(dto1.hashCode(), dto2.hashCode());

        assertNotNull(dto1.toString());
        assertTrue(dto1.canEqual(dto2));
    }
}