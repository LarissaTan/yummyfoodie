package com.example.yummyfoodie;

import android.app.Application;

public class utils extends Application {
    private static utils instance;

    public static utils getInstance(){
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        this.instance = utils.this;
    }
}
