package com.Wayne.todolist;

public class Task {
    //need to create a class to store the description
    private String description;
    //need to identify when a task is completed, yes/no
    private boolean completed;

    public Task(String description) {
        this.description = description;
        this.completed = false; //assigns all new tasks as not completed by default
    }
    //need a method to mark a task as completed
    public void markComplete() {
        this.completed = true;
    }
    //method to check if a task is completed
    public boolean isCompleted() {
        return completed;
    }

    //return the task text when asked. Available publicly
    public String getDescription() {
        return description;
    }

    public String toString() {
        return (completed) ? "Completed" : "Not Completed";
    }
}


//1. Stores the description and completion status of a task.
//
//2. Includes a method to mark a task as completed.
