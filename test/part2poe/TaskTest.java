/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package part2poe;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mabel
 */
public class TaskTest {
    
    public TaskTest() {
    }

    /**
     * Test of checkTaskDescription method, of class Task.
     */
    
    @Test
    public void testCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        Task instance = null;
        boolean expResult = false;
        boolean result = instance.checkTaskDescription();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of printTaskDetails method, of class Task.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        Task instance = null;
        String expResult = "";
        String result = instance.printTaskDetails();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of returnTotalHours method, of class Task.
     */
    @Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");
        int expResult = 0;
        int result = Task.returnTotalHours();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of main method, of class Task.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Task.main(args);
       
    }
    
}
