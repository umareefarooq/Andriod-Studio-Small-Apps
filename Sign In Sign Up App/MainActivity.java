package com.example.signinsignupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {





    EditText username, email, password, repass, phone_no, address;
    Button signup, signin;
    MyDatabaseHelper dbHelper ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText)findViewById(R.id.username);
        email = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.password);
        repass = (EditText)findViewById(R.id.retypepass);
        phone_no = (EditText)findViewById(R.id.phoneNo);
        address = (EditText)findViewById(R.id.addresss);
        signup = (Button)findViewById(R.id.signupbtn);
        signin= (Button)findViewById(R.id.signinbtn);
        dbHelper = new MyDatabaseHelper(this);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String UserName = username.getText().toString();
                String Email = email.getText().toString();
                String Password = password.getText().toString();
                String Repass = repass.getText().toString();
                String PhoneNumber = phone_no.getText().toString();
                String Address = address.getText().toString();
                if(UserName.equals("")||Email.equals("")||Password.equals("")||Repass.equals("")||PhoneNumber.equals("")||Address.equals(""))
                Toast.makeText(MainActivity.this, "Please Fill in All fields",
                        Toast.LENGTH_SHORT).show();
else{
                    if(Password.equals(Repass)){
                        Boolean checkuser = dbHelper.checkUserName(UserName);
                        if(checkuser == false){
                            Boolean insert = dbHelper.insertData(UserName, Email,
                                    Password, PhoneNumber, Address);
                            if(insert= true){
                                Toast.makeText(MainActivity.this, "Registered!",
                                        Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(),
                                        home.class);
                                startActivity(intent);
                            }
                            else

                                Toast.makeText(MainActivity.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                        }
                        else
                            Toast.makeText(MainActivity.this, "User Already Exists, SignIn", Toast.LENGTH_SHORT).show();
                    }
                    else{

                        Toast.makeText(MainActivity.this, "Password Doesn't Match",
                                Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), login.class);
                startActivity(intent);
            }

        });
    }
}