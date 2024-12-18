package com.example.todo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Task> tasks;
    private TaskAdapter taskAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the task list
        tasks = new ArrayList<>();

        // Set up RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Set up the adapter
        taskAdapter = new TaskAdapter(tasks);
        recyclerView.setAdapter(taskAdapter);

        // Get references to the EditText and Button
        EditText taskInput = findViewById(R.id.taskInput);
        Button addTaskButton = findViewById(R.id.addTaskButton);

        // Set up the Add Task button
        addTaskButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onClick(View view) {
                // Get the task name from the EditText
                String taskName = taskInput.getText().toString().trim();

                // Check if input is not empty
                if (!taskName.isEmpty()) {
                    // Add the task to the list
                    tasks.add(new Task(taskName, false)); // Pass task name and completion status
                    taskAdapter.notifyDataSetChanged();  // Notify the adapter to update the RecyclerView

                    // Clear the input field
                    taskInput.setText("");
                } else {
                    // Show an error message if input is empty
                    taskInput.setError("Task cannot be empty");
                }
            }
        });
    }
}
