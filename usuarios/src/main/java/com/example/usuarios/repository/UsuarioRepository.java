package com.example.usuarios.repository;

import com.example.usuarios.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    public List<Usuario> listar() {
        List<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario(1L, "Juan", "juan@email.com"));
        lista.add(new Usuario(2L, "Ana", "ana@email.com"));

        return lista;
    }
}
