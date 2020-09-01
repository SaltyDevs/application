package com.example.testingthis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewPassword extends AppCompatActivity {


    EditText email;
    Button btmContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_password);

        email = findViewById(R.id.email);
        btmContinue = findViewById(R.id.btmContinue);
        btmContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewPassword.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}