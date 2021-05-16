package com.example.quizz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score;

    public void submit(View view) {
        RadioButton questionOne_radiobutton2 = findViewById(R.id.radioButton2_Q1);

        CheckBox questionTwo_checkbox1 = findViewById(R.id.checkBox1);
        CheckBox questionTwo_checkbox2 = findViewById(R.id.checkBox2);
        CheckBox questionTwo_checkbox3 = findViewById(R.id.checkBox3);

        RadioButton questionThree_radiobutton1 = findViewById(R.id.radioButton1_Q3);

        EditText questionFour_editText = findViewById(R.id.edittext_Q4);
        String answer = questionFour_editText.getText().toString();

        RadioButton questionFive_radiobutton1 = findViewById(R.id.radioButton1_Q5);

        CheckBox questionSix_checkbox4 = findViewById(R.id.checkBox4);
        CheckBox questionSix_checkbox5 = findViewById(R.id.checkBox5);
        CheckBox questionSix_checkbox6 = findViewById(R.id.checkBox6);

        RadioButton questionSeven = findViewById(R.id.radioButton2_Q7);

        if (questionOne_radiobutton2.isChecked()) {
            ++score;
        }
        if (questionTwo_checkbox2.isChecked() && questionTwo_checkbox3.isChecked() && !questionTwo_checkbox1.isChecked()) {
            ++score;
        }
        if (questionThree_radiobutton1.isChecked()) {
            ++score;
        }
        if (answer.matches("7") || answer.matches(getString(R.string.Seven))) {
            ++score;
        }
        if (questionFive_radiobutton1.isChecked()) {
            ++score;
        }
        if (questionSix_checkbox4.isChecked() && questionSix_checkbox6.isChecked() && !questionSix_checkbox5.isChecked()) {
            ++score;
        }
        if (questionSeven.isChecked()) {
            ++score;
        }
        if (score == 7) {
            Toast.makeText(this, getString(R.string.congratulations), Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, getString(R.string.score) + score + getString(R.string.try_Again), Toast.LENGTH_SHORT).show();
        }
        score = 0;
    }
}