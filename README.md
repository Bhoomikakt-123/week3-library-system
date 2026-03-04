# week3-library-system

# 📚 Console-Based Library Management System

## 📌 Project Overview
This project is a Java console-based Library Management System developed as part of Week 3 Java Programming Basics.  
The system allows librarians to manage books, members, and borrowing operations using Object-Oriented Programming principles and file-based data persistence.

---

## 🎯 Project Objectives
- Implement Java OOP concepts (Classes, Objects, Encapsulation)
- Use ArrayList for managing collections
- Implement File I/O operations for data persistence
- Build a console-based interactive menu system
- Apply exception handling and input validation

---

## 🛠️ Features
- Add new books to the library
- View all books
- Register library members
- Borrow books with due date tracking
- Return books
- Data stored in text files (books.txt, members.txt)
- Automatic data loading on program start
- Error handling for invalid operations

---

week3-library-system/
│── src/
│ └── main/
│ └── java/
│ └── library/
│ ├── Main.java
│ ├── Book.java
│ ├── Member.java
│ ├── Library.java
│ └── FileHandler.java
│
│── data/
│ ├── books.txt
│ └── members.txt
│
│── README.md


---

## 💻 Technologies Used
- Java
- ArrayList
- File Handling (BufferedReader, FileWriter)
- OOP Principles
- Exception Handling

---

## ▶️ How to Run the Project

### Step 1: Compile the Program
```bash
javac -d bin src/main/java/library/*.java
```
Step 2: Run the Program
```bash
java -cp bin library.Main
```
🖥️ Sample Menu
=== LIBRARY MANAGEMENT SYSTEM ===
1. Add Book
2. View Books
3. Register Member
4. Borrow Book
5. Return Book
6. Exit




## 🏗️ Project Structure
