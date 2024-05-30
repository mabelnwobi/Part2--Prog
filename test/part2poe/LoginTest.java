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
public class LoginTest {
    
    public LoginTest() {
    }

    /**
     * Test of main method, of class Login.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Login.main(args);
        
    }

    /**
     * Test of promptUserForLoginDeets method, of class Login.
     */
    @Test
    public void testPromptUserForLoginDeets() {
        System.out.println("promptUserForLoginDeets");
        Login.promptUserForLoginDeets();
       
    }

    /**
     * Test of login method, of class Login.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        Login.login();
      
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String name = "kyle";
        String username = "kyl_1";
        String studentNumber = "ST10280468";
        boolean expResult = false;
        boolean result = Login.loginUser(name, studentNumber);
        assertEquals(expResult, result);
        
    }
    

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "Ch&&sec@ke99";
        boolean expResult = false;
        boolean result = Login.checkPasswordComplexity(password);
        assertEquals(expResult, result);
      
    }
    
}
