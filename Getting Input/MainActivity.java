package com.example.inputdata;

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

    public void getData(View view) {

        //get input data from edittext
        EditText ed = (EditText)findViewById(R.id.et1);

        //get textview
        TextView tv = (TextView)findViewById(R.id.tv1);

        tv.setText(ed.getText());
    }
}