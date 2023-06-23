package com.example.yummyfoodie;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.yummyfoodie.dao.User;

import androidx.appcompat.app.AppCompatActivity;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class Login extends AppCompatActivity {

    private SQlite mSQlite;
    private EditText username;
    private EditText userpassword;
    private Button login;
    private Button register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = findViewById(R.id.login);
        register = findViewById(R.id.register);
        username = findViewById(R.id.userName);
        userpassword = findViewById(R.id.userpassword);


        SharedPreferences preferences = getSharedPreferences("name", MODE_PRIVATE);
        String name = preferences.getString("name", null);
        username.setText(name);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(Login.this, Register.class);
                startActivity(intent5);

                finish();
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = username.getText().toString().trim();
                String password = userpassword.getText().toString().trim();
                if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(password)) {
                    ArrayList<User> data = mSQlite.getAllDATA();
                    boolean userdata = false;
                    for (int i = 0; i < data.size(); i++) {
                        User user= data.get(i);
                        if (name.equals(user.getName()) && password.equals(user.getPassword())) {
                            userdata = true;
                            break;
                        } else {
                            userdata = false;
                        }
                    }
                    if (userdata) {
                        Toast.makeText(Login.this, "Login successfully", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Login.this, Home.class);
                        intent.putExtra("username",name);
                        intent.putExtra("password",password);
                        startActivity(intent);
                        finish();
                    } else {
                        Toast.makeText(Login.this, "wrong username or password", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(Login.this, "empty username or password", Toast.LENGTH_SHORT).show();
                }
            }

        });
        mSQlite = new SQlite(Login.this);
    }
}