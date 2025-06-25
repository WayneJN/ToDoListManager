/**
 * 1. Creates users and adds them to an array.
 * 2. Adds tasks to users' to-do lists.
 * 3. Marks tasks as completed.
 * 4. Prints all tasks for each user*/
package com.Wayne.todolist;

import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    private static final int MAX_USERS = 10;
    private static final User[] users = new User[MAX_USERS]; //Create an array to store all User objects
    private static int userCount = 0; // Keep track of how many users there are.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the To-Do List Manager!");

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Add User");
            System.out.println("2. Add Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. View Tasks");
            System.out.println("5. Exit");

            System.out.print("Select an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> {
                    System.out.print("Enter username: ");
                    String name = scanner.nextLine();
                    addUser(name);
                }

                case "2" -> {
                    System.out.print("Enter username: ");
                    String name = scanner.nextLine();
                    User user = findUser(name);
                    if (user == null) {
                        System.out.println("User not found.");
                        break;
                    }
                    System.out.print("Enter task description: ");
                    String desc = scanner.nextLine();

                    System.out.print("Enter due date (YYYY-MM-DD), or leave blank: ");
                    String dateInput = scanner.nextLine();
                    LocalDate dueDate = dateInput.isEmpty() ? null : LocalDate.parse(dateInput);

                    System.out.print("Enter priority (Low, Medium, High), or leave blank: ");
                    String priorityInput = scanner.nextLine();
                    Task.Priority priority = switch (priorityInput.toLowerCase()) {
                        case "low"    -> Task.Priority.Low;
                        case "medium" -> Task.Priority.Medium;
                        case "high"   -> Task.Priority.High;
                        default       -> null;
                    };

                    user.addTask(desc, dueDate, priority);
                    System.out.println("Task added.");
                }

                case "3" -> {
                    System.out.print("Enter username: ");
                    String name = scanner.nextLine();
                    User user = findUser(name);
                    if (user == null) {
                        System.out.println("User not found.");
                        break;
                    }
                    System.out.print("Enter description of task to mark complete: ");
                    String desc = scanner.nextLine();
                    boolean success = user.markTaskCompleted(desc);
                    System.out.println(success ? "Task marked as completed." : "Task not found.");
                }

                case "4" -> {
                    for (int i = 0; i < userCount; i++) {
                        users[i].printTasks();
                        System.out.println();
                    }
                }

                case "5" -> {
                    running = false;
                    System.out.println("Goodbye!");
                }

                default -> System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }

    private static void addUser(String name) {
        if (userCount >= MAX_USERS) {
            System.out.println("User limit reached.");
            return;
        }
        if (findUser(name) != null) {
            System.out.println("User already exists.");
            return;
        }
        users[userCount++] = new User(name);
        System.out.println("User created.");
    }

    private static User findUser(String name) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getName().equalsIgnoreCase(name)) {
                return users[i];
            }
        }
        return null;
    }
}
