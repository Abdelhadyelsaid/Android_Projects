package com.example.footballscorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int first_team_score = 0;
    int first_team_fouls = 0;
    int second_team_score = 0;
    int second_team_fouls = 0;

    public void first_team_Goals(View view) {
        first_team_score++;
        displayGoalsForTeamA(first_team_score);
    }

    public void displayGoalsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.First_Team_Goals);
        scoreView.setText(String.valueOf(score));
    }

    public void first_team_fouls(View view) {
        first_team_fouls++;
        displayFoulsForTeamA(first_team_fouls);
    }

    public void displayFoulsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.First_Team_Fouls);
        scoreView.setText(String.valueOf(score));
    }

    public void Second_team_Goals(View view) {
        second_team_score++;
        displayGoalsForTeamB(second_team_score);
    }

    public void displayGoalsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Second_Team_Goals);
        scoreView.setText(String.valueOf(score));
    }

    public void Second_team_fouls(View view) {
        second_team_fouls++;
        displayFoulsForTeamB(second_team_fouls);
    }

    public void displayFoulsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Second_Team_Fouls);
        scoreView.setText(String.valueOf(score));
    }

    public void Reset(View view) {
        first_team_score = 0;
        first_team_fouls = 0;
        second_team_score = 0;
        second_team_fouls = 0;
        displayGoalsForTeamA(first_team_score);
        displayFoulsForTeamA(first_team_fouls);
        displayGoalsForTeamB(second_team_score);
        displayFoulsForTeamB(second_team_fouls);
    }

}