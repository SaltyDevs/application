package com.example.testingthis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ForgotPasswordTypeEmail extends AppCompatActivity {

    EditText email;
    Button submitBTM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password_type_email);
        email = findViewById(R.id.email);
        submitBTM = findViewById(R.id.submitBTM);
        submitBTM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ForgotPasswordTypeEmail.this, ForgotPasswordVerify.class);
                startActivity(intent);
            }
        });
    }
}