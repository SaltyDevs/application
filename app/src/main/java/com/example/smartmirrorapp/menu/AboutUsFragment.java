package com.example.smartmirrorapp.menu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.smartmirrorapp.R;

public class AboutUsFragment extends Fragment {

    public View onCreate(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_about_us,container,false);
        return root;
    }
}