package com.example.withoutonsaveapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstName, lastName, titleEmp;
    TextView first, last, title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstName = (EditText)findViewById(R.id.editText4);
        lastName = (EditText)findViewById(R.id.editText5);
        titleEmp = (EditText)findViewById(R.id.editText6);

        first = (TextView)findViewById(R.id.textView4);
        last = (TextView)findViewById(R.id.textView5);
        title = (TextView)findViewById(R.id.textView6);
    }

    public void doSomething(View view) {
        first.setText(firstName.getText().toString());
        last.setText(lastName.getText().toString());
        title.setText(titleEmp.getText().toString());
    }
}