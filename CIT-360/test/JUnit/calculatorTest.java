/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author deannasquire
 */
public class calculatorTest {
    
    public calculatorTest() {
    }

    /**
     * Test of test1 method, of class calculator.
     */
    @Test
    public void testTest_assertEquals() {
        System.out.println("assertEquals test:");
        int input1 = 1;
        int input2 = 2;
        boolean expResult = true;
        boolean result = calculator.result(input1, input2);
        assertEquals(expResult, result);
        System.out.println("Passed");
    
        System.out.println("assertTrue test:");
        input1 = 3;
        input2 = 5;
        result = calculator.result(input1, input2);
        assertTrue(result);
        System.out.println("Passed");
    
        System.out.println("assertFalse test:");
        input1 = 5;
        input2 = 5;
        result = calculator.result(input1, input2);
        assertFalse(result);
        System.out.println("Passed");
    
        System.out.println("assertNotSame test:");
        input1 = 5;
        input2 = 3;
        result = calculator.result(input1, input2);
        assertNotSame(input1, result);
        System.out.println("Passed");
    
        System.out.println("assertSame test:");
        input1 = 5;
        input2 = 5;
        assertSame(input1, input2);
        System.out.println("Passed");
    }

}
