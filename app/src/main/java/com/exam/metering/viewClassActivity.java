package com.exam.metering;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.exam.metering.viewClassFragment.planFragment;
import com.exam.metering.viewClassFragment.reviewFragment;
import com.exam.metering.viewClassFragment.scheduleFragment;
import com.google.android.material.tabs.TabLayout;

public class viewClassActivity extends AppCompatActivity {
    ImageView class_img;
    Fragment planfragment, schedulefragment, reviewfragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_class);
        class_img = (ImageView) findViewById(R.id.class_img);
        class_img.setClipToOutline(true);

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