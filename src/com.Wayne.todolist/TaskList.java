/**
Single Linked List
1. Represents the to-do list for a user. (Wraps a TaskList per person)
2. Includes methods to add a task, mark a task as completed, and print all tasks
*/

package com.Wayne.todolist;

public class TaskList {
    //We are creating a list here. Pointed to the start of the list. Other-wise its null if list is empty.
    private Node head;


    private class Node {
        Task task; //Each node starts/wraps a new task. Holds data here
        Node next; //Links the node to the rest of the list. Defaults null
        Node (Task t) {task = t;}
    }


    public void addTask(String description) {
        Task t = new Task(description); //Adds the new description in a new task
        Node newnode = new Node(t); //Adds this new task, into a new node

        if (head == null) {
            head = newNode; //if list is empty, newNode becomes the head
        } else {
            Node cur = head; //otherwise,  current head is head, look at the next slot, cur.next
            while (cur.next != null) cur = cur.next; //if not empty, then it continues .next until the end.
            cur.next = newNode;
        }

    }

    public boolean markCompleted(String description) {
        Node cur = head;
        while (cur.next != null) { //While description isn't empty
                if (cur.task.getDescription().equals(description)) {
                    cur.task.markCompleted();
                    return true;
                }
            cur = cur.next;
        }
        return false; // not found
    }


    /** Print all tasks */
    public void printTasks() {
        if (head == null) {
            System.out.println("  (no tasks)");
            return;
        }
        int idx = 1;
        Node cur = head;
        while (cur != null) {
            System.out.printf("  %d. %s%n", idx++, cur.task);
            cur = cur.next;
        }
    }
}

