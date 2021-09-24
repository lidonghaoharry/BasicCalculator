package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public void clickFunction(View view) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        int n1 = Integer.parseInt(firstNumber.getText().toString());
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        int n2 = Integer.parseInt(secondNumber.getText().toString());
        int sum = n1 + n2;
        String sum1 = String.valueOf(sum);
        goToActivity2(sum1);
    }
    public void clickFunction2(View view2) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        int n1 = Integer.parseInt(firstNumber.getText().toString());
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        int n2 = Integer.parseInt(secondNumber.getText().toString());
        int sub = n1 - n2;
        String sub1 = String.valueOf(sub);
        goToActivity2(sub1);
    }
    public void clickFunction3(View view3) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        int n1 = Integer.parseInt(firstNumber.getText().toString());
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        int n2 = Integer.parseInt(secondNumber.getText().toString());
        int product = n1 * n2;
        String product1 = String.valueOf(product);
        goToActivity2(product1);
    }
    public void clickFunction4(View view4) {
        EditText firstNumber = (EditText) findViewById(R.id.firstNumber);
        int n1 = Integer.parseInt(firstNumber.getText().toString());
        EditText secondNumber = (EditText) findViewById(R.id.secondNumber);
        int n2 = Integer.parseInt(secondNumber.getText().toString());
        double division = (double)n1 / (double) n2;
        String division1 = String.valueOf(division);
        goToActivity2(division1);
    }
    public void goToActivity2(String n) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message",n);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}