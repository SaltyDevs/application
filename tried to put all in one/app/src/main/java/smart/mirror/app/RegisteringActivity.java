package smart.mirror.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisteringActivity extends AppCompatActivity {
    protected EditText Email;
    protected EditText NickName;
    protected EditText Password;
    protected EditText OneMorePassword;
    protected Button Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Email = (EditText)findViewById(R.id.email);
        NickName = (EditText)findViewById(R.id.username);
        Password = (EditText)findViewById(R.id.password);
        OneMorePassword = (EditText)findViewById(R.id.passwordAgain);
        Register = (Button)findViewById(R.id.register);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSlideDrawerActivity();
            }
        });
}

    private void openSlideDrawerActivity() {

    }
}
