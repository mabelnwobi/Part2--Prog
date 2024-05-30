/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part2poe;

import javax.swing.JOptionPane;

public class Task {
    private static int totalHours = 0;
    private static int taskCount = 0;

    private String taskName;
    private int taskNumber;
    private String taskDescription;
    private String developerDetails;
    private int taskDuration;
    private String taskID;
    private String taskStatus; 

    public Task(String taskName, int taskDuration, String taskDescription, String developerDetails) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        this.taskNumber = taskCount++;
        this.taskID = createTaskID();
        this.taskStatus = "To Do";
        totalHours += taskDuration;
    }

    public boolean checkTaskDescription() {
        return this.taskDescription.length() <= 50;
    }

    private String createTaskID() {
        String devInitials = developerDetails.substring(0, 2).toUpperCase();
        String devEnd = developerDetails.substring(developerDetails.length() - 3).toUpperCase();
        return taskName.substring(0, 2).toUpperCase() + ":" + taskNumber + ":" + devEnd;
    }

    public String printTaskDetails() {
        return "Task Status: " + taskStatus + "\n" +
               "Developer Details: " + developerDetails + "\n" +
               "Task Number: " + taskNumber + "\n" +
               "Task Name: " + taskName + "\n" +
               "Task Description: " + taskDescription + "\n" +
               "Task ID: " + taskID + "\n" +
               "Duration: " + taskDuration + " hours";
    }

    public static int returnTotalHours() {
        return totalHours;
    }

    public static void main(String[] args) {
        // Example of creating a task and displaying details
        Task newTask = new Task("Add Login Feature", 8, "Implement user authentication", "John Doe");
        if (newTask.checkTaskDescription()) {
            JOptionPane.showMessageDialog(null, newTask.printTaskDetails());
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
        }

        // Display total hours after all tasks have been entered
        JOptionPane.showMessageDialog(null, "Total hours: " + returnTotalHours());
    }
}
