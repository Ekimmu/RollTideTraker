package com.example.android.rolltidetraker;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Added GitHub Account
    // testing commit
    // int's to keep track of Team A & B 's scores and first downs
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int firstDown_A = 0;
    int firstDown_B = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }
    // method for increasing the score by 6 for Team A
    public void touchDown_A(View v) {
        scoreTeamA = scoreTeamA + 6;
        score_A(scoreTeamA);
    }
    // method for increasing the score by 6 for Team B
    public void touchDown_B(View v) {
        scoreTeamB = scoreTeamB + 6;
        score_B(scoreTeamB);
    }
    // method for increasing the score by 1 for Team A
    public void extraPoint_A(View v) {
        scoreTeamA = scoreTeamA + 1;
        score_A(scoreTeamA);
    }
    // method for increasing the score by 1 for Team B
    public void extraPoint_B(View v) {
        scoreTeamB = scoreTeamB + 1;
        score_B(scoreTeamB);
    }
    // method for increasing the score by 3 for Team A
    public void fieldGoal_A(View v) {
        scoreTeamA = scoreTeamA + 3;
        score_A(scoreTeamA);
    }
    // method for increasing the score by 3 for Team B
    public void fieldGoal_B(View v) {
        scoreTeamB = scoreTeamB + 3;
        score_B(scoreTeamB);
    }
    // method for increasing the score by 2 for Team A
    public void safety_A(View v) {
        scoreTeamA = scoreTeamA + 2;
        score_A(scoreTeamA);
    }
    // method for increasing the score by 2 for Team B
    public void safety_B(View v) {
        scoreTeamB = scoreTeamB + 2;
        score_B(scoreTeamB);
    }
    // method for increasing the score by 2 for Team A
    public void twoPointConversion_A(View v) {
        scoreTeamA = scoreTeamA + 2;
        score_A(scoreTeamA);
    }
    // method for increasing the score by 2 for Team B
    public void twoPointConversion_B(View v) {
        scoreTeamB = scoreTeamB + 2;
        score_B(scoreTeamB);
    }
    // method that turns an int to a string then displays it in the textview team_a_score
    public void score_A(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    // method that turns an int to a string then displays it in the textview team_b_score
    public void score_B(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    // method for increasing the number of first downs by one for Team A
    public void firstDown_A(View v) {
        firstDown_A = firstDown_A + 1;
        downs_A(firstDown_A);
    }
    // method for increasing the number of first downs by one for Team B
    public void firstDown_B(View v) {
        firstDown_B = firstDown_B + 1;
        downs_B(firstDown_B);
    }
    // method that turns an int to a string then displays it in the textview team_a_firstDown
    public void downs_A(int downs) {
        TextView firstDownView = (TextView) findViewById(R.id.team_a_firstDown);
        firstDownView.setText(String.valueOf(downs));
    }
    // method that turns an int to a string then displays it in the textview team_b_firstDown
    public void downs_B(int downs) {
        TextView firstDownView = (TextView) findViewById(R.id.team_b_firstDown);
        firstDownView.setText(String.valueOf(downs));
    }
    // Reset all values in app to 0
    public void resetValues(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        firstDown_A = 0;
        firstDown_B = 0;
        score_A(scoreTeamA);
        score_B(scoreTeamB);
        downs_A(firstDown_A);
        downs_B(firstDown_B);
    }
}
