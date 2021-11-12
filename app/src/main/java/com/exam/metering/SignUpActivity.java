package com.exam.metering;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.jetbrains.annotations.NotNull;


public class SignUpActivity extends AppCompatActivity {

    String[] arr = {"도메인 선택","gmail.com", "naver.com", "daum.net", "nate.com"};
    String[] arr2 = {"재학중", "휴학중", "졸업예정", "졸업"};
    ArrayAdapter<String> arrayAdapter;
    private Spinner spinner_email;
    private FirebaseAuth mAuth;
    private Button Signinbutton;
    private RadioButton radioM;
    private RadioButton radioW;
    private EditText editEmail;
    private EditText editName;
    private EditText editPassword;
    private EditText editPasswordConfirm;
    private Spinner spinner_school_state;
    private RadioGroup radioGroup;
    private EditText editSchoolName;
    private EditText editSchoolMajor;
    private Button scoreUploadButton;
    private Button schoolUploadButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Signinbutton = (Button) findViewById(R.id.sign_in_button);
        editName = (EditText) findViewById(R.id.edit_name);
        editEmail = (EditText) findViewById(R.id.edit_email);
        editPassword = (EditText) findViewById(R.id.edit_password);
        editPasswordConfirm = (EditText) findViewById(R.id.edit_password_confirm);
        editSchoolName = (EditText) findViewById(R.id.edit_school_name);
        editSchoolMajor = (EditText) findViewById(R.id.edit_school_major);
        spinner_email = (Spinner) findViewById(R.id.spinner_mail);
        spinner_school_state = (Spinner) findViewById(R.id.spinner_school_state);
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        mAuth = FirebaseAuth.getInstance();
        initSignUp();
        onRadioButtonClicked(radioGroup);
         arrayAdapter = new ArrayAdapter<>(this,
                R.layout.lec_met_text, arr);
        spinner_email.setAdapter(arrayAdapter);
        spinner_email.setSelection(0);
        spinner_email.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

           }
           @Override public void onNothingSelected(AdapterView<?> adapterView) { } });

        ArrayAdapter arrayAdapters = new ArrayAdapter<>(this, R.layout.lec_met_text, arr2);
        spinner_school_state.setAdapter(arrayAdapters);
        spinner_school_state.setSelection(0);
        spinner_school_state.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }
            @Override public void onNothingSelected(AdapterView<?> adapterView) { } });

    }

    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.radio_m:
                if (checked){
                    // 남자구나
                }
            case R.id.radio_w:
                if(checked){
                    //여자구나
                }
        }


    }

    public void updateUI(FirebaseUser user){
        if(user.toString().isEmpty()){
            Toast.makeText(getApplicationContext(), "Authentication failed.",
                    Toast.LENGTH_SHORT).show();
        }else{
            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
            intent.putExtra("user", user);
            startActivity(intent);
        }

    }

    public void updateUI(){

    }
    public void initSignUp() {
        Signinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = editEmail.getText().toString();
                String name = editName.getText().toString();
                String password = editPassword.getText().toString();
                String passwordconfirm = editPasswordConfirm.getText().toString();

                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "email 혹은 password를 반드시 입력하세요", Toast.LENGTH_LONG).show();
                } else if (password != passwordconfirm) {
                    Toast.makeText(getApplicationContext(), "비밀번호가 일치하지 않습니다. ", Toast.LENGTH_SHORT).show();
                } else {
                    createAccount(email, password);
                }
            }

        });
    }

    private void createAccount(String email, String password){
        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Log.d("SignUpActivity", "signInWithEmail:success");
                        FirebaseUser user = mAuth.getCurrentUser();
                        updateUI(user);
                    } else {
                        Log.w("SignUpActivity", task.getException());
                        updateUI(null);
                    }
                }
        });
    }





    public void startMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onStart(){
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            startMainActivity();
        }
    }



}