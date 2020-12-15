package smart.mirror.app.ui.news;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import smart.mirror.app.R;

public class NewsViewModel extends Activity {

    LinearLayout linearLayout2;
    TextView text_settings;

    ImageButton button1;
    TextView first_story;
    FrameLayout frame1;

    ImageButton button2;
    TextView second_story;
    FrameLayout frame2;

    ImageButton button3;
    TextView third_story;
    FrameLayout frame3;

    ImageButton button4;
    TextView fourth_story;
    FrameLayout frame4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout2 = findViewById(R.id.linearLayout2);
        text_settings = findViewById(R.id.text_settings);

        button1 = findViewById(R.id.button1);
        first_story = findViewById(R.id.first_story);
        frame1 = findViewById(R.id.frame1);

        button2 = findViewById(R.id.button2);
        second_story = findViewById(R.id.second_story);
        frame2 = findViewById(R.id.frame2);

        button3 = findViewById(R.id.button3);
        third_story = findViewById(R.id.third_story);
        frame3 = findViewById(R.id.frame3);

        button4 = findViewById(R.id.button4);
        fourth_story = findViewById(R.id.fourth_story);
        frame4 = findViewById(R.id.frame4);

    }

    //@Override
    public void onNewGameClicked() {
        Bundle extras = new Bundle();
        Intent intent = new Intent(this, NewsFragment.class);
        intent.putExtras(extras);
        startActivity(intent);
    }
}