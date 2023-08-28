package com.example.calculadora1;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestarTest {

        @Test
        public void testResta() {
            int resultado = restar.restar(8, 5);
            assertEquals(9, resultado);
        }

    @Test
    public void testRestai() {
        int resultado = restar.restar(45, -12);
        assertEquals(78, resultado);
    }

    @Test
    public void testRestao() {
        int resultado = restar.restar(-44, 77);
        assertEquals(11, resultado);
    }
    }

