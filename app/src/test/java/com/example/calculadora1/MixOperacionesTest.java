package com.example.calculadora1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MixOperacionesTest {

    @Test
    public void testSumarYMultiplicar() {
        int resultado = MixOperaciones.sumarYMultiplicar(2, 3, 4);
        assertEquals(20, resultado); //
    }

    @Test
    public void testSumarYMultiplicara() {
        int resultado = MixOperaciones.sumarYMultiplicar(8, 1224, 16);
        assertEquals(20, resultado);
    }

    @Test
    public void testSumarYMultiplicaria() {
        int resultado = MixOperaciones.sumarYMultiplicar(23, 1224, 6);
        assertEquals(458, resultado);
    }

}
