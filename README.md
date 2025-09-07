# Student-Database-App

## Project Description
A console-based Java application that manages student information using a MySQL database.  
Supports adding, viewing, updating, and deleting student records.  
The application demonstrates Java + JDBC integration with MySQL.

## Setup Instructions

### 1. Prerequisites
- Java 8 
- MySQL 8.0 installed
- IntelliJ IDEA
- MySQL Connector/J


### 2. Database Setup
1. Open **MySQL Workbench** or MySQL Command Line.  
2. Run the SQL script `student_db.sql` provided in the repository:

```sql
CREATE DATABASE student_db;
USE student_db;

CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    year INT,
    email VARCHAR(100),
    stream VARCHAR(50)
) AUTO_INCREMENT=16000;
```
### 3. Update DBConnection.java with your MySQL username and password:

private static final String USER = "root";
private static final String PASSWORD = "your_password";

### 4.Running the Project

Open the project in IntelliJ IDEA.
Add mysql-connector-j-8.0.xx.jar to the project libraries if not already included.

### 5.Run Main.java

### 6. Use the console menu to manage students

1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit

## Assumptions / Special Notes

Student IDs are auto-generated starting from 16000.
Emails are not validated for uniqueness.
The program handles invalid input and non-existing IDs gracefully.
The database must be created via student_db.sql before running the program.
The application is console-based; no graphical user interface is implemented.


