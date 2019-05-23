package com.example.saifulislam.learnandroid;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ImplicitIntent extends AppCompatActivity {

    private Toolbar toolbar;
    private FloatingActionButton floatingActionButton;
    private Button callBtn, smsBtn;
    private EditText phoneNumberEt, smsBodyEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);

        setUpTheToolbar();

        callBtn = findViewById(R.id.call_btn_id);
        smsBtn = findViewById(R.id.sms_btn_id);
        phoneNumberEt = findViewById(R.id.phonenumber_et_id);
        smsBodyEt = findViewById(R.id.sms_et_id);
        floatingActionButton = findViewById(R.id.fab_id);

        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callPhoneNumber();
                phoneNumberEt.setText("");
            }
        });

        smsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sms = smsBodyEt.getText().toString();
                Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                smsIntent.setData(Uri.parse("sms:"));
                smsIntent.putExtra("sms_body",sms);
                startActivity(smsIntent);
                smsBodyEt.setText("");
            }
        });

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ImplicitIntent.this, ImplicitIntentCode.class);
                startActivity(intent);
            }
        });
    }

    //setup the toolbar
    private void setUpTheToolbar() {
        toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(Color.BLACK);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);                            // back arrow button (eneble)
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_black_24dp);  // chage arrow color or set spacific icon
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    public void callPhoneNumber()
    {
        try
        {
            if(Build.VERSION.SDK_INT > 22)
            {
                if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling

                    ActivityCompat.requestPermissions(ImplicitIntent.this, new String[]{Manifest.permission.CALL_PHONE}, 101);

                    return;
                }

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + phoneNumberEt.getText().toString().trim()));
                startActivity(callIntent);

            }
            else {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + phoneNumberEt.getText().toString().trim()));
                startActivity(callIntent);
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
