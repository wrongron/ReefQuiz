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

import org.w3c.dom.Text;

import static android.R.attr.name;
import static android.R.attr.x;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static com.example.android.reefquiz.R.id.answer1_A;
import static com.example.android.reefquiz.R.id.answer1_B;
import static com.example.android.reefquiz.R.id.answer1_C;
import static com.example.android.reefquiz.R.id.answer_3;
import static com.example.android.reefquiz.R.id.question_1;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void updateScore(View view){
        int score = 0;

        // Question 1
        CheckBox answer1A = (CheckBox) findViewById(R.id.answer1_A);
        CheckBox answer1B = (CheckBox) findViewById(R.id.answer1_B);
        CheckBox answer1C = (CheckBox) findViewById(R.id.answer1_C);
        if (answer1A.isChecked()) {
            score--;
        }
        if (answer1B.isChecked()) {
            score++;
        }
        if (answer1C.isChecked()) {
            score--;
        }

        // Question 2
        RadioButton answer2A = (RadioButton) findViewById(R.id.answer2_A);
        RadioButton answer2B = (RadioButton) findViewById(R.id.answer2_B);
        RadioButton answer2C = (RadioButton) findViewById(R.id.answer2_C);
        if (answer2A.isChecked()) {
            score++;
        }

        // Question 3
        EditText answer3 = (EditText) findViewById(R.id.answer_3);
        if (answer3.getText().toString().equals("Clown")) {
            score++;
        }
        if (answer3.getText().toString().equals("clown")) {
            score++;
        }
        if (answer3.getText().toString().equals("Clown fish")) {
            score++;
        }
        if (answer3.getText().toString().equals("Clownfish")) {
            score++;
        }
        if (answer3.getText().toString().equals("clown fish")) {
            score++;
        }
        if (answer3.getText().toString().equals("clownfish")) {
            score++;
        }
        displayScore(score);
    }

    public void displayScore(int score) {
        TextView scoreTextView = (TextView) findViewById(R.id.current_score);
        scoreTextView.setText("" + score);
    }
}