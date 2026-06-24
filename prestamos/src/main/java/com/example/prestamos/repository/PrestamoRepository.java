package com.example.prestamos.repository;

import com.example.prestamos.model.Prestamo;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class PrestamoRepository {

    public List<Prestamo> listar() {
        List<Prestamo> lista = new ArrayList<>();

        lista.add(new Prestamo(1L, 1L, 2L));
        lista.add(new Prestamo(2L, 2L, 1L));

        return lista;
    }
}