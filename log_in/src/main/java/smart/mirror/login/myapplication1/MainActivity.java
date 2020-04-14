package smart.mirror.login.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText NickName;
    private EditText Password;
    private Button SigIn;
    private Button ContinueWithGoogle;
    private CheckBox RememberMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NickName = (EditText)findViewById(R.id.etName);
        Password = (EditText)findViewById(R.id.etPassword);
        SigIn = (Button)findViewById(R.id.btmSigIn);
        ContinueWithGoogle = (Button)findViewById((R.id.btmContinueWithGoogle));
        RememberMe = (CheckBox)findViewById(R.id.checkBox);
    }

    private void validate(String nickName, String password){
        if ((password == "allYourFreeTime") && (nickName == "WhatDoYouWantFromMe")){
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }else{

        }
    }
}
