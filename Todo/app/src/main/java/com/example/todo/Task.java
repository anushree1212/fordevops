package com.example.todo;

public class Task {
    private String name;
    private boolean isCompleted;

    // Constructor to initialize task name and completion status
    public Task(String name, boolean isCompleted) {
        this.name = name;
        this.isCompleted = isCompleted;
    }

    // Getter for task name
    public String getName() {
        return name;
    }

    // Setter for task name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for task completion status
    public boolean isCompleted() {
        return isCompleted;
    }

    // Setter for task completion status
    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}

