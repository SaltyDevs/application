package com.example.testingthis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ForgotPasswordVerify extends AppCompatActivity {


    TextView text2verifyEmail;
    EditText verifyNum1;
    EditText verifyNum2;
    EditText verifyNum3;
    EditText verifyNum4;
    Button btmVerify;
    Button text2resendVerfication;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password_verify);
        text2verifyEmail = findViewById(R.id.text2verifyEmail);
        verifyNum1 = findViewById(R.id.verifyNum1);
        verifyNum2 = findViewById(R.id.verifyNum2);
        verifyNum3 = findViewById(R.id.verifyNum3);
        verifyNum4 = findViewById(R.id.verifyNum4);
        btmVerify = findViewById(R.id.btmVerify);
        text2resendVerfication = findViewById(R.id.btm2resendVerfication);

        btmVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ForgotPasswordVerify.this, NewPassword.class);
                startActivity(intent);
            }
        });

    }
}