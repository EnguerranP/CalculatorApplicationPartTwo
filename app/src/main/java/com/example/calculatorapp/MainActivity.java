 package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Addition(View view){
        EditText firstInput = findViewById(R.id.editTextFirstInput);
        //Getting the edit Text into a string
        String firstValueString =firstInput.getText().toString();

        int  firstValue = Integer.parseInt(firstValueString); //This is the first input value

        EditText secondInput = findViewById(R.id.editTextSecondInput);

        String secondValueString = secondInput.getText().toString();

        int secondValue = Integer.parseInt(secondValueString); //This is the second input value

        int result = firstValue + secondValue;

        TextView resultView = findViewById(R.id.resultDisplay);

        resultView.setText(""+result); //result view should display the value


    }
    public void Subtraction(View view){
        EditText firstInput = findViewById(R.id.editTextFirstInput);
        String firstValueString =firstInput.getText().toString();
        int  firstValue = Integer.parseInt(firstValueString);
        EditText secondInput = findViewById(R.id.editTextSecondInput);
        String secondValueString = secondInput.getText().toString();
        int secondValue = Integer.parseInt(secondValueString); //This is the second input value

        int result = firstValue - secondValue;

        TextView resultView = findViewById(R.id.resultDisplay);

        resultView.setText(""+result); //result view should display the value



    }
    public void Multiplication(View view){
        EditText firstInput = findViewById(R.id.editTextFirstInput);
        String firstValueString =firstInput.getText().toString();
        int  firstValue = Integer.parseInt(firstValueString);
        EditText secondInput = findViewById(R.id.editTextSecondInput);
        String secondValueString = secondInput.getText().toString();
        int secondValue = Integer.parseInt(secondValueString); //This is the second input value

        int result = firstValue * secondValue;

        TextView resultView = findViewById(R.id.resultDisplay);

        resultView.setText(""+result); //result view should display the value
    }
    public void Division(View view){
        EditText firstInput = findViewById(R.id.editTextFirstInput);
        String firstValueString =firstInput.getText().toString();
        int  firstValue = Integer.parseInt(firstValueString);
        EditText secondInput = findViewById(R.id.editTextSecondInput);
        String secondValueString = secondInput.getText().toString();
        int secondValue = Integer.parseInt(secondValueString); //This is the second input value

        int result = firstValue / secondValue;

        TextView resultView = findViewById(R.id.resultDisplay);

        resultView.setText(""+result); //result view should display the value

    }
    public void Exponent(View view){
        EditText firstInput = findViewById(R.id.editTextFirstInput);
        String firstValueString =firstInput.getText().toString();
        int  firstValue = Integer.parseInt(firstValueString);
        EditText secondInput = findViewById(R.id.editTextSecondInput);
        String secondValueString = secondInput.getText().toString();
        int secondValue = Integer.parseInt(secondValueString); //This is the second input value

        int result = (int)Math.pow(firstValue,secondValue);

        TextView resultView = findViewById(R.id.resultDisplay);

        resultView.setText(""+result); //result view should display the value

    }

    public void switchScreens(View view){
        Intent intent= new Intent(this,SecondActivity.class);

        startActivity(intent);

    }

}