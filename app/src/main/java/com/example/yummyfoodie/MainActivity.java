package com.example.yummyfoodie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Timer timer = new Timer();

        // make the animation working for 3 sec
        timer.schedule(new TimerTask() {
            public void run() {
                Intent it = new Intent(MainActivity.this, Login.class);
                startActivity(it);
                finish();
            }
        }, 5000);
    }

}