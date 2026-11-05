package com.example.fragmentapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ThirdFragment extends Fragment {
    public ThirdFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_third, container, false);
        Button button = view.findViewById(R.id.btnGoToFourthFragment);
        button.setOnClickListener(v -> {
            getFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new FourthFragment())
                    .addToBackStack(null)
                    .commit();
        });
        return view;
    }
}