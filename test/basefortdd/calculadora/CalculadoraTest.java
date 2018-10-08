/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basefortdd.calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author André
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of soma method, of class Calculadora.
     */
    @Test
    public void testSoma() {
        System.out.println("soma");
        int valorA = 1;
        int valorB = 2;
        Calculadora instance = new Calculadora();
        int expResult = 3;
        int result = instance.soma(valorA, valorB);
        assertEquals(expResult, result);
    }

    /**
     * Test of subtrai method, of class Calculadora.
     */
    @Test
    public void testSubtrai() {
        System.out.println("subtrai");
        int valorA = 2;
        int valorB = 1;
        Calculadora instance = new Calculadora();
        int expResult = 1;
        int result = instance.subtrai(valorA, valorB);
        assertEquals(expResult, result);
    }

    /**
     * Test of divide method, of class Calculadora.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        int valorA = 4;
        int valorB = 2;
        Calculadora instance = new Calculadora();
        int expResult = 2;
        int result = instance.divide(valorA, valorB);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiplica method, of class Calculadora.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        int valorA = 2;
        int valorB = 1;
        Calculadora instance = new Calculadora();
        int expResult = 2;
        int result = instance.multiplica(valorA, valorB);
        assertEquals(expResult, result);
    }
    
}
