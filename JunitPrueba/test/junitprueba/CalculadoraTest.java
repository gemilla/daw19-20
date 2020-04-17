/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitprueba;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GEMA
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

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        int []a = {20,30,40};
        int []b = {10,10,10};
        int []expResult = {30,50,50};
        int []result = new int[3];
        for (int i = 0; i < expResult.length; i++) {
            result[i] = Calculadora.suma(a[i], b[i]);
        }
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int a = 30;
        int b = 20;
        int expResult = 10;
        int result = Calculadora.resta(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of producto method, of class Calculadora.
     */
    @Test
    public void testProducto() {
        System.out.println("producto");
        int a = 10;
        int b = 20;
        int expResult = 200;
        int result = Calculadora.producto(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of division method, of class Calculadora.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        int a = 10;
        int b = 2;
        int expResult = 5;
        int result = Calculadora.division(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
