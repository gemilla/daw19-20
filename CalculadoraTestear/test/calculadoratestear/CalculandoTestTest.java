/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoratestear;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GEMA
 */
public class CalculandoTestTest {
    
    public CalculandoTestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of suma method, of class CalculandoTest.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        int a = 3;
        int b = 2;
        int expResult = 5;
        int result = CalculandoTest.suma(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of resta method, of class CalculandoTest.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        int a = 25;
        int b = 10;
        int expResult = 15;
        int result = CalculandoTest.resta(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of producto method, of class CalculandoTest.
     */
    @Test
    public void testProducto() {
        System.out.println("producto");
        int a = 10;
        int b = 5;
        int expResult = 50;
        int result = CalculandoTest.producto(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of division method, of class CalculandoTest.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        int a = 10;
        int b = 2;
        int expResult = 5;
        int result = CalculandoTest.division(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

  
    
}
