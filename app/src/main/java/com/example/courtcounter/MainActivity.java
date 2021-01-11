package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
          int totalScore =0;
          int totalScoreB =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(totalScore);
    }

    public void displayForTeamA(int totalScore)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
                scoreView.setText(String.valueOf(totalScore));
    }

    public void threePoints(View view) {
                      totalScore= totalScore + 3;
                      displayForTeamA(totalScore);
    }

    public void twoPoints(View view) {
        totalScore= totalScore + 2;
        displayForTeamA(totalScore);


    }

    public void freeThrowScore(View view) {
        totalScore= totalScore + 1;
        displayForTeamA(totalScore);

    }
    public void displayForTeamB(int totalScoreB)
    {
        TextView scoreViewForB = (TextView) findViewById(R.id.team_b_score);
                scoreViewForB.setText(String.valueOf(totalScoreB));
    }



    public void freeThrowScoreForB(View view) {
        totalScoreB = totalScoreB + 1 ;
        displayForTeamB( totalScoreB);

    }

    public void twoPointsForB(View view) {
        totalScoreB = totalScoreB + 2 ;
        displayForTeamB( totalScoreB);

    }

    public void threePointsforB(View view) {
        totalScoreB = totalScoreB + 3 ;
        displayForTeamB( totalScoreB);

    }

    public void reset(View view) {
        totalScoreB = 0;
        totalScore = 0;
        displayForTeamA(totalScore);
        displayForTeamB(totalScoreB);
    }
}