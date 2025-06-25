/**
 * 1. Creates users and adds them to an array.
 * 2. Adds tasks to users' to-do lists.
 * 3. Marks tasks as completed.
 * 4. Prints all tasks for each user*/

package com.Wayne.todolist;

public class Main {
    private static final int MAX_USERS = 10;
    private static User[] users = new User[MAX_USERS]; //Create an array to store all User objects
    private static int userCount = 0; // Keep track of how many users there are.

    public static void main(String[] args) { //use helper method to create 2 users
        addUser("Wayne");
        addUser("Brianna");

        User wayne = findUser("Wayne"); //Demonstrate adding two tasks, and complete one
        if (wayne != null) {
            wayne.addTask("Finish DS&A project");
            wayne.addTask("Walk the dog");
            wayne.markTaskCompleted("Walk the dog");
        }

        for (int i = 0; i < userCount; i++) { //Loop through the whole array. Print all
            users[i].printTasks();
            System.out.println();
        }
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
    }

    private static User findUser(String name) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getName().equals(name)) {
                return users[i];
            }
        }
        return null;
    }
}



