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
        System.out.println("Arrays Test: ");
        String[] list1 = {"[\"bananas\",\"oranges\",\"apples\"]"};
        String[] expResult = {"[\"bananas\",\"oranges\",\"apples\"]"};
        String[] result = arrays.main(list1);
        assertArrayEquals(expResult, result);
        System.out.println("Passed");
        }
}
    

