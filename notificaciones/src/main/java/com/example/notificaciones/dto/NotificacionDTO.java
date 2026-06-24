package com.example.notificaciones.dto;

public class NotificacionDTO {

    private Long id;
    private Long usuarioId;
    private String mensaje;

    // Constructor vacío
    public NotificacionDTO() {
    }

    // Constructor con parámetros
    public NotificacionDTO(Long id, Long usuarioId, String mensaje) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.mensaje = mensaje;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}