package com.exam.metering.viewClassFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.exam.metering.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class schedule_bottom_sheet extends BottomSheetDialogFragment{
    private View view;
    TextView tv1, tv2, tv3, tv4;
    Button close_btn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.schedule_bottom_sheet_layout, container, false);
        Bundle mArgs = getArguments();
        String tvStyle = mArgs.getString("style");
        String tvMonth = mArgs.getString("month");
        String tvDay = mArgs.getString("day");
        String tvTime = mArgs.getString("time");

        tv1 = view.findViewById(R.id.tv_style);
        tv2 = view.findViewById(R.id.tv_month);
        tv3 = view.findViewById(R.id.tv_day);
        tv4 = view.findViewById(R.id.tv_time);

        tv1.setText(tvStyle);
        tv2.setText(tvMonth);
        tv3.setText(tvDay);
        tv4.setText(tvTime);

        close_btn = view.findViewById(R.id.close_btn);

        close_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

        return view;
    }
}