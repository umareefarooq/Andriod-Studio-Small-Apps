package com.example.explicitintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Newactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newactivity);

        //retrieving the data here

        Intent i = getIntent();
        String cn = i.getStringExtra("classname");
        String tn = i.getStringExtra("toppername");
        Integer m = i.getIntExtra("marks", 0);

        //showing the data in the new activity
        TextView tv = findViewById(R.id.tv1);
        tv.setText(cn + " " + tn + " " + String.valueOf(m) );
    }
}