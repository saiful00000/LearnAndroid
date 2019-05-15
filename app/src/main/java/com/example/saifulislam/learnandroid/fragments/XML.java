package com.example.saifulislam.learnandroid.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.saifulislam.learnandroid.R;

import io.github.kbiakov.codeview.CodeView;
import io.github.kbiakov.codeview.adapters.Options;
import io.github.kbiakov.codeview.highlight.ColorTheme;

public class XML extends Fragment {

    Context context;
    public static String cdXML = "";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_xml, container, false);
        CodeView codeView = view.findViewById(R.id.textViewCodeViewxml);
        codeView.setOptions(Options.Default.get(context = container.getContext())
                .withLanguage("xml")
                .withCode(cdXML)
                .withTheme(ColorTheme.DEFAULT));
        return view;
    }
}
