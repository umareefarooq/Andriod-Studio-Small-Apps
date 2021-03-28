package com.example.sumapp;

import androidx.appcompat.app.AppCompatActivity;

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

    public void Addition(View view) {

        EditText et1 = (EditText)findViewById(R.id.num1);
        String n1 = et1.getText().toString();

        EditText et2 = (EditText)findViewById(R.id.num2);
        String n2 = et2.getText().toString();

        int answer = Integer.parseInt(n1) + Integer.parseInt(n2);

        String a = answer+"";

        TextView tv1 = (TextView)findViewById(R.id.tv1);
        tv1.setText(a);
    }
}