package smart.mirror.login.delete;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class LogInFragment extends AppCompatActivity {

    private EditText NickName;
    private EditText Password;
    private Button SigIn;
    private Button ContinueWithGoogle;
    private CheckBox RememberMe;
    private Button Register;

    public LogInFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

            super.onCreateView(savedInstanceState);
            setContentView(R.layout.activity_main);

            NickName = (EditText)findViewById(R.id.etName);
            Password = (EditText)findViewById(R.id.etPassword);
            SigIn = (Button)findViewById(R.id.btmSigIn);
            ContinueWithGoogle = (Button)findViewById((R.id.btmContinueWithGoogle));
            //RememberMe = (CheckBox)findViewById(R.id.checkBox);
            Register = (Button)findViewById(R.id.register); });

            return inflater.inflate(R.layout.fragment_log_in, container, false);)
        }
    }

}
