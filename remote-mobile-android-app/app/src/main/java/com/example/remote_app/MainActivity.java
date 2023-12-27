// Dummy code for MainActivity.java
package com.example.remote_app;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the TextView
        TextView textView = findViewById(R.id.text_view);

        // Set the text to display
        textView.setText("Hello, world!");
    }
}