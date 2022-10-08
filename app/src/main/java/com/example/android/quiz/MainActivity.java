package com.example.android.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitQuiz(View view) {
        score = 0;

        RadioButton radioButton2a = (RadioButton) findViewById(R.id.creeper);
        if (radioButton2a.isChecked()) {
            score++;
        }

        CheckBox mineCheckBox1 = (CheckBox) findViewById(R.id.answer1);
        boolean answer1 = mineCheckBox1.isChecked();
        CheckBox mineCheckBox2 = (CheckBox) findViewById(R.id.answer2);
        boolean answer2 = mineCheckBox2.isChecked();
        CheckBox mineCheckBox3 = (CheckBox) findViewById(R.id.answer3);
        boolean answer3 = mineCheckBox3.isChecked();
        if (answer1 && answer2 && answer3) {
            score++;
        }

        RadioButton radioButton3b = (RadioButton) findViewById(R.id.down);
        if (radioButton3b.isChecked()) {
            score++;
        }

        EditText responseField = (EditText) findViewById(R.id.text_response);
        String textResponse = responseField.getText().toString().trim();
        if (!textResponse.isEmpty()) {
            score++;
        } else {
            Toast.makeText(this, getString(R.string.emptyToast), Toast.LENGTH_SHORT).show();
        }

        Toast.makeText(this, getString(R.string.score1) + " " + score + " " + getString(R.string.score2), Toast.LENGTH_SHORT).show();
    }
}