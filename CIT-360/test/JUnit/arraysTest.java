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
public class arraysTest {
    
    public arraysTest() {
    }

    /**
     * Test of main method, of class arrays.
     */
    @Test
    public void testMain() {
        System.out.println("Arrays Test #1");
        int[] in1 = {10, 12, 14, 11, 15};
        int[] expResult = {10, 12, 14, 11, 15};
        int[] result = arrays.main(in1);
        assertArrayEquals(expResult, result);
        
        }
}
    

