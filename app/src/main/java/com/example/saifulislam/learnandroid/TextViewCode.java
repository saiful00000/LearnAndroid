package com.example.saifulislam.learnandroid;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.saifulislam.learnandroid.fragments.Java;
import com.example.saifulislam.learnandroid.fragments.Manifesto;
import com.example.saifulislam.learnandroid.fragments.XML;

public class TextViewCode extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view_code);

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
}
