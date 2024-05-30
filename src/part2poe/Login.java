/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2poe;
import javax.swing.JOptionPane;
/**
 *
 * @author mabel
 */
public class Login {
    public static void main(String[] args) {
        login();
    }

  //Login feature with Joption pane, derived from my part 1 (corrected) and incorporated with my POE part 2. 
    
    public static void promptUserForLoginDeets() {
        // Opening of the login feature starting with "Greetings" and asks user to proceed--
        String proceedInput = JOptionPane.showInputDialog(null, "Good day! Please type 'Yes' to proceed--");

        if (!"Yes".equalsIgnoreCase(proceedInput)) {
            JOptionPane.showMessageDialog(null, "Exiting the registration process.");
            return;
        }

        String username = JOptionPane.showInputDialog(null, "Enter your desired username: ");
        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username cannot be empty.\n");
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Username successfully captured.\n");
        }

        String password = JOptionPane.showInputDialog(null, "Enter your password (at least 8 characters with digits and special characters): ");
        if (!checkPasswordComplexity(password)) {
            JOptionPane.showMessageDialog(null, "Password does not meet complexity requirements.\n");
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Password successfully captured.\n");
        }

        String name = JOptionPane.showInputDialog(null, "Enter your name: ");
        String studentNumber = JOptionPane.showInputDialog(null, "Enter your student number (9 digits): ");
        if (!loginUser(name, studentNumber)) {
            JOptionPane.showMessageDialog(null, "Registration successful! Thank you!");
            return;
        }

        JOptionPane.showMessageDialog(null, "Registration failed. Please check your details and try again.");
    }

    //Validation 
    public static void login() {
        JOptionPane.showMessageDialog(null, "Login");
        promptUserForLoginDeets();
    }

    public static boolean loginUser(String name, String studentNumber) {
        return name.length() > 5 && studentNumber.matches("\\d{9}");
    }

    public static boolean checkPasswordComplexity(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }
        return hasDigit && hasSpecialChar;
    }
}
