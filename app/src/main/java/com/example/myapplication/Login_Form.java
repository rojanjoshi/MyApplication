package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login_Form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);
        getSupportActionBar().setTitle("Login Form");
    }

    public void btn_signupForm(View view) {
        startActivity(new Intent(getApplicationContext(),Signup_Form.class));
    }
    public void btn_mainform(View view) {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
    }


}