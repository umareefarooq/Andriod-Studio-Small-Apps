package com.example.optionmenuapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.login)
        {
            Toast.makeText(this, "Login", Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.logout)
        {
            Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId()==R.id.about)
        {
            Toast.makeText(this, "About Us", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}