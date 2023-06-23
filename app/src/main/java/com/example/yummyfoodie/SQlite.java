package com.example.yummyfoodie;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.yummyfoodie.bean.ChatMessageBean;
import com.example.yummyfoodie.dao.User;

import java.util.ArrayList;

public class SQlite extends SQLiteOpenHelper {
    private SQLiteDatabase db;

    public SQlite(Context context) {
        super(context, "db_test", null, 1);
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS messagesInfo(" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "message TEXT," +
                "userName VERVHAR(20)," +
                "time VERVHAR(20))");

        db.execSQL("CREATE TABLE IF NOT EXISTS user(" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT," +
                "password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS user");
        db.execSQL("DROP TABLE IF EXISTS messagesInfo");
        onCreate(db);
    }
    public void add(String name,String password ){
        db.execSQL("INSERT INTO user(name,password)VALUES(?,?)",new Object[]{name,password});
    }

    public void addMsg(String msg, String name, String time){
        db.execSQL("INSERT INTO messagesInfo(message, userName, time) VALUES (?, ?, ?)", new Object[]{msg, name, time});
    }

    public ArrayList<ChatMessageBean> getALLMSG(){
        ArrayList<ChatMessageBean> list = new ArrayList<>();
        Cursor cursor = db.query("messagesInfo", null, null, null, null, null, "time");
        while (cursor.moveToNext()) {
            String name = cursor.getString(2);
            String msg = cursor.getString(1);
            String time = cursor.getString(3);
            list.add(new ChatMessageBean(msg, name, time));
        }
        cursor.close();
        return list;
    }

    public ArrayList<User> getAllDATA(){
        ArrayList<User> list = new ArrayList<>();
        Cursor cursor = db.query("user", null, null, null, null, null, "name DESC");
        while (cursor.moveToNext()) {
            String name = cursor.getString(1);
            String password = cursor.getString(2);
            list.add(new User(name, password));
        }
        cursor.close();
        return list;
    }
}
