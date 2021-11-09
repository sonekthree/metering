package com.exam.metering;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {
    String[] arr = {"gmail.com", "naver.com", "daum.net", "nate.com", "도메인 선택"};
    Button Signinbutton;
    ArrayAdapter<String> arrayAdapter;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Signinbutton = (Button) findViewById(R.id.sign_in_button);
        initSignUp();
    }

    public void initSignUp(){
        Signinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });

    }

}