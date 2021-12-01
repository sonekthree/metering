package com.exam.metering;

import android.content.Context;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;


public class searchPage extends Fragment{
    private static Context context;
    String month_string;
    String day_string;
    String year_string;
    String[] arr = {"상관없음", "대면", "비대면", "혼합"};
    ArrayAdapter<String> arrayAdapter;
    private Spinner spinner;
    Button btn;

    ActionBar actionBar;
    private View mViewGroup;
    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup v = (ViewGroup) inflater.inflate(R.layout.fragment_search_page, container, false);
        context = container.getContext();

        actionBar = ((MainActivity) getActivity()).getSupportActionBar();
        actionBar.hide();

        //검색 필터 숨기기
//        mViewGroup = v.findViewById(R.id.search_detail);
//        mViewGroup.setVisibility(View.GONE);

        Button start_btn = v.findViewById(R.id.startDate_btn);

        start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment newFragment = new DatePickerFragment(v, true);
                newFragment.show(getFragmentManager(),"datePicker");
            }
        });

        Button end_btn = v.findViewById(R.id.endDate_btn);

        end_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment newFragment = new DatePickerFragment(v, false);
                newFragment.show(getFragmentManager(),"datePicker");
            }
        });

        EditText et = (EditText) v.findViewById(R.id.lecCount_edit);
        et.setFilters(new InputFilter[]{ new LecCountMinMax(0, 30)});

        arrayAdapter = new ArrayAdapter<>(getActivity(),
                R.layout.lec_met_text, arr);

        spinner = (Spinner)v.findViewById(R.id.spinner_met);
        spinner.setAdapter(arrayAdapter);
        spinner.setSelection(0);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //arr[i]로받음
                //l은 id 0 1 2 3 4
            }
            @Override public void onNothingSelected(AdapterView<?> adapterView) { } });

        return v;
    }


//    public void showDatePicker(View view) {
//        DialogFragment newFragment = new DatePickerFragment();
//        newFragment.show(getFragmentManager(),"datePicker");
//    }

    public void processDatePickerResult(int year, int month, int day, View view, boolean flag){
        month_string = Integer.toString(month+1);
        day_string = Integer.toString(day);
        year_string = Integer.toString(year);
        String dateMessage = (year_string+"."+month_string + "." + day_string + ".");
        if(flag){
            btn = view.findViewById(R.id.startDate_btn);
            btn.setText(dateMessage);
        } else{
            btn = view.findViewById(R.id.endDate_btn);
            btn.setText(dateMessage);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        actionBar.show();
    }

    @Override
    public void onResume() {
        super.onResume();
        actionBar.hide();
    }
}