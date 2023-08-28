package com.example.calculadora1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumarTest {

        @Test
        public void testSuma() {
            int resultado = Calculadora.sumar(2, 3);
            assertEquals(7, resultado);
        }

    @Test
    public void testSumaa() {
        int resultado = Calculadora.sumar(2444, 5444);
        assertEquals(545, resultado);
    }

    @Test
    public void testSumaaaaa() {
        int resultado = Calculadora.sumar(45711, -141);
        assertEquals(45570, resultado);
    }
    }

