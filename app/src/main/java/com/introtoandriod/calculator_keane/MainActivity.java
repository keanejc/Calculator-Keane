package com.introtoandriod.calculator_keane;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Load views
    TextView textView = (TextView) findViewById(R.id.textView);

    Button button1 = (Button) findViewById(R.id.button1);
    Button button2 = (Button) findViewById(R.id.button2);
    Button button3 = (Button) findViewById(R.id.button3);
    Button button4 = (Button) findViewById(R.id.button4);
    Button button5 = (Button) findViewById(R.id.button5);
    Button button6 = (Button) findViewById(R.id.button6);
    Button button7 = (Button) findViewById(R.id.button7);
    Button button8 = (Button) findViewById(R.id.button8);
    Button button9 = (Button) findViewById(R.id.button9);
    Button button0 = (Button) findViewById(R.id.button0);
    Button multButton = (Button) findViewById(R.id.multButton);
    Button divButton = (Button) findViewById(R.id.divButton);
    Button plusButton = (Button) findViewById(R.id.plusButton);
    Button minusButton = (Button) findViewById(R.id.minusButton);
    Button ceButton = (Button) findViewById(R.id.ceButton);
    Button cButton = (Button) findViewById(R.id.cButton);
    Button eButton = (Button) findViewById(R.id.eButton);


    // Variables
    String answer;
    String newNum;
    String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answer = null;
        newNum = null;
        operation = null;


        // Set onClick event listeners
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( operation != null){
                    newNum += 1;
                    textView.setText(newNum);
                }
                else {
                    answer += 1;
                    textView.setText(answer);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( operation != null){
                    newNum += 2;
                    textView.setText(newNum);
                }
                else {
                    answer += 2;
                    textView.setText(answer);
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( operation != null){
                    newNum += 3;
                    textView.setText(newNum);
                }
                else {
                    answer += 3;
                    textView.setText(answer);
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( operation != null){
                    newNum += 4;
                    textView.setText(newNum);
                }
                else {
                    answer += 4;
                    textView.setText(answer);
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( operation != null){
                    newNum += 5;
                    textView.setText(newNum);
                }
                else {
                    answer += 5;
                    textView.setText(answer);
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( operation != null){
                    newNum += 6;
                    textView.setText(newNum);
                }
                else {
                    answer += 6;
                    textView.setText(answer);
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( operation != null){
                    newNum += 7;
                    textView.setText(newNum);
                }
                else {
                    answer += 7;
                    textView.setText(answer);
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( operation != null){
                    newNum += 8;
                    textView.setText(newNum);
                }
                else {
                    answer += 8;
                    textView.setText(answer);
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( operation != null){
                    newNum += 9;
                    textView.setText(newNum);
                }
                else {
                    answer += 9;
                    textView.setText(answer);
                }
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( operation != null){
                    newNum += 0;
                    textView.setText(newNum);
                }
                else {
                    answer += 0;
                    textView.setText(answer);
                }
            }
        });

        multButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operation != null){
                    answer = Integer.toString(calculate(Integer.parseInt(answer), Integer.parseInt(newNum), operation));
                    textView.setText(answer);
                }
                operation = "multiply";
            }
        });

        divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operation != null){
                    answer = Integer.toString(calculate(Integer.parseInt(answer), Integer.parseInt(newNum), operation));
                    textView.setText(answer);
                }
                operation = "divide";
            }
        });

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operation != null){
                    answer = Integer.toString(calculate(Integer.parseInt(answer), Integer.parseInt(newNum), operation));
                    textView.setText(answer);
                }
                operation = "add";
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(operation != null){
                    answer = Integer.toString(calculate(Integer.parseInt(answer), Integer.parseInt(newNum), operation));
                    textView.setText(answer);
                }
                operation = "minus";
            }
        });
    // reset all variables except for the operation
        ceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer = null;
                newNum = null;
                textView.setText("0");
            }
        });

    // reset everything
        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer = null;
                newNum = null;
                textView.setText("0");
                operation = null;
            }
        });
    // = Button - clear operation and newNum, leave answer as is
        eButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer = Integer.toString(calculate(Integer.parseInt(answer), Integer.parseInt(newNum), operation));
                textView.setText(answer);
                operation = null;
                newNum = null;
            }
        });
    }

    private int calculate(int answer, int newNum, String operation) {
        int rtrnval = 0;

        // switch based on what 'operation' is
        switch(operation){
            case "add":
               rtrnval = answer + newNum;
            case "minus":
                rtrnval = answer - newNum;
            case "divide":
                rtrnval = answer / newNum;
            case "multiply":
                rtrnval = answer * newNum;
        }

        return rtrnval;
    }

    @Override
    protected void onSaveInstanceState( Bundle savedInstanceState){
        savedInstanceState.putCharSequence("view", textView.getText());
        savedInstanceState.putString("op", operation);
        savedInstanceState.putString("ans", answer);
        savedInstanceState.putString("new", newNum);

    }

    @Override
    protected void onRestoreInstanceState( Bundle savedInstanceState){
        textView.setText(savedInstanceState.getCharSequence("view"));
        operation = savedInstanceState.getString("op");
        answer = savedInstanceState.getString("ans");
        newNum = savedInstanceState.getString("new");
    }
}
