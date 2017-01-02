package com.example.android.reefquiz;

import android.app.ProgressDialog;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static android.R.attr.name;
import static android.R.attr.x;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void updateScore(View view) {
        int score = 0;

        // Question 1
        CheckBox answer1A = (CheckBox) findViewById(R.id.answer1_A);
        CheckBox answer1B = (CheckBox) findViewById(R.id.answer1_B);
        CheckBox answer1C = (CheckBox) findViewById(R.id.answer1_C);
        // Score a point only when two correct are answered
        if (answer1A.isChecked() && answer1C.isChecked() && !answer1B.isChecked()) {
            score++;
        }

        // Question 2
        CheckBox answer2A = (CheckBox) findViewById(R.id.answer2_A);
        CheckBox answer2B = (CheckBox) findViewById(R.id.answer2_B);
        CheckBox answer2C = (CheckBox) findViewById(R.id.answer2_C);
        // Score a point only when C is chosen
        if (answer2C.isChecked() && !answer2A.isChecked() && !answer2B.isChecked()) {
            score++;
        }

        // Question 3
        RadioButton answer3B = (RadioButton) findViewById(R.id.answer3_B);
        // Right answer
        if (answer3B.isChecked()) {
            score++;
        }

        // Question 4
        RadioButton answer4A = (RadioButton) findViewById(R.id.answer4_A);
        // Right answer
        if (answer4A.isChecked()) {
            score++;
        }

        // Question 5
        EditText answer5 = (EditText) findViewById(R.id.answer_5);
        // Right answer is any that includes the word "clown", "clownfish" or "clown fish", with any case
        if (answer5.getText().toString().equalsIgnoreCase("clown")) {
            score++;
        }
        if (answer5.getText().toString().equalsIgnoreCase("clown fish")) {
            score++;
        }
        if (answer5.getText().toString().equalsIgnoreCase("clownfish")) {
            score++;
        }
        displayScore(score);
    }

    public void displayScore(int score) {
        if (score == 5) {
            Toast.makeText(getApplicationContext(), "You aced it - your score is: " + score, Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(getApplicationContext(), "Not quite - your score is: " + score, Toast.LENGTH_LONG).show();
        }
    }
}