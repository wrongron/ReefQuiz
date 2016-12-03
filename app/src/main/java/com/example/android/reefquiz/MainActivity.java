package com.example.android.reefquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    boolean salinityCorrect = false;
    boolean temperatureCorrect = false;
    boolean reefSafeCorrect = false;

    public void onSalinityRadioButton(View view) {
        RadioButton salinity = (RadioButton) findViewById(R.id.onezero25);
        if (salinity.isChecked()) {
            salinityCorrect = true;
        } else {
            salinityCorrect = false;
        }
    }

    public void submitQuiz (View view) {
        int correctCount = 0;
        if (salinityCorrect) {
            correctCount ++;
        }

        System.out.println(correctCount);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
