package com.example.abcshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rg1, rg2;
    private RadioButton rb1, rb2;
    private CheckBox cb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg1 = (RadioGroup)findViewById(R.id.rg1);
        rg2 = (RadioGroup)findViewById(R.id.rg2);
        cb = (CheckBox)findViewById(R.id.cb);
    }

    public void orderFunction(View view) {

        int id = rg1.getCheckedRadioButtonId();
        int id2 = rg2.getCheckedRadioButtonId();

        if(id!= -1 && id2!= -1) {
            //Radio button assigning checked radio button
            rb1 = (RadioButton)findViewById(id);
            String a = rb1.getText().toString();

            rb2 = (RadioButton)findViewById(id2);
            String b = rb2.getText().toString();
            //toast for order
            Toast.makeText(this, "The Customer choose "+a + " "+ b, Toast.LENGTH_LONG).show();
            if(cb.isChecked()){
                Toast.makeText(this, "The Customer has Agreed to the Terms ", Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(this, "The Customer has NOT Agreed to the Terms ", Toast.LENGTH_LONG).show();
            }

        }
        else
        {
            Toast.makeText(this, " Select Size & Color ", Toast.LENGTH_LONG).show();
        }
    }
}