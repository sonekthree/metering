package com.exam.metering;

import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    Fragment fragment_home;
    Fragment fragment_match;
    Fragment fragment_search;
    Fragment fragment_my;
    ViewPager2 viewPager2;
    private Handler sliderHandler = new Handler();

    private Runnable sliderRunnable = new Runnable() {
        @Override
        public void run() {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment_home = new homePage();
        fragment_match = new matchPage();
        fragment_search = new searchPage();
        fragment_my = new myPage();

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        // 초기 플래그먼트 설정
        getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, fragment_home).commitAllowingStateLoss();


        // 바텀 네비게이션
        bottomNavigationView = findViewById(R.id.bottomNavigationView);


        // 리스너 등록
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.item_homePage:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, fragment_home).commitAllowingStateLoss();
                        return true;
                    case R.id.item_matchPage:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, fragment_match).commitAllowingStateLoss();
                        return true;
                    case R.id.item_searchPage:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, fragment_search).commitAllowingStateLoss();
                        return true;
                    case R.id.item_myPage:
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, fragment_my).commitAllowingStateLoss();
                        return true;
                }
                return true;
            }
        });


    }


}