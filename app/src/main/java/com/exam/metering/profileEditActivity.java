package com.exam.metering;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class profileEditActivity extends AppCompatActivity {
    TextView tv;
    String[] arr = {"재학", "휴학"};
    ArrayAdapter<String> arrayAdapter;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_edit);

        tv = (TextView) findViewById((R.id.wordCount_tv));

        EditText editText = (EditText)findViewById((R.id.indroduce_edit));

        editText.setFilters(new InputFilter[] { new InputFilter.LengthFilter(80) });
        editText.addTextChangedListener(new myTextWatcher());




        arrayAdapter = new ArrayAdapter<>(getApplicationContext(),
                R.layout.univer_status_text, arr);

        spinner = (Spinner)findViewById(R.id.status_spin);
        spinner.setAdapter(arrayAdapter);
        spinner.setSelection(0);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //arr[i]로받음
                //l은 id 0 1 2 3 4
            }
            @Override public void onNothingSelected(AdapterView<?> adapterView) { } });
    }

    public class myTextWatcher implements TextWatcher {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override
        public void afterTextChanged(Editable s) {
            tv.setText(s.length() + " / 80 글자");
        }
    }

}