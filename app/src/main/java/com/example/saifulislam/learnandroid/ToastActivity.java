package com.example.saifulislam.learnandroid;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ToastActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private Button toastButton, customToastButton;
    private FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);

        //setup the toolbar
        setUpTheToolbar();

        toastButton = findViewById(R.id.toast_button_id);
        customToastButton = findViewById(R.id.custom_toast_button_id);
        floatingActionButton = findViewById(R.id.fab_id);

        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ToastActivity.this, "This is a Toast.", Toast.LENGTH_SHORT).show();
            }
        });

        customToastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View toastView = getLayoutInflater().inflate(R.layout.custom_toast_background, null );
                Toast toast = new Toast(getApplicationContext());
                toast.setView(toastView);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ToastActivity.this, ToastCode.class);
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
