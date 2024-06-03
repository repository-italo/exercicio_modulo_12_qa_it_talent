package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculadoraTest extends TestCase {
    Calculadora calculadora = new Calculadora();
    @Test
    public void testSoma() {
        float result = calculadora.soma(3.0F, 10.0F);
        assertEquals(13.0F, result);
    }
    @Test
    public void testMultiplicacao() {
        float result = calculadora.multiplicacao(10.0F, 6.0F);
        assertEquals(60.0F, result);
    }
}