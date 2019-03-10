package com.example.saifulislam.learnandroid;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.saifulislam.learnandroid.Codes.CodeJava;
import com.example.saifulislam.learnandroid.Codes.CodeManifest;
import com.example.saifulislam.learnandroid.Codes.CodeXML;
import com.example.saifulislam.learnandroid.fragments.Description;
import com.example.saifulislam.learnandroid.fragments.Java;
import com.example.saifulislam.learnandroid.fragments.Manifesto;
import com.example.saifulislam.learnandroid.fragments.XML;

public class AlertDialogActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private Button button;
    private AlertDialog.Builder alertDialogBuilder;
    private FloatingActionButton floatingActionButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);

        //setup the toolbar
        setUptheToolbar();

        Description.header = "AlertDialog";
        Description.description = getString(R.string.alert_dialog_description);
        Java.cdJava = CodeJava.alertDialogJava;
        XML.cdXML = CodeXML.alertDialogXML;
        Manifesto.cdMan = CodeManifest.alertDialogMan;

        button = findViewById(R.id.alert_button_id);
        floatingActionButton = findViewById(R.id.fab_id);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialogBuilder = new AlertDialog.Builder(AlertDialogActivity.this)
                        .setIcon(R.drawable.ic_warning_black_24dp)
                        .setTitle(R.string.alert_title)
                        .setMessage(R.string.alert_msg);
                alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(AlertDialogActivity.this, "You chose to exit.", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                });
                alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(AlertDialogActivity.this, "You chose no.", Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlertDialogActivity.this, AlertDialogCode.class);
                startActivity(intent);
            }
        });
    }

    //setup the toolbar
    private void setUptheToolbar() {
        toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(Color.BLACK);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_black_24dp); // change back arrow color
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
