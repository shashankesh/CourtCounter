package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //displayForTeamA(8);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void add3 (View view){
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }
    public void add2(View view){
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }
    public void freeT(View view){
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }




    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void add3B(View view){
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }
    public void add2B(View view){
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }
    public void freeTB(View view){
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }
}
