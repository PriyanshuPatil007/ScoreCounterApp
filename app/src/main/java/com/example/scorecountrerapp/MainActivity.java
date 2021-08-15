package com.example.scorecountrerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {
    int quentity_A;
    int quentity_B;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Team A :

    public void add_3_A(View view){
        quentity_A = quentity_A + 3;
        displayScore_A(quentity_A);
    }
    public void add_2_A(View view){
        quentity_A = quentity_A + 2;
        displayScore_A(quentity_A);
    }
    public void add_1_A(View view){
        quentity_A = quentity_A + 1;
        displayScore_A(quentity_A);
    }

    private void displayScore_A(int scoreA){
        TextView Score_A = (TextView) findViewById(R.id.score_A);
        Score_A.setText(""+scoreA);
    }

    // Team B :

    public void add_3_B(View view){
        quentity_B = quentity_B + 3;
        displayScore_B(quentity_B);
    }

    public void add_2_B(View view){
        quentity_B = quentity_B + 2;
        displayScore_B(quentity_B);
    }

    public void add_1_B(View view){
        quentity_B = quentity_B + 1;
        displayScore_B(quentity_B);
    }

    private void displayScore_B(int scoreB){
        TextView Score_B = (TextView) findViewById(R.id.score_B);
        Score_B.setText(""+scoreB);
    }

    // Reset Button :
    public void reset(View view){
        displayScore_A(0);
        displayScore_B(0);
    }



}