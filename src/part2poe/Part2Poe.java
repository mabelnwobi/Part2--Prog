/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package part2poe;
import javax.swing.JOptionPane;
/**
 *
 * @author mabel
 */
public class Part2Poe {

    private static int maxTasks;
    private static int taskCount = 0;

    public static void main(String[] args) {
        // Start the login process
        Login.login();

        // Display welcome message
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");

        // Ask the user for the number of tasks they wish to enter
        String input = JOptionPane.showInputDialog("How many tasks would you like to enter?");
        maxTasks = Integer.parseInt(input);

        // Menu loop
        boolean task = true;
        while (task) {
            String menuOption = JOptionPane.showInputDialog(null,
                    "Please choose an option:\n" +
                    "1) Add tasks\n" +
                    "2) Show report\n" +
                    "3) Quit");
            switch (menuOption) {
                case "1":
                    if (taskCount < maxTasks) {
                        DisplayTaskManager();
                    } else {
                        JOptionPane.showMessageDialog(null, "You have reached the maximum number of tasks.");
                    }
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Coming Soon");
                    break;
                case "3":
                    task = false;
                    JOptionPane.showMessageDialog(null, "Exiting EasyKanban. Goodbye!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option. Please try again.");
                    break;
            }
        }
    }

    private static void DisplayTaskManager() {
        // Displaying and creating task details
        String taskName = JOptionPane.showInputDialog("Enter the task name:"); 
        String taskNumber = JOptionPane.showInputDialog(null, "Enter task number:");
        String taskDescription = JOptionPane.showInputDialog("Enter the task description (50 characters max):");
       String getTaskStatus = JOptionPane.showInputDialog(null,
                "Please enter the task status:\n" +
                "1) To Do\n" +
                "2) Doing\n" +
                "3) Done");

        String taskStatus;
        switch (getTaskStatus) {
            case "1":
                taskStatus = "To Do";
                break;
            case "2":
                taskStatus = "Doing";
                break;
            case "3":
                taskStatus = "Done";
                break;
            default:
 
                DisplayTaskManager(); // Recursive call to show the dialog again
                return ; // Exit the method after the recursive call
        }
        
        String developerDetails = JOptionPane.showInputDialog("Enter the developer details:");
        String durationInput = JOptionPane.showInputDialog("Enter the task duration in hours:");

        int taskDuration = Integer.parseInt(durationInput);

        Task newTask = new Task(taskName, taskDuration,taskDescription, developerDetails);
        if (newTask.checkTaskDescription()) {
            JOptionPane.showMessageDialog(null, newTask.printTaskDetails());
            taskCount++;
        } else {
            JOptionPane.showMessageDialog(null, "Task description is too long. Please revise.");
        }

        // Display total hours after all tasks have been entered
        JOptionPane.showMessageDialog(null, "Total hours: " + Task.returnTotalHours());
    }
}