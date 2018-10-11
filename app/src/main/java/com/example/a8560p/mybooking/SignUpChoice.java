package com.example.a8560p.mybooking;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SignUpChoice extends AppCompatActivity {
    Button btn_admin;
    Button btn_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_choice);

        btn_admin = findViewById(R.id.btnAdmin);
        btn_user = findViewById(R.id.btnUser);

        btn_admin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(SignUpChoice.this,AdminSignUp.class));
                finish();
            }
        });

        btn_user.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(SignUpChoice.this,UserSignUp.class));
                finish();
            }
        });
    }
}