package com.example.saifulislam.learnandroid;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class ProgressBarActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private Button button;
    private ProgressBar progressBar;
    private FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        //setup the toolbar
        setUpTheToolbar();

        progressBar = findViewById(R.id.progrebar_id);
        button = findViewById(R.id.button_id);
        floatingActionButton = findViewById(R.id.fab_id);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        doWork();
                    }
                });
                thread.start();
            }
        });


        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProgressBarActivity.this, ProgressBarCode.class);
                startActivity(intent);
            }
        });
    }

    public void doWork() {
        int i;
        for( i = 0; i <= 200; i++){
            try {
                Thread.sleep(100);
                progressBar.setProgress(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

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
