package com.example.inventario.repository;

import com.example.inventario.model.Inventario;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class InventarioRepositoryTest {

    @Test
    void listarTest() {
        InventarioRepository repository = new InventarioRepository();

        List<Inventario> resultado = repository.listar();

        assertNotNull(resultado);
        assertEquals(2, resultado.size());
    }
}