package com.exam.metering;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.exam.metering.viewClassFragment.Review_info_item;

import java.util.List;

public class
profileActivity extends AppCompatActivity {
    private RecyclerView rv;
    private LinearLayoutManager llm;
    private TextView avg_tv;
    private List<Review_info_item> count;
    RvAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        rv = (RecyclerView) findViewById(R.id.main_rv);
        llm = new LinearLayoutManager(this);

        avg_tv = (TextView) findViewById(R.id.avg);

        rv.setHasFixedSize(true);
        rv.setLayoutManager(llm);

        adapter = new RvAdapter(0);
        adapter.addItem(new Review_info_item((float) 3.0, "너무 좋았어요"));
        adapter.addItem(new Review_info_item((float) 2.0, "별로인듯!"));

        avg_tv.setText(""+Review_info_item.totalRating/Review_info_item.size);


        rv.setAdapter(adapter);
    }
}