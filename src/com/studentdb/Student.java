package com.studentdb;

public class Student {
    private int id;
    private String name;
    private int year;
    private String email;
    private String stream;

    public Student(int id, String name, int year, String email, String stream) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.email = email;
        this.stream = stream;
    }

    public Student(String name, int year, String email, String stream) {
        this.name = name;
        this.year = year;
        this.email = email;
        this.stream = stream;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getStream() { return stream; }
    public void setStream(String stream) { this.stream = stream; }

    @Override
    public String toString() {
        return id + " | " + name + " | " + year + " | " + email + " | " + stream;
    }
}

