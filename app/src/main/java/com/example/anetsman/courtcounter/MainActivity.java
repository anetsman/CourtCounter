package com.example.anetsman.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamAScore;
    private int teamBScore;

    private final int POINTS_FOR_THREE = 3;
    private final int POINTS_FOR_TWO = 2;
    private final int POINTS_FOR_FREE_THROW = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void displayScoreA(int score) {
        TextView teamScoreA = (TextView) findViewById(R.id.team_a_score);
        teamScoreA.setText(String.valueOf(score));
    }

    private void displayScoreB(int score) {
        TextView teamScoreB = (TextView) findViewById(R.id.team_b_score);
        teamScoreB.setText(String.valueOf(score));
    }

    public void addThreePointsA(View view) {
        teamAScore += POINTS_FOR_THREE;
        displayScoreA(teamAScore);
    }

    public void addTwoPointsA(View view) {
        teamAScore += POINTS_FOR_TWO;
        displayScoreA(teamAScore);
    }

    public void addOnePointA(View view) {
        teamAScore += POINTS_FOR_FREE_THROW;
        displayScoreA(teamAScore);
    }

    public void addThreePointsB(View view) {
        teamBScore += POINTS_FOR_THREE;
        displayScoreB(teamBScore);
    }

    public void addTwoPointsB(View view) {
        teamBScore += POINTS_FOR_TWO;
        displayScoreB(teamBScore);
    }

    public void addOnePointB(View view) {
        teamBScore += POINTS_FOR_FREE_THROW;
        displayScoreB(teamBScore);
    }

    public void reset(View view) {
        teamAScore = 0;
        teamBScore = 0;
        displayScoreA(teamAScore);
        displayScoreB(teamBScore);
    }

}
