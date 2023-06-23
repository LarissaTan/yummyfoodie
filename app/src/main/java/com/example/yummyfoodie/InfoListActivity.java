package com.example.yummyfoodie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class InfoListActivity extends AppCompatActivity implements View.OnClickListener{

    EditText searchEt;
    ImageView searchIv,flushIv,back;
    ListView showLv;
    List<FoodBean>mDatas;
    List<FoodBean>allFoodList;
    private InfoListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_list);

        initView();
        mDatas = new ArrayList<>();
        allFoodList = FoodUtils.getAllFoodList();
        mDatas.addAll(allFoodList);
        adapter = new InfoListAdapter(this, mDatas);
        showLv.setAdapter(adapter);
        setListener();
    }

    private void setListener() {
        showLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FoodBean foodBean = mDatas.get(position);
                Intent intent = new Intent(InfoListActivity.this, FoodDetailActivity.class);
                intent.putExtra("food", foodBean);
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfoListActivity.this, Home.class);
                startActivity(intent);
            }
        });

        searchIv.setOnClickListener(this);
        flushIv.setOnClickListener(this);
    }


    private void initView() {
        searchEt = findViewById(R.id.et_sousuo);
        searchIv = findViewById(R.id.sousuo);
        flushIv = findViewById(R.id.img_shuaxin);
        showLv = findViewById(R.id.lv_list);
        back = findViewById(R.id.info_list_back);
        searchIv.setOnClickListener(this);
        flushIv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.sousuo:
                String msg = searchEt.getText().toString().trim();
                if (TextUtils.isEmpty(msg)){
                    Toast.makeText(this,"search bar cant be empty!",Toast.LENGTH_LONG).show();
                    return;
                }
                List<FoodBean> list = new ArrayList<>();
                for (int i = 0; i <allFoodList.size() ; i++) {
                    String title = allFoodList.get(i).getTitle();
                    if (title.contains(msg)) {
                        list.add(allFoodList.get(i));

                    }
                }
                mDatas.clear();
                mDatas.addAll(list);
                adapter.notifyDataSetChanged();
                break;
            case R.id.img_shuaxin:
                mDatas.clear();
                mDatas.addAll(allFoodList);
                adapter.notifyDataSetChanged();
                break;
        }
    }
}
