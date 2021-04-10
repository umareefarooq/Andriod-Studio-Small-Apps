package com.example.explicitintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openactivity(View view) {
        // making explicit intent
        Intent i = new Intent(this, Newactivity.class);


        //the below lines have key value pairs, through which we will be sending data from this activity to the other one.

        i.putExtra("classname", "Bsse-B");
        i.putExtra("toppername", "Umar Farooq");
        i.putExtra("marks", 30);
        startActivity(i);
    }
}