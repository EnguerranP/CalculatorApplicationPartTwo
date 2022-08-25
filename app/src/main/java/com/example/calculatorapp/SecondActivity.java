package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        TextView equationView = findViewById(R.id.equationMonitor);
        TextView operationView = findViewById(R.id.operationSign);
        TextView equationViewTwo = findViewById(R.id.equationMonitor2);

        if(randomOperation < 5){
            //This will be addition segment
            String randOne = String.valueOf(randomNumOne);
            String randTwo = String.valueOf(randomNumOne);


            equationView.setText(randOne);
            operationView.setText(" + ");
            equationViewTwo.setText(randTwo);
        }else //This will be subtraction
            if(randomOperation >5 && randomOperation< 10){
                String randOne = String.valueOf(randomNumOne);
                String randTwo = String.valueOf(randomNumOne);


                equationView.setText(randOne);
                operationView.setText(" - ");
                equationViewTwo.setText(randTwo);

        }else {

                String randMOne = String.valueOf(randomMultiplicationNumOne);
                String randMTwo = String.valueOf(randomMultiplicationNumTwo);

                equationView.setText(randMOne);
                operationView.setText(" × ");
                equationViewTwo.setText(randMTwo);

            }



    }
    public void checkScore(View view){

    }

    public void switchScreens(View view){
        Intent intent= new Intent(this,MainActivity.class);

        startActivity(intent);
    }



}