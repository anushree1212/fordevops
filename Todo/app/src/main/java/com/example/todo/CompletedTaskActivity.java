package com.example.todo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CompletedTaskActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completed_task);

        // Get references to the TextView and ImageView
        TextView successMessage = findViewById(R.id.successMessage);


        // Display the message
        successMessage.setText("You completed the task successfully!");



    }
}
