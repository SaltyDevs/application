package smart.mirror.login.delete;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterFragment extends AppCompatActivity {
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
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }

            private void openMainActivity() {
                //Intent intent = new Intent(this, MainActivity.class);//this, MainActivity.class
                //startActivity(intent);
            }
        });
    }
}
