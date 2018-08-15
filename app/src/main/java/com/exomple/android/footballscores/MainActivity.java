package com.exomple.android.footballscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreTeamA = 0;
    int scoreTeamB = 0;


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_A_score);
        scoreView.setText(String.valueOf(score));

    }

    private void display1(int number) {
        TextView showbu1 = findViewById(R.id.team_A_score);
        showbu1.setText("" + number);

    }

    public void SubmitOrder1(View View) {
        scoreTeamA = scoreTeamA + 6;
        display1(scoreTeamA);
    }


    private void display2(int number) {
        TextView showbu2 = findViewById(R.id.team_A_score);
        showbu2.setText("" + number);

    }

    public void SubmitOrder2(View view) {
        scoreTeamA = scoreTeamA + 3;
        display2(scoreTeamA);
    }

    private void display3(int number) {
        TextView showFREE = findViewById(R.id.team_A_score);
        showFREE.setText("" + number);
    }

    public void SubmitOrder3(View view) {
        scoreTeamA = scoreTeamA + 2;
        display3(scoreTeamA);
    }

    private void display4(int number) {
        TextView showbu2 = findViewById(R.id.team_A_score);
        showbu2.setText("" + number);

    }

    public void SubmitOrder4(View view) {
        scoreTeamA = scoreTeamA + 2;
        display4(scoreTeamA);
    }

    private void display5(int number) {
        TextView showFREE = findViewById(R.id.team_A_score);
        showFREE.setText("" + number);
    }

    public void SubmitOrder5(View view) {
        scoreTeamA = scoreTeamA + 1;
        display5(scoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }

    private void display6(int number) {
        TextView showbu1 = findViewById(R.id.team_b_score);
        showbu1.setText("" + number);

    }

    public void SubmitOrder6(View View) {
        scoreTeamB = scoreTeamB + 6;
        display6(scoreTeamB);
    }


    private void display7(int number) {
        TextView showbu2 = findViewById(R.id.team_b_score);
        showbu2.setText("" + number);

    }

    public void SubmitOrder7(View view) {
        scoreTeamB = scoreTeamB + 3;
        display7(scoreTeamB);
    }

    private void display8(int number) {
        TextView showFREE = findViewById(R.id.team_b_score);
        showFREE.setText("" + number);
    }

    public void SubmitOrder8(View view) {
        scoreTeamB = scoreTeamB + 2;
        display8(scoreTeamB);
    }

    private void display9(int number) {
        TextView showbu2 = findViewById(R.id.team_b_score);
        showbu2.setText("" + number);

    }

    public void SubmitOrder9(View view) {
        scoreTeamB = scoreTeamB + 2;
        display9(scoreTeamB);
    }

    private void display10(int number) {
        TextView showFREE = findViewById(R.id.team_b_score);
        showFREE.setText("" + number);
    }

    public void SubmitOrder10(View view) {
        scoreTeamB = scoreTeamB + 1;
        display10(scoreTeamB);
    }

    public void SubmitOrderRest(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}


