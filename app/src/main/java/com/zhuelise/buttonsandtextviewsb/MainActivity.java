package com.zhuelise.buttonsandtextviewsb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button incrementButton;
    TextView greetingDisplay;
    String first = "";
    String second = "";
    int sum = 0;
    int prevSum = 0;
    String operation = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        greetingDisplay = findViewById(R.id.greeting_textview);
    }

    public void one(View view) {
        if(!operation.equals("")) {
            second = "1";
            greetingDisplay.setText(second);
        }
        else {
            first = "1";
            greetingDisplay.setText(first);
        }
    }

    public void two(View view) {
        if(!operation.equals("")) {
            second = "2";
            greetingDisplay.setText(second);
        }
        else {
            first = "2";
            greetingDisplay.setText(first);
        }
    }

    public void three(View view) {
        if(!operation.equals("")) {
            second = "3";
            greetingDisplay.setText(second);
        }
        else {
            first = "3";
            greetingDisplay.setText(first);
        }
    }

    public void four(View view) {
        if(!operation.equals("")) {
            second = "4";
            greetingDisplay.setText(second);
        }
        else {
            first = "4";
            greetingDisplay.setText(first);
        }
    }

    public void five(View view) {
        if(!operation.equals("")) {
            second = "5";
            greetingDisplay.setText(second);
        }
        else {
            first = "5";
            greetingDisplay.setText(first);
        }
    }

    public void six(View view) {
        if(!operation.equals("")) {
            second = "6";
            greetingDisplay.setText(second);
        }
        else {
            first = "6";
            greetingDisplay.setText(first);
        }
    }

    public void seven(View view) {
        if(!operation.equals("")) {
            second = "7";
            greetingDisplay.setText(second);
        }
        else {
            first = "7";
            greetingDisplay.setText(first);
        }
    }

    public void eight(View view) {
        if(!operation.equals("")) {
            second = "8";
            greetingDisplay.setText(second);
        }
        else {
            first = "8";
            greetingDisplay.setText(first);
        }
    }

    public void nine(View view) {
        if(!operation.equals("")) {
            second = "9";
            greetingDisplay.setText(second);
        }
        else {
            first = "9";
            greetingDisplay.setText(first);
        }
    }

    public void zero(View view) {
        if(!operation.equals("")) {
            second = "0";
            greetingDisplay.setText(second);
        }
        else {
            first = "0";
            greetingDisplay.setText(first);
        }
    }

    public void equals(View view) {
        if(operation.equals("+")) {
            if((Integer.parseInt(first) + Integer.parseInt(second))>100)
                greetingDisplay.setText(R.string.large_error_message);
            else {
                sum = Integer.parseInt(first) + Integer.parseInt(second);
                greetingDisplay.setText(""+sum);
            }
        }
        else if(operation.equals("-")) {
            if((Integer.parseInt(first) + Integer.parseInt(second))<-100)
                greetingDisplay.setText(R.string.small_error_message);
            else {
                sum = Integer.parseInt(first) - Integer.parseInt(second);
                greetingDisplay.setText(""+sum);
            }
        }
        prevSum = sum;
        first = ""+prevSum;
        second = "";
        operation = "";
    }

    public void answer(View view) {
        if(!operation.equals("")) {
            second = ""+prevSum;
            greetingDisplay.setText(second);
        }
        else {
            first = ""+prevSum;
            greetingDisplay.setText(first);
        }
    }

    public void add(View view) {
        if(!second.equals("")) {
            first = "" + (Integer.parseInt(first) + Integer.parseInt(second));
            if((Integer.parseInt(first) + Integer.parseInt(second))>100)
                greetingDisplay.setText(R.string.large_error_message);
        }
        else {
            operation = "+";
            greetingDisplay.setText(first+" + ");
        }
    }

    public void subtract(View view) {
        if(!second.equals("")) {
            first = "" + (Integer.parseInt(first) - Integer.parseInt(second));
            if ((Integer.parseInt(first) + Integer.parseInt(second)) < -100)
                greetingDisplay.setText(R.string.small_error_message);
        }
        else {
            operation = "-";
            greetingDisplay.setText(first + " - ");
        }
    }

    public void clear(View view) {
        greetingDisplay.setText("");
        first = "";
        second = "";
        operation = "";
        sum = 0;
    }
}