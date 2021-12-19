package com.exam.metering;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.exam.metering.viewClassFragment.Class_info_item;

import java.util.List;

public class category extends AppCompatActivity {
    private RecyclerView rv;
    private LinearLayoutManager llm;
    private List<Class_info_item> count;
    RvAdapter adapter;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        rv = (RecyclerView) findViewById(R.id.mRecyclerView);
        Log.d("으잉", rv.toString());
        llm = new LinearLayoutManager(this);

        rv.setHasFixedSize(true);
        rv.setLayoutManager(llm);

        Log.d("해? ","해야해야해야만해");
        adapter= new RvAdapter(3);
        Log.d("이건가?", "문제?3");
        adapter.addClassItem(new Class_info_item((long) 1001, "프로그래밍 배우기", "대면", 2 , 3, "맨시매시",3,1,48, 11000));
        adapter.addClassItem(new Class_info_item((long) 1002, "모여봐요 C언어", "비대면", 2 , 4, "아이유스크림",2,1,36, 10000));

        rv.setAdapter(adapter);
        Log.d("문제가 모니", adapter.toString());
  //      ActivityCategoryBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_category);

    }
}