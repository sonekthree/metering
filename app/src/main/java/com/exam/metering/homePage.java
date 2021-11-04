package com.exam.metering;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class homePage extends Fragment {

    ViewPager2 viewPager2;
    Button btnToggle;
    private Handler sliderHandler = new Handler();
    boolean flag = true;
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_home_page);
//
//        viewPager2 = findViewById(R.id.viewPager2);
//
//        ArrayList<DataPage> list = new ArrayList<>();
//        list.add(new DataPage(android.R.color.black,"1 Page"));
//        list.add(new DataPage(android.R.color.holo_red_light, "2 Page"));
//        list.add(new DataPage(android.R.color.holo_green_dark, "3 Page"));
//        list.add(new DataPage(android.R.color.holo_orange_dark, "4 Page"));
//        list.add(new DataPage(android.R.color.holo_blue_light, "5 Page"));
//        list.add(new DataPage(android.R.color.holo_blue_bright, "6 Page"));
//
//        viewPager2.setAdapter(new ViewPagerAdapter(list));
//
//    }

    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_page, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewPager2 = view.findViewById(R.id.viewPager2);

        ArrayList<DataPage> list = new ArrayList<>();
        list.add(new DataPage(android.R.color.black,"1 Page"));
        list.add(new DataPage(android.R.color.holo_red_light, "2 Page"));
        list.add(new DataPage(android.R.color.holo_green_dark, "3 Page"));
        list.add(new DataPage(android.R.color.holo_orange_dark, "4 Page"));
        list.add(new DataPage(android.R.color.holo_blue_light, "5 Page"));
        list.add(new DataPage(android.R.color.holo_blue_bright, "6 Page"));
        viewPager2.setAdapter(new ViewPagerAdapter(list));
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                sliderHandler.removeCallbacks(sliderRunnable);
                sliderHandler.postDelayed(sliderRunnable, 2000);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
                if(state==ViewPager2.SCROLL_STATE_IDLE && flag){ //화면에 아무 관여 안할때
                    onResume();
                    Log.v("start", "오토 슬라이딩 진행중");
                    flag = false;
                }else if(state==ViewPager2.SCROLL_STATE_DRAGGING){ //화면을 누르고 있을때
                    onPause();
                    flag = true;
                    Log.v("stop", "오토 슬라이딩 중지됨");
                }
//                switch(state){
//                    case ViewPager2.SCROLL_STATE_IDLE: //누르지 않고 있을때
//                        onResume();
//                        Log.v("test", "확인중입니다");
//                        break;
//                    case ViewPager2.SCROLL_STATE_DRAGGING: //누르고있을때
//                        onPause();
//                        break;
//                }
            }
        });
    }

    private Runnable sliderRunnable = new Runnable() {
        @Override
        public void run() {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
    };

    @Override
    public void onPause() {
        super.onPause();
        sliderHandler.removeCallbacks(sliderRunnable);
    }

    @Override
    public void onResume() {
        super.onResume();
        sliderHandler.postDelayed(sliderRunnable, 2000);
    }

//    viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
//        @Override
//        public void onPageSelected(int position) {
//            super.onPageSelected(position);
//            sliderHandler.removeCallbacks(sliderRunnable);
//            sliderHandler.postDelayed(sliderRunnable, 2000);
//        }
//    });
//
//    private Runnable headerRunnable = new Runnable() {
//        @Override
//        public void run() {
//            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1, true);
//
//        }
//    };
//
//    @Override
//    public void onPause() {
//        super.onPause();
//        headerHandler.removeCallbacks(headerRunnable);
//    }
//
//    @Override
//    public void onResume() {
//        super.onResume();
//        headerHandler.postDelayed(headerRunnable, 3000); // Slide duration 3 seconds
//    }



}