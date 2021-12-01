package com.exam.metering;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.exam.metering.viewClassFragment.Review_info_item;
import com.exam.metering.viewClassFragment.planFragment;
import com.exam.metering.viewClassFragment.reviewFragment;
import com.exam.metering.viewClassFragment.scheduleFragment;
import com.google.android.material.tabs.TabLayout;

public class viewClassActivity extends AppCompatActivity {
    com.yinglan.shadowimageview.ShadowImageView class_img;
    Fragment planfragment, schedulefragment, reviewfragment;
    private RecyclerView rv;
    private LinearLayoutManager llm;
    RvAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_class);

        //rv
        rv = (RecyclerView) findViewById(R.id.class_tag_rv);
        llm = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        rv.setHasFixedSize(true);
        rv.setLayoutManager(llm);

        adapter = new RvAdapter(2);
        adapter.addItem(new Review_info_item("성실함"));
        adapter.addItem(new Review_info_item("성실함1"));
        adapter.addItem(new Review_info_item("성실함2"));
        adapter.addItem(new Review_info_item("성실함3"));

        rv.setAdapter(adapter);

        //img
        class_img = (com.yinglan.shadowimageview.ShadowImageView) findViewById(R.id.class_img);
        class_img.setClipToOutline(true);

        //tab
        planfragment = new planFragment();
        schedulefragment = new scheduleFragment();
        reviewfragment = new reviewFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.frame, planfragment).commit();
        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                Fragment selected = null;
                if(position == 0){
                    selected = planfragment;
                }else if (position == 1){
                    selected = schedulefragment;
                }else if (position == 2){
                    selected = reviewfragment;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frame, selected).commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) { }

            @Override
            public void onTabReselected(TabLayout.Tab tab) { }
        });
    }


}