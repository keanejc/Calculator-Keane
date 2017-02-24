package com.introtoandriod.calculator_keane;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView view = (TextView) findViewById(R.id.textView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onSaveInstanceState( Bundle savedInstanceState){
        savedInstanceState.putCharSequence("view", view.getText());

    }

    @Override
    protected void onRestoreInstanceState( Bundle savedInstanceState){
        view.setText(savedInstanceState.getCharSequence("view"));
    }
}
