package com.example.sharedpreferenceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

public class SecondActiviy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activiy);

        EditText et = (EditText)findViewById(R.id.editText);
        SharedPreferences sp = getSharedPreferences("user_choices", Activity.MODE_PRIVATE);
        String fc = sp.getString("choosenColor","Black");
        et.setText(fc);
    }
}