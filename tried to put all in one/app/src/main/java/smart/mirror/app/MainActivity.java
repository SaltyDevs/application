package smart.mirror.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import smart.mirror.app.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    public Button login;
    public Button register;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = findViewById(R.id.login);
        register = findViewById(R.id.register);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginActivity();
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegisterActivity();
            }
        });
    }

    private void openRegisterActivity() {
        Intent register = new Intent(this, RegisterActivity.class);
        startActivity(register);
    }

    public void openLoginActivity(){
        Intent login = new Intent(this, LoginActivity.class);
        startActivity(login);
    }
}
