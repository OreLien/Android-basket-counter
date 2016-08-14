package com.example.android.compteurbasket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState != null) {
            scoreTeamA = savedInstanceState.getInt("scoreTeamA");
            scoreTeamB = savedInstanceState.getInt("scoreTeamB");
        }
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    protected void onSaveInstanceState(Bundle instanceStateToSave) {
        super.onSaveInstanceState(instanceStateToSave);
        instanceStateToSave.putInt("scoreTeamA", scoreTeamA);
        instanceStateToSave.putInt("scoreTeamB", scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add three points to the B team
     * @param view
     */
    public void addThreePointsForA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add two points to the B team
     * @param view
     */
    public void addTwoPointsForA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add one point to the B team
     * @param view
     */
    public void addOnePointForA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add three points to the B team
     * @param view
     */
    public void addThreePointsForB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Add two points to the B team
     * @param view
     */
    public void addTwoPointsForB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Add one point to the B team
     * @param view
     */
    public void addOnePointForB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Resets the score for both teams
     * @param view
     */
    public void resetScores(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
