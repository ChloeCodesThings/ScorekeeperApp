package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    double team1_score = 0;
    double team2_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addWinTeam1(View v) {
        ++team1_score;
        showScoreTeam1(team1_score);
    }

    public void addWinTeam2(View v) {
        ++team2_score;
        showScoreTeam2(team2_score);
    }

    public void penaltyTeam1(View v) {
        team1_score = team1_score - 1;
        showScoreTeam1(team1_score);
    }

    public void penaltyTeam2(View v) {
        team2_score = team2_score - 1;
        showScoreTeam2(team2_score);
    }

    public void addTie(View v) {
        team1_score = team1_score + 0.5;
        team2_score = team2_score + 0.5;
        showScoreTeam1(team1_score);
        showScoreTeam2(team2_score);
    }

    public void showScoreTeam1(double score) {
        TextView scoreView = (TextView) findViewById(R.id.team1_score);
        scoreView.setText(String.valueOf(score));
    }

    public void showScoreTeam2(double score) {
        TextView scoreView = (TextView) findViewById(R.id.team2_score);
        scoreView.setText(String.valueOf(score));
    }


    public void ResetScores(View v) {
        team1_score = 0;
        team2_score = 0;
        showScoreTeam1(team1_score);
        showScoreTeam2(team2_score);
    }
}
