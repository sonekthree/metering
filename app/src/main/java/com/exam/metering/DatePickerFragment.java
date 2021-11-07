package com.exam.metering;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class DatePickerFragment extends DialogFragment
        implements DatePickerDialog.OnDateSetListener {

    View view;
    boolean flag;
    public DatePickerFragment(View v, boolean f){
        this.view = v;
        this.flag = f;
    }
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(getActivity(),R.style.DialogTheme,this,year,month,day);
    }


    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
        searchPage se = new searchPage();
        //searchPage activity = (searchPage) getParentFragment();//.findFragmentByTag();
        se.processDatePickerResult(year%100,month,day,view, flag);
//        MainActivity activity = (MainActivity)getActivity();
//        activity.callDatePicker(year,month,day);
    }
}