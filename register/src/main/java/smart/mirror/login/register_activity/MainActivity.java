package smart.mirror.login.register_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
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
        NickName = (EditText)findViewById(R.id.nickName);
        Password = (EditText)findViewById(R.id.password);
        OneMorePassword = (EditText)findViewById(R.id.oneMorePassword);
        Register = (Button)findViewById(R.id.register);
    }
}
