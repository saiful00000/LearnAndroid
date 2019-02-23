package com.example.saifulislam.learnandroid.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.saifulislam.learnandroid.R;

public class Description extends Fragment {

    public static String header = "";
    public static String description = "";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_description, container, false);
        TextView descriptionHeaderTv = view.findViewById(R.id.description_header_id);
        descriptionHeaderTv.setText(header);
        TextView descriptionTv = view.findViewById(R.id.description_id);
        descriptionTv.setText(description);
        return view;
    }
}
