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
        RadioButton questionOne = findViewById(R.id.radioButton2_Q1);
        CheckBox questionTwo_1 = findViewById(R.id.checkBox2);
        CheckBox questionTwo_2 = findViewById(R.id.checkBox3);
        RadioButton questionThree = findViewById(R.id.radioButton1_Q3);
        EditText questionFour = findViewById(R.id.edittext_Q4);
        String answer = questionFour.getText().toString();
        RadioButton questionFive = findViewById(R.id.radioButton1_Q5);
        CheckBox questionSix_1 = findViewById(R.id.checkBox4);
        CheckBox questionSix_2 = findViewById(R.id.checkBox6);
        RadioButton questionSeven = findViewById(R.id.radioButton2_Q7);
        if (questionOne.isChecked())
            ++score;
        if (questionTwo_1.isChecked() && questionTwo_2.isChecked())
            ++score;
        if (questionThree.isChecked())
            ++score;
        if (!answer.matches(""))
            ++score;
        if (questionFive.isChecked())
            ++score;
        if (questionSix_1.isChecked() && questionSix_2.isChecked())
            ++score;
        if (questionSeven.isChecked())
            ++score;
        if (score == 7)
            Toast.makeText(this, "Congratulaions You got the Full Mark (7/7) ", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "Your Score is :  " + score + "/7 ,Please try again!", Toast.LENGTH_SHORT).show();
        score = 0;
    }
}