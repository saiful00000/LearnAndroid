package com.example.saifulislam.learnandroid.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.saifulislam.learnandroid.Codes.CodeXML;
import com.example.saifulislam.learnandroid.R;

import io.github.kbiakov.codeview.CodeView;
import io.github.kbiakov.codeview.adapters.Options;
import io.github.kbiakov.codeview.highlight.ColorTheme;

import static com.example.saifulislam.learnandroid.fragments.Java.cdJava;

public class AnimationFragment extends Fragment {

    Context context;
    private static CodeXML codeXML;
    public static String myAnimation = codeXML.myAnimationXMl;
    public static String clockWise = codeXML.clockwiseXML;
    public static String fade = codeXML.fadeXML;
    public static String blink = codeXML.blinkXML;
    public static String move = codeXML.moveXML;
    public static String slide = codeXML.slideXML;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_animation, container, false);

        CodeView codeViewOne = view.findViewById(R.id.codeView_one_id);
        codeViewOne.setOptions(Options.Default.get(context = container.getContext())
                .withLanguage("xml")
                .withCode(myAnimation)
                .withTheme(ColorTheme.DEFAULT));

        CodeView codeViewTwo = view.findViewById(R.id.codeView_two_id);
        codeViewTwo.setOptions(Options.Default.get(context = container.getContext())
                .withLanguage("xml")
                .withCode(clockWise)
                .withTheme(ColorTheme.DEFAULT));

        CodeView codeViewThree = view.findViewById(R.id.codeView_three_id);
        codeViewThree.setOptions(Options.Default.get(context = container.getContext())
                .withLanguage("xml")
                .withCode(fade)
                .withTheme(ColorTheme.DEFAULT));

        CodeView codeViewFouer = view.findViewById(R.id.codeView_four_id);
        codeViewFouer.setOptions(Options.Default.get(context = container.getContext())
                .withLanguage("xml")
                .withCode(blink)
                .withTheme(ColorTheme.DEFAULT));

        CodeView codeViewFive = view.findViewById(R.id.codeView_five_id);
        codeViewFive.setOptions(Options.Default.get(context = container.getContext())
                .withLanguage("xml")
                .withCode(move)
                .withTheme(ColorTheme.DEFAULT));

        CodeView codeViewSix = view.findViewById(R.id.codeView_six_id);
        codeViewSix.setOptions(Options.Default.get(context = container.getContext())
                .withLanguage("xml")
                .withCode(slide)
                .withTheme(ColorTheme.DEFAULT));


        return view;
    }
}
