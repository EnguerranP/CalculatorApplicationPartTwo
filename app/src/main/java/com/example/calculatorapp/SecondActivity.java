package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void startGame(View view){
        int randomOperation = (int)(Math.random()*20)+1;
        int randomNumOne = (int)(Math.random()*500)+1;
        int randomNumTwo = (int)(Math.random()*500)+1;
        int randomMultiplicationNumOne = (int)(Math.random()*20)+1;
        int randomMultiplicationNumTwo = (int)(Math.random()*20)+1;

        if(randomOperation < 5){
            //This will be addition segment
            TextView equationView = findViewById(R.id.equationMonitor);
            equationView.setText(randomNumOne+" + "+randomNumTwo);
        }else //This will be subtraction
            if(randomOperation >5 && randomOperation< 10){
                TextView equationView = findViewById(R.id.equationMonitor);
                equationView.setText(randomNumOne+" - "+randomNumTwo);

        }else {
                TextView equationView = findViewById(R.id.equationMonitor);
                equationView.setText(randomMultiplicationNumOne + " × "
                        + randomMultiplicationNumTwo);

            }



    }
    public void checkScore(View view){
        TextView equation = findViewById(R.id.equationMonitor);

    }


}