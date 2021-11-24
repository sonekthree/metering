package com.exam.metering.viewClassFragment;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.exam.metering.R;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.DayViewDecorator;
import com.prolificinteractive.materialcalendarview.DayViewFacade;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.OnDateSelectedListener;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;



public class scheduleFragment extends Fragment {

    MaterialCalendarView calendarView;
//setOnDateChangedListener 날짜 선택 리스너
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_schedule, container, false);

        calendarView = view.findViewById(R.id.calendarView);

        //calendarView.setSelectionMode(MaterialCalendarView.SELECTION_MODE_NONE);

        calendarView.setDateSelected(CalendarDay.from(2021, 11, 12), true);
        //calendarView.setDateSelected(CalendarDay.from(2021, 11, 15), true);
        calendarView.setDateSelected(CalendarDay.today(), false);
        calendarView.addDecorator(new EventDecorator(Collections.singleton(CalendarDay.from(2021, 11, 15)),scheduleFragment.this));
        calendarView.addDecorator(new EventDecorator(Collections.singleton(CalendarDay.from(2021, 11, 14)),scheduleFragment.this));
        calendarView.setOnDateChangedListener(new OnDateSelectedListener() {
            @Override
            public void onDateSelected(@NonNull MaterialCalendarView widget, @NonNull CalendarDay date, boolean selected) {
                Log.d("HO", String.valueOf(selected));
            }


        });

        return view;
    }
}

class EventDecorator implements DayViewDecorator {
    private final HashSet<CalendarDay> dates;
    private final Drawable drawable;
    public EventDecorator(Collection<CalendarDay> dates, Fragment context) {
        drawable = context.getResources().getDrawable(R.drawable.ellipse39);
        this.dates = new HashSet<>(dates);
    }

    @Override
    public boolean shouldDecorate(CalendarDay day) {
        return dates.contains(day);
    }

    @Override
    public void decorate(DayViewFacade view) {
        view.setSelectionDrawable(drawable);
        //view.addSpan(new DotSpan(5, Color.parseColor("#1D872A")));
    }
}