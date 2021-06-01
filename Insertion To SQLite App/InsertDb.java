package com.example.databaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class InsertDb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_db);
    }

    public void insertRecord(View view) {

        EditText et = (EditText)findViewById(R.id.Product);
        String value = et.getText().toString();

        //create & initialize dbhelper
        DataBaseClass dbhelper = new DataBaseClass(this);

        //sqldatebase and helper link plus get writable db
        SQLiteDatabase db = dbhelper.getWritableDatabase();

        //cv object
        ContentValues cv = new ContentValues();
        cv.put("ProductName", value);

       long id =  db.insert("Products", "ProductId", cv); //returns row id where insertion is performed
        Toast.makeText(this, "Item Inserted at " +  id+"", Toast.LENGTH_SHORT).show();
    }
}