package com.example.testingthis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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
    }
}