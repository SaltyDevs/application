package com.example.testingthis;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);
        EditText passwordAgain = findViewById(R.id.passwordAgain);
        EditText nickname = findViewById(R.id.nickname);
        Button btmContinue = findViewById(R.id.btmContinue);

    }
}
