/**
1. Stores the name of the user and their to-do list (a single linked list of
        tasks).
2. Includes methods to add a task, mark a task as completed, and print all tasks
 */
package com.Wayne.todolist;

public class User {
    private String name; // Each user gets their own name, kept private
    private TaskList tasks; // Each user gets a task list, a linked list, also kept private

    public User(String name) {
        this.name = name;
        this.tasks = new TaskList(); //New task list created, empty for this user
    }

    public String getName() {
        return name;
    }

    public void addTask(String description) {
        tasks.addTask(description);
    }

    public boolean markTaskCompleted(String description) {
        return tasks.markCompleted(description);
    }

    public void printTasks() {
        System.out.println(name + "'s To-Do List:");
        tasks.printTasks();
    }
}


