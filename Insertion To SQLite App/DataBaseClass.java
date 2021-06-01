package com.example.databaseapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseClass extends SQLiteOpenHelper
{
    private static final String dbname = "Products";

    private static final String SqlCreateProductsTable =

            "CREATE TABLE Products" +
                    "(ProductId INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + "ProductName TEXT)";


    public DataBaseClass(@Nullable Context context) {
        super(context, dbname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SqlCreateProductsTable);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
