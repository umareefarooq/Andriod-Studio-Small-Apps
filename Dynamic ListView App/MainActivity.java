package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)findViewById(R.id.lv2);
        //step 1
        String programs [] = {"BSSE", "BCS", "BSDS", "BSAI"};
        //step 2
        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, programs);
        //step 3
        ListView list = (ListView)findViewById(R.id.lv2);
        list.setAdapter(adp);
    }
}