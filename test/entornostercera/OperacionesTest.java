/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornostercera;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 * Clase generada por java de los test borrando las dos ultimas lineas de cada
 * test
 *
 * @author: Axel Ivan Valverde Pizarro
 * @version: 1.0
 * @since: 1.0
 * @see: operaciones.class
 */
public class OperacionesTest {

    public OperacionesTest() {
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
     * Test del metodo rango, de la clase Operaciones
     *
     * @author: Axel Ivan Valverde Pizarro
     * @version: 1.0
     * @since: 1.0
     * @see: operaciones.rango
     *
     */
    @Ignore
    @Test
    public void testRango() {
        System.out.println("rango");
        int a = 0;
        int b = 0;
        Operaciones instance = new Operaciones();
        int[] expResult = null;
        int[] result = instance.rango(a, b);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test del metodo sumRango, de la clase operaciones
     *
     * @author: Axel Ivan Valverde Pizarro
     * @version: 1.0
     * @since: 1.0
     * @see: operaciones.sumRango
     */
    @Ignore
    @Test
    public void testSumRango() {
        System.out.println("sumRango");
        int a = 0;
        int b = 0;
        Operaciones instance = new Operaciones();
        int expResult = 0;
        int result = instance.sumRango(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test del metodo isPar, de la clase operaciones
     *
     * @author: Axel Ivan Valverde Pizarro
     * @version: 1.0
     * @since: 1.0
     * @see: operaciones.isPar
     */
    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testIsPar() {
        System.out.println("isPar");
        int a = 0;
        Operaciones instance = new Operaciones();
        boolean expResult = false;
        boolean result = instance.isPar(a);
        assertEquals(expResult, result);
    }

    /**
     * Test de la clase extraerPositivos, de la clase operaciones
     *
     * @author: Axel Ivan Valverde Pizarro
     * @version: 1.0
     * @since: 1.0
     * @see: operaciones.extraerPositivos
     */
    @Ignore
    @Test(expected= IllegalArgumentException.class)
    public void testExtraerPositivos() {
        System.out.println("extraerPositivos");
        int[] nums = null;
        Operaciones instance = new Operaciones();
        int[] expResult = null;
        int[] result = instance.extraerPositivos(nums);
        assertArrayEquals(expResult, result);
    }

}
