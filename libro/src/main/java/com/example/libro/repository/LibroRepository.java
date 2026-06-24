package com.example.libro.repository;


import com.example.libro.model.Libro;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class LibroRepository {

    public List<Libro> listar() {
        List<Libro> lista = new ArrayList<>();

        lista.add(new Libro(1L, "Cien años de soledad", "García Márquez"));
        lista.add(new Libro(2L, "Don Quijote", "Cervantes"));

        return lista;
    }
}