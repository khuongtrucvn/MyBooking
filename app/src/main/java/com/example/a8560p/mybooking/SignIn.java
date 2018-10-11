package com.example.a8560p.mybooking;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);
    }

    public void sign_up(View v){
        startActivity(new Intent(SignIn.this,SignUpChoice.class));
        finish();
    }
}
