package com.example.smartmirrorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class RegisterActivity extends AppCompatActivity {
    protected EditText Email;
    protected EditText NickName;
    protected EditText Password;
    protected EditText OneMorePassword;
    protected Button Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Email = (EditText)findViewById(R.id.email);
        NickName = (EditText)findViewById(R.id.username);
        Password = (EditText)findViewById(R.id.password);
        OneMorePassword = (EditText)findViewById(R.id.passwordAgain);
        Register = (Button)findViewById(R.id.register);

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkDataEntered();
                Intent intent = new Intent(RegisterActivity.this, logedInUser.class);
                startActivity(intent);
            }
        });

    }

    boolean isEmail(EditText text){
        CharSequence email = text.getText().toString();
        return( !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

    boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }
    private void checkDataEntered() {
        if (isEmail(Email)){
            Email.setError("Your email isn`t valid!");
        }
        if (isEmpty(NickName)){
            NickName.setError("Nickname should have ......");
        }
        if (isEmpty(Password)){
            Password.setError("Password should have ......");
        }
        if (isEmpty(OneMorePassword)){
            OneMorePassword.setError("Password should have ......");
        }

    }

}
