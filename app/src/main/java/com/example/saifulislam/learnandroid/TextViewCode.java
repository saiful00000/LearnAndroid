package com.example.saifulislam.learnandroid;

import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.example.saifulislam.learnandroid.Codes.CodeJava;
import com.example.saifulislam.learnandroid.Codes.CodeManifest;
import com.example.saifulislam.learnandroid.Codes.CodeXML;
import com.example.saifulislam.learnandroid.fragments.Java;
import com.example.saifulislam.learnandroid.fragments.Manifesto;
import com.example.saifulislam.learnandroid.fragments.XML;

public class TextViewCode extends AppCompatActivity {

    private Toolbar toolbar;
    private BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view_code);

        //set up the toolbar
        setUpTheToolbar();

        // pass java,xml and manifest code to fragments
        Java.cdJava = CodeJava.textViewJava;
        XML.cdXML = CodeXML.textViewXML;
        Manifesto.cdMan = CodeManifest.textViewMan;

        //set defoult fragment
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Java()).commit();

        bottomNavigationView = findViewById(R.id.bottom_navigation_id);
        bottomNavigationView.setOnNavigationItemSelectedListener(navItemSelectListener);
    }

    // this method for perform bottom navigation view item clock listener :)
    private BottomNavigationView.OnNavigationItemSelectedListener navItemSelectListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment currentFragment = null;
                    switch (menuItem.getItemId()) {
                        case R.id.java_nav_item:
                            currentFragment = new Java();
                            break;
                        case R.id.xml_nav_item:
                            currentFragment = new XML();
                            break;
                        case R.id.manifesto_nav_item:
                            currentFragment = new Manifesto();
                            break;
                    }
                    // update fragment state
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, currentFragment).commit();
                    return true;
                }
            };

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

}
