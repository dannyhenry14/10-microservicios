package com.example.inventario.repository;

import com.example.inventario.model.Inventario;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class InventarioRepository {

    public List<Inventario> listar() {
        return List.of(
                new Inventario(1L, 1L, 5),
                new Inventario(2L, 2L, 2)
        );
    }
}
