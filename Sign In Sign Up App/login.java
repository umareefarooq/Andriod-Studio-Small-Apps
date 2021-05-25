package com.example.signinsignupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {


    EditText un,pass;
    Button logInBtn;
    MyDatabaseHelper dbhelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        un = (EditText) findViewById(R.id.username1);
        pass = (EditText) findViewById(R.id.password1);
        logInBtn = (Button) findViewById(R.id.loginbtn);
        dbhelper = new MyDatabaseHelper(this);
        logInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = un.getText().toString();
                String password = pass.getText().toString();
                if (username.equals("") || password.equals("")) {
                    Toast.makeText(login.this, "Please fill all the fields.",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Boolean checkuserpass = dbhelper.checkUserNamePassword(username,
                            password);
                    if (checkuserpass == true) {
                        Toast.makeText(login.this, "Signed In Successfully",
                                Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(),
                                home.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(login.this, "Invalid UserName/Password",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}