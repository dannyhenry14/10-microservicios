package com.example.prestamos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrestamoDTO {

    private Long id;
    private Long usuarioId;
    private Long libroId;
}