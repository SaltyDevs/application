package com.example.smartmirrorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nickName = findViewById(R.id.etName);
        final EditText password = findViewById(R.id.etPassword);
        Button sigIn = findViewById(R.id.btmSigIn);
        Button continueWithGoogle = findViewById((R.id.btmContinueWithGoogle));
        CheckBox rememberMe = findViewById(R.id.checkBox);
        Button register = findViewById(R.id.register);

        sigIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nickName.getText().toString().equals("me") && password.getText().toString().equals("1")){

                    Intent intent = new Intent(MainActivity.this, logedInUser.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Wrong username or password", Toast.LENGTH_SHORT).show();
                }

            }
        });

        SharedPreferences sharedpreferences; //keeps user loged in //TODO: Test this feature

        sharedpreferences = getApplicationContext().getSharedPreferences("Preferences", 0);
        String login = sharedpreferences.getString("LOGIN", null);


        if (login != null) {
            //put your code if user is logged. For example, go to another activity
        }else {

// to go login activity
        }
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                //startActivity(intent);
               public void checkUsername() {
                    boolean isValid = true;
                    if (isEmpty(nickName)) {
                        nickName.setError("You must enter username to login!");
                        isValid = false;
                    } else {
                        if (!isEmail(nickName)) {
                            nickName.setError("Enter valid email!");
                            isValid = false;
                        }
                    }

                    if (isEmpty(password)) {
                        password.setError("You must enter password to login!");
                        isValid = false;
                    } else {
                        if (password.getText().toString().length() < 4) {
                            password.setError("Password must be at least 4 chars long!");
                            isValid = false;
                        }
                    }

                    //check email and password
                    //IMPORTANT: here should be call to backend or safer function for local check; For example simple check is cool
                    //For example simple check is cool
                    if (isValid) {
                        String usernameValue = nickName.getText().toString();
                        String passwordValue = password.getText().toString();
                        if (usernameValue.equals("test@test.com") && passwordValue.equals("password1234")) {
                            //everything checked we open new activity
                            Intent i = new Intent(MainActivity.this, RegisterActivity.class);
                            startActivity(i);
                            //we close this activity
                            this.finish();
                        } else {
                            Toast t = Toast.makeText(this, "Wrong email or password!", Toast.LENGTH_SHORT);
                            t.show();
                        }
                    }
                }
            }
        });
    }
    boolean isEmail(EditText text) {
        CharSequence email = text.getText().toString();
        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }

    boolean isEmpty(EditText text) {
        CharSequence str = text.getText().toString();
        return TextUtils.isEmpty(str);
    }
}
