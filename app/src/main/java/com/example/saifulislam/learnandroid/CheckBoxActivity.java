package com.example.saifulislam.learnandroid;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private CheckBox checkBox1, checkBox2, checkBox3;
    private Button button;
    private FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        //setup the toolbar
        setUpTheToolbar();

        checkBox1 = findViewById(R.id.checkbox_one_id);
        checkBox2 = findViewById(R.id.checkbox_two_id);
        checkBox3 = findViewById(R.id.checkbox_three_id);
        button = findViewById(R.id.button_id);
        floatingActionButton = findViewById(R.id.fab_id);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result = new StringBuilder();
                boolean checked = false;
                if (checkBox1.isChecked()) {
                    result.append("CheckBox 1 ");
                    checked = true;
                }
                if (checkBox2.isChecked()) {
                    result.append("CheckBox 2 ");
                    checked = true;
                }
                if (checkBox3.isChecked()) {
                    result.append("CheckBox 3 ");
                    checked = true;
                }

                if (checked) {
                    Toast.makeText(CheckBoxActivity.this, result + "is Checked.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(CheckBoxActivity.this, "Any CheckBox is not Checked.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CheckBoxActivity.this, CheckBoxCode.class);
                startActivity(intent);
            }
        });

    }

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
