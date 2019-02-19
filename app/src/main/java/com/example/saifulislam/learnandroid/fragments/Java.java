package com.example.saifulislam.learnandroid.fragments;

import android.content.Context;
import android.os.Bundle;
import android.provider.FontRequest;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.saifulislam.learnandroid.MainActivity;
import com.example.saifulislam.learnandroid.R;
import com.example.saifulislam.learnandroid.TextViewCode;

import io.github.kbiakov.codeview.CodeView;
import io.github.kbiakov.codeview.adapters.Options;
import io.github.kbiakov.codeview.highlight.ColorTheme;
import io.github.kbiakov.codeview.highlight.Font;

public class Java extends Fragment {

    Context context;
    public static String cdJava = "";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_java, container, false);
        CodeView codeView = view.findViewById(R.id.textViewCodeViewjava);
        /*codeView.setCode(cdJava);
        codeView.getOptions().setTheme(ColorTheme.DEFAULT);
        codeView.getOptions().withFont(Font.Consolas);*/
        codeView.setOptions(Options.Default.get(context = container.getContext())
                .withLanguage("java")
                .withCode(cdJava)
                .withTheme(ColorTheme.DEFAULT));
        return view;
    }


}
