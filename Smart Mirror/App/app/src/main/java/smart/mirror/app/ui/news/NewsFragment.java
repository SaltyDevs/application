package smart.mirror.app.ui.news;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.Arrays;

import smart.mirror.app.R;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class NewsFragment extends ListFragment implements OnClickListener {

    private View v;

    public NewsFragment() {
    }

    @Override
    public void onClick(View v) {

    }

    public interface FragmentAListener {
        public void onNewGameClicked();

    }

    private FragmentAListener callBack;


    @Override
    public void onAttach(Activity activity) {
        Log.d("FragmentA", "in onAttach");
        super.onAttach(activity);

        // Check to make sure the activity implements the listener interface.
        try {
            callBack = (FragmentAListener) activity;
        } catch (ClassCastException e) {
            Log.d("FragmentA", String.format("%s does not implement HomeFragmentListener", activity));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("FragmentA", "in onCreateView");
        v = inflater.inflate(R.layout.fragment_news, container, false);


        return v;
    }

    // Register view listener
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Log.d("FragmentA", "in onViewCreated");
        super.onViewCreated(view, savedInstanceState);

        // This fragment implements on click listener, so just set to this.
        view.findViewById(R.id.linearLayout2).setOnClickListener(this);
        view.findViewById(R.id.text_settings).setOnClickListener(this);

        view.findViewById(R.id.button1).setOnClickListener(this);
        view.findViewById(R.id.first_story).setOnClickListener(this);
        view.findViewById(R.id.frame1).setOnClickListener(this);

        view.findViewById(R.id.button2).setOnClickListener(this);
        view.findViewById(R.id.second_story).setOnClickListener(this);
        view.findViewById(R.id.frame2).setOnClickListener(this);

        view.findViewById(R.id.button3).setOnClickListener(this);
        view.findViewById(R.id.third_story).setOnClickListener(this);
        view.findViewById(R.id.frame3).setOnClickListener(this);

        view.findViewById(R.id.button4).setOnClickListener(this);
        view.findViewById(R.id.fourth_story).setOnClickListener(this);
        view.findViewById(R.id.frame4).setOnClickListener(this);
    }
}
