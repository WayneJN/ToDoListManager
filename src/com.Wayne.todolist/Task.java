package com.Wayne.todolist;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task {
    //Create Priority levels
    public enum Priority {Low, Medium, High}

    //need to create a class to store the description
    private final String description;

    //need to identify when a task is completed, yes/no
    private boolean completed;

    //Local date and due date declaration to be used later
    private LocalDate dueDate;

    //Same for priority
    private Priority priority;

    public Task(String description, LocalDate dueDate, Priority priority) {
        this.description = description;
        this.completed = false; //assigns all new tasks as not completed by default
        this.dueDate = dueDate;
        this.priority = priority;
    }

    //1. need a method to mark a task as completed
    public void markComplete() {
        this.completed = true;
    }

    public boolean isCompleted() {
        return completed;
    }

    //2. Description
    public String getDescription() {
        return description;
    }

    //3. Adding the ability to set a due date
    public void setDueDate(LocalDate newDate) {
        this.dueDate = newDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    //4. Adding ability to set priority, and check priority
    public void setPriority(Priority newPriority) {
        this.priority = newPriority;
    }

    public Priority getPriority() {
        return priority;
    }

    public String toString() {
        // Completed or not
        String status = isCompleted() ? "[✔]" : "[ ]";

        // “dd/MM/yyyy” or “no-date”
        String dateStr = (getDueDate() != null)
                ? getDueDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                : "no-date";

        // “LOW”/“MEDIUM”/“HIGH” or “no-prio”
        String prioStr = (getPriority() != null)
                ? getPriority().name()
                : "no-prio";

        // Put it all together
        return String.format("%s %s %-6s — %s", status, dateStr, prioStr, getDescription());
    }
}
