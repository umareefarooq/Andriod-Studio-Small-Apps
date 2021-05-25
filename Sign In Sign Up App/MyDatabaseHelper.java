package com.example.signinsignupapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyDatabaseHelper extends SQLiteOpenHelper {

    private static final String DataBaseName = "Employee";
    private static final String tableCreation = "CREATE TABLE user" +
            "(username TEXT PRIMARY KEY ," +
            "email TEXT ," +
            "password TEXT," +
            "phoneNumber TEXT," +
            "address TEXT)";
    public MyDatabaseHelper(@Nullable Context context) {
        super(context, DataBaseName, null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(tableCreation);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop Table if exists users");
    }
    public boolean insertData(String username, String email, String password, String
            phonenumber, String address ){

        SQLiteDatabase mydb = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("username", username);
        cv.put("email", email);
        cv.put("password", password);
        cv.put("phonenumber", phonenumber);
        cv.put("address", address);
        long results = mydb.insert("user", null, cv);
        if(results == -1) return false;
        else
            return true;
    }
    public boolean checkUserName(String username){
        SQLiteDatabase mydb = this.getWritableDatabase();
        Cursor cursor = mydb.rawQuery("Select * From user where username = ?", new
                String[] {username});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }
    public boolean checkUserNamePassword(String username, String password){
        SQLiteDatabase mydb = this.getWritableDatabase();
        Cursor cursor = mydb.rawQuery("Select * From user where username = ? and password = ?", new String[] {username,password});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }
}
