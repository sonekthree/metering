package com.exam.metering;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.exam.metering.createClassFragment.DetailFragment;
import com.exam.metering.createClassFragment.ScheduleCreateFragment;

public class CreateClassActivity extends AppCompatActivity {
    Button nxt_btn;
    Fragment detail;
    Fragment schedule;
    Fragment regsumm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_class);

        detail = new DetailFragment();
        schedule = new ScheduleCreateFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.class_frame, detail).commit();
        nxt_btn = findViewById(R.id.next_button);

        nxt_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = getSupportFragmentManager().getFragments().get(0);
                if(fragment instanceof DetailFragment){
                    getSupportFragmentManager().beginTransaction().replace(R.id.class_frame, schedule).commit();
                }else if(fragment instanceof ScheduleCreateFragment){
                    getSupportFragmentManager().beginTransaction().replace(R.id.class_frame, detail).commit();
                }
            }
        });




    }
}