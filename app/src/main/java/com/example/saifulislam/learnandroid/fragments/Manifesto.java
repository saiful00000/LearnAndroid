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
import io.github.kbiakov.codeview.adapters.Format;
import io.github.kbiakov.codeview.adapters.Options;
import io.github.kbiakov.codeview.highlight.ColorTheme;
import io.github.kbiakov.codeview.highlight.Font;

public class Manifesto extends Fragment {

    Context context;
    public static String cdMan = "";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_manifesto, container, false);
        CodeView codeView = view.findViewById(R.id.textViewCodeViewManifesto);
        codeView.setOptions(Options.Default.get(context = container.getContext())
                .withLanguage("manifest")
                .withCode(cdMan)
                .withTheme(ColorTheme.DEFAULT));
        return view;
    }
}
