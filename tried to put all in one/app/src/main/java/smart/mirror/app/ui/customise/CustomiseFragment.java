package smart.mirror.app.ui.customise;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import smart.mirror.app.R;

public class CustomiseFragment extends Fragment {

    private CustomiseViewModel customiseViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        customiseViewModel =
                ViewModelProviders.of(this).get(CustomiseViewModel.class);
        View root = inflater.inflate(R.layout.fragment_customise, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        customiseViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
