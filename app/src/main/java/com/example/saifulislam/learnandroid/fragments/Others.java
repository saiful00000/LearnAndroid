package com.example.saifulislam.learnandroid.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.saifulislam.learnandroid.R;

import io.github.kbiakov.codeview.CodeView;
import io.github.kbiakov.codeview.adapters.Options;
import io.github.kbiakov.codeview.highlight.ColorTheme;


public class Others extends Fragment {

    Context context;
    public static String headerOne = "";
    public static String headerTwo = "";
    public static String headerThree = "";
    public static String codeOthersOne = "";
    public static String codeOthersTwo = "";
    public static String codeOthersThree = "";
    public static String languageOne = "java";
    public static String languageTow = "java";
    public static String languageThree = "java";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_others, container, false);
        TextView textViewOne = view.findViewById(R.id.others_one_textviw_id);
        textViewOne.setText(headerOne);
        CodeView codeViewOne = view.findViewById(R.id.others_one_codeview_id);
        codeViewOne.setOptions(Options.Default.get(context = container.getContext())
                .withLanguage(languageOne)
                .withCode(codeOthersOne)
                .withTheme(ColorTheme.DEFAULT));

        TextView textViewTwo = view.findViewById(R.id.others_two_textviw_id);
        textViewTwo.setText(headerTwo);
        CodeView codeViewTwo = view.findViewById(R.id.others_two_codeview_id);
        codeViewTwo.setOptions(Options.Default.get(context = container.getContext())
                .withLanguage(languageTow)
                .withCode(codeOthersTwo)
                .withTheme(ColorTheme.DEFAULT));

        TextView textViewThree = view.findViewById(R.id.others_three_textviw_id);
        textViewThree.setText(headerThree);
        CodeView codeViewThree = view.findViewById(R.id.others_three_codeview_id);
        codeViewThree.setOptions(Options.Default.get(context = container.getContext())
                .withLanguage(languageThree)
                .withCode(codeOthersThree)
                .withTheme(ColorTheme.DEFAULT));

        return view;
    }

}
