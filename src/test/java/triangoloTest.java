/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author samir pellegrini
 */
public class triangoloTest {
    
    public triangoloTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of riconoscimentotriangolo method, of class triangolo.
     */
    @Test
    public void testRiconoscimentotriangolo() {
        System.out.println("riconoscimentotriangolo");
        triangolo instance = new triangolo(1.0,1.0,1.0);
        String expResult = "equilatero";
        String result = instance.riconoscimentotriangolo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of calcoloarea method, of class triangolo.
     */
    @Test
    public void testCalcoloarea() {
        System.out.println("calcoloarea");
        triangolo instance = new triangolo(1.0,1.0,1.0);
        double expResult = 0.5;
        double result = instance.calcoloarea();
        assertEquals(expResult, result, 0.5);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of calcoloperimetro method, of class triangolo.
     */
    @Test
    public void testCalcoloperimetro() {
        System.out.println("calcoloperimetro");
        triangolo instance = new triangolo(1.0,1.0,1.0);
        double expResult = 3.0;
        double result = instance.calcoloperimetro();
        assertEquals(expResult, result, 3.0);
        // TODO review the generated test code and remove the default call to fail.
     
    }
    
}
