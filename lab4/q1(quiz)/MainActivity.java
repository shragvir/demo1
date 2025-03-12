package com.example.lab4;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.example.lab4.ResultActivity;


public class MainActivity extends AppCompatActivity {

    private RadioGroup q1Group;
    private RadioGroup q2Group;
    private Button submitButton;
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        q1Group = findViewById(R.id.radioGroup);
        q2Group=findViewById(R.id.radioGroup2);
        submitButton = findViewById(R.id.button);

        // Handle submit button click
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show a confirmation dialog before submitting the quiz
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Submit Quiz")
                        .setMessage("Are you sure you want to submit your quiz?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // Calculate score
                                calculateScore();

                                // Pass the score to the ResultActivity
                                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                                intent.putExtra("SCORE", score);
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("No", null)
                        .show();
            }
        });
    }

    private void calculateScore() {
        // Check answer for Question 1
        int selectedIdQ1 = q1Group.getCheckedRadioButtonId();
        int selectedIdQ2 = q2Group.getCheckedRadioButtonId();
        RadioButton selectedRadioButtonQ1 = findViewById(selectedIdQ1);
        RadioButton selectedRadioButtonQ2 = findViewById(selectedIdQ2);
        if (selectedRadioButtonQ1 != null && selectedRadioButtonQ1.getText().equals("Delhi")) {
            score++;
        }
        if (selectedRadioButtonQ2 != null && selectedRadioButtonQ2.getText().equals("4")) {
            score++;
        }

    }
}