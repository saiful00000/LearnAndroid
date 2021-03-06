package com.example.saifulislam.learnandroid;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class IntentActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private Button explicitBtn, implicitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        //setup the toolbar
        setUpTheToolbar();

        explicitBtn = findViewById(R.id.explicit_btn_id);
        implicitBtn = findViewById(R.id.implicit_btn_id);

        explicitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IntentActivity.this, ExplicitIntent.class);
                startActivity(intent);
            }
        });

        implicitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IntentActivity.this, ImplicitIntent.class);
                startActivity(intent);
            }
        });
    }


    // setup the toolbar
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
