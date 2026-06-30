package com.example.talleres.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TallerDTO {

    private Long id;
    private String nombre;
    private String descripcion;
}