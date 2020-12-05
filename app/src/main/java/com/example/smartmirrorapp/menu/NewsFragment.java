package com.example.smartmirrorapp.menu;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.smartmirrorapp.R;

public class NewsFragment extends Fragment {

    public View onCreate(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_news,container,false);
        return root;
    }
}