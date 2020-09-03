package com.example.smartmirrorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class logedInUser extends AppCompatActivity {

    TextView hello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loged_in_user);
        hello = findViewById(R.id.hello);
    }
}