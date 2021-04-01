package com.example.radiobuttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        private RadioGroup rg;
        private RadioButton rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = (RadioGroup)findViewById(R.id.gender);
    }

    public void check(View view) {

        //gender = Radio Group
        //storing ID of checked radio Button
        int id = rg.getCheckedRadioButtonId();
        if(id!= -1) {

            //Radio button assigning checked radio button
            rb = (RadioButton) findViewById(id);
            String a = rb.getText().toString();
            Toast.makeText(this, a, Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Select  a Gender", Toast.LENGTH_LONG).show();
        }
    }
}