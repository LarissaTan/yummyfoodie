package com.example.yummyfoodie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
        private SQlite mSQlite;
        private EditText username;
        private EditText userpassword;
        private Button reday;
        private Button back;
        NotificationManager manager;
        Notification notification;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_register);
            reday = findViewById(R.id.reday);
            back = findViewById(R.id.back);
            username = findViewById(R.id.userName);
            userpassword =findViewById( R.id.userpassword);
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Register.this,Login.class);
                    startActivity(intent);
                    finish();
                }
            });
            reday.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name = username.getText().toString().trim();
                    String password = userpassword.getText().toString().trim();
                    if(!TextUtils.isEmpty(name)&&!TextUtils.isEmpty(password)){
                        mSQlite.add(name,password);
                        Intent intent1 = new Intent(Register.this,Login.class);
                        startActivity(intent1);
                        SharedPreferences preferences = getSharedPreferences("name", MODE_PRIVATE);
                        SharedPreferences.Editor edit = preferences.edit();
                        edit.putString("name",name);
                        edit.commit();
                        manager.notify(1,notification);
                        finish();
                        Toast.makeText(Register.this,"注册成功",Toast.LENGTH_SHORT).show();
                    }else {Toast.makeText(Register.this,"信息不完备，注册失败",Toast.LENGTH_SHORT).show();}
                }
            });
            mSQlite = new SQlite(Register.this);



            Intent intent = new Intent(this, Login.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);


            manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

            notification = new NotificationCompat.Builder(this,"channel1")
                    .setContentTitle("Information")
                    .setContentText("welcome~~")
                    .setSmallIcon(R.drawable.touxiang1  )
                    .setColor(Color.parseColor("#FF0000"))
                    .setLargeIcon(BitmapFactory.decodeResource(getResources(),
                            R.drawable.touxiang1))
                    .setContentIntent(pendingIntent)
                    .setAutoCancel(true)
                    .build();


            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
                NotificationChannel notificationChannel = new NotificationChannel("channel1", "测试通知", NotificationManager.IMPORTANCE_HIGH);
                manager.createNotificationChannel(notificationChannel);
            }
        }

    public void onClick(View view) {
        manager.notify(1,notification);
    }
}