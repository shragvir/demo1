package com.example.lab4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Get the score from the Intent
        int score = getIntent().getIntExtra("SCORE", 0);

        // Display the score in a TextView
        TextView resultTextView = findViewById(R.id.textView2);
        resultTextView.setText("Your score: " + score);
        Button retryButton=findViewById(R.id.button2);
        retryButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        }));
    }
}