package com.example.yummyfoodie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {
    public static String username;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // 获取传递的Intent
        Intent intent = getIntent();

        // 提取username和password的值
        username = intent.getStringExtra("username");
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        switch (view.getId()){
            case R.id.btn1:
            intent.setClass(this,InfoListActivity.class);
                break;
            case R.id.btn2:
             intent.setClass(this,Details.class);
                break;
            case R.id.btn3:
                intent.setClass(this,Comment.class);
        }
        startActivity(intent);
    }

}