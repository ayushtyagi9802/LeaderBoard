package com.example.mehul.leaderboard;

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
    int scoreTeamA=0;
    int scoreTeamB=0;
    public void diaplayFortextA(int score){
        TextView scoreView = (TextView)findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void diaplayFortextB(int score){
        TextView scoreView = (TextView)findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plusThree(View view)
    {
        scoreTeamA=scoreTeamA+3;
        diaplayFortextA(scoreTeamA);
    }
    public void plusTwo(View view)
    {
        scoreTeamA=scoreTeamA+2;
        diaplayFortextA(scoreTeamA);
    }
    public void freeThrow(View view)
    {
        scoreTeamA=scoreTeamA+1;
        diaplayFortextA(scoreTeamA);
    }
    public void plusThreeForB(View view)
    {
        scoreTeamB=scoreTeamB+3;
        diaplayFortextB(scoreTeamB);
    }
    public void plusTwoForB(View view)
    {
        scoreTeamB=scoreTeamB+2;
        diaplayFortextB(scoreTeamB);
    }
    public void freeThrowForB(View view)
    {
        scoreTeamB=scoreTeamB+1;
        diaplayFortextB(scoreTeamB);
    }
    public void resetValuesToZero(View view)
    {
        scoreTeamB=0;
        scoreTeamA=0;
        diaplayFortextA(scoreTeamA);
        diaplayFortextB(scoreTeamB);
    }






}
