package com.example.a8560p.mybooking;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class UserSignUp extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_sign_up);
    }

    public void sign_in(View v){
        startActivity(new Intent(UserSignUp.this,SignIn.class));
        finish();
    }
}
