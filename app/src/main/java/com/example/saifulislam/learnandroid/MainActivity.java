package com.example.saifulislam.learnandroid;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    android.support.v7.widget.Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;

    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpToolbar();

        navigationView = findViewById(R.id.navigationViewId);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.nav_aboutAutherId:
                        Toast.makeText(MainActivity.this, "About Aouther", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_appInfoId:
                        Toast.makeText(MainActivity.this, "App Info", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_contactUsId:
                        Toast.makeText(MainActivity.this, "Contact Us", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_rateThisAppId:
                        Toast.makeText(MainActivity.this, "Rate This App", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_shareId:
                        Toast.makeText(MainActivity.this, "Share App", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
    }

    private void setUpToolbar() {
        drawerLayout = findViewById(R.id.drawerLayoutId);
        toolbar = findViewById(R.id.tolbarId);

        setSupportActionBar(toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

    }
}
