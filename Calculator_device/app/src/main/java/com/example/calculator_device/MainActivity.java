package com.example.calculator_device;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String op = "+";
    String oldNum = "";
    EditText ed1;
    boolean newOp = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1= findViewById(R.id.editText);
    }

    public void numberEvent(View view) {
        if(newOp)
            ed1.setText("");
            newOp = false;
        String number = ed1.getText().toString();
        switch (view.getId()) {

            case R.id.bu0 :
                number += "0";
                break;

            case R.id.bu1 :
                number += "1";
                break;

            case R.id.bu2 :
                number += "2";
                break;

            case R.id.bu3 :
                number += "3";
                break;

            case R.id.bu4 :
                number += "4";
                break;

            case R.id.bu5 :
                number += "5";
                break;

            case R.id.bu6 :
                number += "6";
                break;

            case  R.id.bu7:
                number += "7";
                break;

            case R.id.bu8 :
                number += "8";
                break;

            case R.id.bu9 :
                number += "9";
                break;

            case R.id.buPoint :
                number += ".";
                break;

            case R.id.buPlusMoins :
                number = "-" + number ;
                break;

            }
        ed1.setText(number);
    }

    public void opEvent(View view) {
        newOp = true;
        oldNum = ed1.getText().toString();
        switch (view.getId()) {
            case R.id.buDiv : op = "/"; break;
            case R.id.buPlus : op = "+"; break;
            case R.id.buMoins : op = "-"; break;
            case R.id.buMulti : op = "*"; break;
        }
    }

    public void equalEvent(View view) {
        String newNum = ed1.getText().toString();
        double result = 0.0;
        switch (op){
            case "+" : result = Double.parseDouble(oldNum) + Double.parseDouble(newNum); break;
            case "-" : result = Double.parseDouble(oldNum) - Double.parseDouble(newNum); break;
            case "/" : result = Double.parseDouble(oldNum) / Double.parseDouble(newNum); break;
            case "*" : result = Double.parseDouble(oldNum) * Double.parseDouble(newNum); break;
        }
        ed1.setText(result + "");
    }

    public void acEvent(View view) {
        ed1.setText("0");
        newOp = true;
    }

    public void percentEvent(View view) {
        newOp = true;
        double p = 0.0;
        p = Double.parseDouble(ed1.getText().toString()) / 100;
        ed1.setText(p + "");
    }
}