package com.example.saifulislam.learnandroid;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RadioButtonActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button button;
    private TextView textView;
    private FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        //setup the toolbar
        setUpTheToolbar();

        radioGroup = findViewById(R.id.radiogroup_id);
        button = findViewById(R.id.button_id);
        textView =findViewById(R.id.textview_id);
        floatingActionButton =findViewById(R.id.fab_id);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioButtonId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioButtonId);
                textView.setText("You Chose " + radioButton.getText());
            }
        });

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RadioButtonActivity.this, RadioButtonCode.class);
                startActivity(intent);
            }
        });
    }

    //setup the toolbar
    private void setUpTheToolbar() {
        toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(Color.BLACK);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_black_24dp);  // chage arrow color or set spacific icon
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

}
