package com.example.a8560p.mybooking;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AdminSignUp extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_sign_up);
    }

    public void sign_in(View v){
        startActivity(new Intent(AdminSignUp.this,SignIn.class));
        finish();
    }
}
