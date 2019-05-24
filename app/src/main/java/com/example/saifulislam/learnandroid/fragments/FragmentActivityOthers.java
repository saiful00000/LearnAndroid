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

public class FragmentActivityOthers extends Fragment {

    Context context;
    public static String headerOne = "";
    public static String codeOthersOne = "";
    public static String languageOne = "java";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_activity_others, container, false);
        TextView textViewOne = view.findViewById(R.id.others_one_textviw_id);
        textViewOne.setText(headerOne);
        CodeView codeViewOne = view.findViewById(R.id.others_one_codeview_id);
        codeViewOne.setOptions(Options.Default.get(context = container.getContext())
                .withLanguage(languageOne)
                .withCode(codeOthersOne)
                .withTheme(ColorTheme.DEFAULT));
        return view;
    }
}
