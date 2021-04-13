package com.example.sharedpreferenceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeActivity(View view) {
        EditText et = (EditText)findViewById(R.id.et);

        SharedPreferences sp = getSharedPreferences("user_choices", Activity.MODE_PRIVATE);
        String fc = sp.getString("choosenColor","Black");

        SharedPreferences.Editor editor = sp.edit();
        editor.putString("choosenColor", et.getText().toString());
        editor.commit();

        Intent in = new Intent(this,SecondActiviy.class);
        startActivity(in);
    }
}