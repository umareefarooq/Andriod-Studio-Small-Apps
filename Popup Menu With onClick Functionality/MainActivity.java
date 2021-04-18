package com.example.popupmenuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnpopup(View view) {

        PopupMenu popup = new PopupMenu(MainActivity.this, view);
        popup.getMenuInflater().inflate(R.menu.popupmenu, popup.getMenu());
        popup.show();

        //onclick functionality

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem)
            {

                if(menuItem.getItemId()==R.id.one)
                {
                    Toast.makeText(MainActivity.this, "One", Toast.LENGTH_SHORT).show();
                }
                if(menuItem.getItemId()==R.id.two)
                {
                    Toast.makeText(MainActivity.this, "Two", Toast.LENGTH_SHORT).show();
                }
                if(menuItem.getItemId()==R.id.three)
                {
                    Toast.makeText(MainActivity.this, "Three", Toast.LENGTH_SHORT).show();
                }
                if(menuItem.getItemId()==R.id.four)
                {
                    Toast.makeText(MainActivity.this, "Four", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });


    }
}