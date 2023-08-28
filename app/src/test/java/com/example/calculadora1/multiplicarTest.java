package com.example.calculadora1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class multiplicarTest {
    @Test
    public void testMultiplicacion() {
        int resultado = Multiplicar.multiplicar(5, 2);
        assertEquals(80, resultado);
    }

    @Test
    public void testMultiplicacionn() {
        int resultado = Multiplicar.multiplicar(57, -25);
        assertEquals(80, resultado);
    }

    @Test
    public void testMultiplicacione() {
        int resultado = Multiplicar.multiplicar(85, 2);
        assertEquals(10, resultado);
    }

}
