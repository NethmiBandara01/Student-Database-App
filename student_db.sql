-- Create database
CREATE DATABASE student_db;
USE student_db;

-- Create students table
CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    year INT,
    email VARCHAR(100),
    stream VARCHAR(50)
) AUTO_INCREMENT=16000;
