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
import com.example.saifulislam.learnandroid.Codes.CodeOthers;
import com.example.saifulislam.learnandroid.Codes.CodeXML;
import com.example.saifulislam.learnandroid.fragments.Description;
import com.example.saifulislam.learnandroid.fragments.Java;
import com.example.saifulislam.learnandroid.fragments.Manifesto;
import com.example.saifulislam.learnandroid.fragments.Others;
import com.example.saifulislam.learnandroid.fragments.XML;

public class SQLiteCode extends AppCompatActivity {

    private Toolbar toolbar;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite_code);

        setUpTheToolbar();

        Description.header = "SQLite Database";
        Description.description = getString(R.string.SQLite_description);
        Java.cdJava = CodeJava.sqliteJava;
        XML.cdXML = CodeXML.sqliteXML;
        Manifesto.cdMan = CodeManifest.sqliteMan;
        Others.headerOne = "StudentDbHelper.java";
        Others.codeOthersOne = CodeOthers.SQLiteOtherCode1;

        // set default fragment for fragment container
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Description()).commit();

        bottomNavigationView = findViewById(R.id.bottom_navigation_id);
        bottomNavigationView.setOnNavigationItemSelectedListener(navItemSelectListener);
    }

    // this method for perform bottom navigation view item clock listener :)
    private BottomNavigationView.OnNavigationItemSelectedListener navItemSelectListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment currentFragment = null;
            switch (menuItem.getItemId()) {
                case R.id.description_nav_item:
                    currentFragment = new Description();
                    break;
                case R.id.java_nav_item:
                    currentFragment = new Java();
                    break;
                case R.id.xml_nav_item:
                    currentFragment = new XML();
                    break;
                case R.id.manifesto_nav_item:
                    currentFragment = new Manifesto();
                    break;
                case R.id.other_nav_item:
                    currentFragment = new Others();
                    break;
            }
            // update current fragment
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
