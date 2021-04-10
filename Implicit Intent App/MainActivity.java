package com.example.implicitintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ImplicitInt(View view) {
        Uri uri = Uri.parse("http://www.google.com");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);

    }

    public void ImplicitIntCall(View view) {
        Uri uri = Uri.parse("tel:8005551234");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(it);

    }

    public void ImplicitIntMap(View view) {
        Uri uri = Uri.parse("geo:40.71, 74.00");
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(it);
    }
}