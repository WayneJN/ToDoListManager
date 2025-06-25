# 📝 To-Do List Manager

A simple, interactive Java console application that lets multiple users manage their personal to-do lists. Each user has their own list of tasks, which are stored using a singly linked list.

---

## 📌 Features

- 🧑 Create and manage multiple users
- ✍️ Add tasks with descriptions, optional due dates, and priority levels
- ✅ Mark tasks as completed
- 📋 View each user’s complete list
- 📦 All tasks stored in a custom-built singly linked list

---

## 💻 Technologies

- Java 17+
- Standard Java libraries: `java.time`, `java.util.Scanner`
- No external dependencies

---

## 🛠 Setup & Run Instructions

1. Clone or download the project.
2. Open it in IntelliJ or any Java IDE.
3. Ensure `Main.java` has the following at the top:

   ```java
   package com.Wayne.todolist;
4. Run Main.java to start the console-based menu.

## 📖 How It Works
Upon running, you'll be greeted with an interactive menu:

📝 Welcome to the To-Do List Manager!

Menu:
1. Add User
2. Add Task
3. Mark Task as Completed
4. View Tasks
5. Exit


➕ Add User
Enter a new username (must be unique).

✍️ Add Task
Choose an existing user.

Enter the task description.

(Optional) Enter a due date (YYYY-MM-DD) or press Enter to skip.

(Optional) Choose a priority: Low, Medium, or High.

✅ Mark Task as Completed
Choose a user.

Enter the exact task description to mark it complete.

📋 View Tasks
Prints all tasks for every user, including completion status, date, and priority.


🚀 Future Enhancements
[ ] Edit or delete tasks

[ ] View only completed or high-priority tasks

[ ] Persist tasks to a file (save/load)

[ ] Sort tasks by due date or priority

[ ] Graphical UI using JavaFX


👨‍💻 Author
Built with care by Wayne DS&A Project · Summer 2025
