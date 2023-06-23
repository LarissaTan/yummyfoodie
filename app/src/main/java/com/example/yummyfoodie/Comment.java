package com.example.yummyfoodie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.yummyfoodie.bean.ChatMessageBean;
import com.example.yummyfoodie.comment.ChatMessageAdapter;

import java.util.ArrayList;
import java.util.List;

public class Comment extends AppCompatActivity {

    private List<ChatMessageBean> chatMessageBeans = new ArrayList<>();
    private RecyclerView rv_Chat;
    private ChatMessageAdapter adapter;
    private EditText et_chat_message;
    private Button btn_message_send;
    private String messages;
    private ImageView back;
    private ChatMessageBean chatMessageBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);
    }

    @Override
    protected void onStart() {
        super.onStart();

        initData();
        initView();
    }

    private void initData() {
        chatMessageBeans = new SQlite(this).getALLMSG();
    }

    private void initView() {
        rv_Chat = findViewById(R.id.rv_chat);
        et_chat_message = findViewById(R.id.et_chat_message);
        btn_message_send = findViewById(R.id.btn_message_send);
        back = findViewById(R.id.back_com);
        messages = et_chat_message.getText().toString();


        adapter = new ChatMessageAdapter(chatMessageBeans);
        rv_Chat.setItemAnimator(new DefaultItemAnimator());
        rv_Chat.setLayoutManager(new LinearLayoutManager(this));
        rv_Chat.setAdapter(adapter);
        rv_Chat.scrollToPosition(adapter.getItemCount()-1);

        //发送信息的判断和操作
        btn_message_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                messages = et_chat_message.getText().toString();
                if (TextUtils.isEmpty(messages)) {
                    Log.i("chat","empty");
                } else {
                    chatMessageBean = new ChatMessageBean(messages, Home.username, DateUtill.getCurrentTime());
                    new SQlite(view.getContext()).addMsg(messages,Home.username, DateUtill.getCurrentTime());
                    adapter.refreshMessages();
                }
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(view.getContext(),Home.class);
            }
        });
    }
}