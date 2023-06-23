package com.example.yummyfoodie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
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
        }
        startActivity(intent);
    }

}