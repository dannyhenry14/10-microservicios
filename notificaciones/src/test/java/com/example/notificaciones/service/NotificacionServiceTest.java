package com.example.notificaciones.service;

import com.example.notificaciones.dto.NotificacionDTO;
import com.example.notificaciones.model.Notificacion;
import com.example.notificaciones.repository.NotificacionRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class NotificacionServiceTest {

    @Mock
    private NotificacionRepository notificacionRepository;

    @InjectMocks
    private NotificacionService notificacionService;

    @Test
    void guardarTest() {
        NotificacionDTO dto = new NotificacionDTO();
        Notificacion entidad = new Notificacion();

        when(notificacionRepository.save(any(Notificacion.class))).thenReturn(entidad);

        notificacionService.guardar(dto);

        verify(notificacionRepository, times(1)).save(any(Notificacion.class));
    }

    @Test
    void listarTest() {
        when(notificacionRepository.findAll()).thenReturn(List.of(new Notificacion()));

        List<NotificacionDTO> resultado = notificacionService.listar();

        assertNotNull(resultado);
        assertFalse(resultado.isEmpty());
        verify(notificacionRepository, times(1)).findAll();
    }
}