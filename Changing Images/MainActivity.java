package com.example.imageevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeImage(View view) {

        //capture imageview
        ImageView iv = (ImageView)findViewById(R.id.iv1);

        //change image
        iv.setImageResource(R.drawable.img2);

    }

    public void changeImage1(View view) {
        //capture imageview
        ImageView iv2 = (ImageView)findViewById(R.id.iv2);

        //change image
        iv2.setImageResource(R.drawable.img4);
    }
}