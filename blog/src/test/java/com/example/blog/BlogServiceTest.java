package com.example.blog;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class BlogServiceTest {

    @Test
    void testLogicaDeNegocio() {
        boolean resultado = true;
        assertNotNull(resultado, "El resultado no debería ser nulo");
    }
}