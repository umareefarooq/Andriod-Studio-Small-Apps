package com.example.checkboxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox cb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb = (CheckBox)findViewById(R.id.cb1);
    }

    public void check(View view) {
        if (cb.isChecked()) {
            Toast.makeText(this, "Accepted terms", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Not Accepted terms", Toast.LENGTH_LONG).show();
        }
    }
}