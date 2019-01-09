package com.example.saifulislam.learnandroid;

import android.content.Intent;
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
                        Intent intent = new Intent(MainActivity.this, AboutAuthor.class);
                        startActivity(intent);
                        break;
                    case R.id.nav_shareId:
                        Intent intent1 = new Intent(Intent.ACTION_SEND);
                        intent1.setType("text/plain");
                        intent1.putExtra(Intent.EXTRA_TEXT, "www.learnandroid.com");
                        startActivity(intent1.createChooser(intent1, "Share"));
                        break;
                    case R.id.nav_contactUsId:
                        Intent intent2 = new Intent(Intent.ACTION_SEND);
                        intent2.setType("message/rfc822");
                        intent2.putExtra(Intent.EXTRA_EMAIL, new String[]{"saiful161003@gmail.com"});
                        intent2.putExtra(Intent.EXTRA_SUBJECT, "Learn Android");
                        intent2.putExtra(Intent.EXTRA_TEXT, "I am a user of your app");
                        startActivity(intent2.createChooser(intent2, "Send Mail"));
                        break;
                    case R.id.nav_appInfoId:
                        Toast.makeText(MainActivity.this, "App Info", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_rateThisAppId:
                        Toast.makeText(MainActivity.this, "Rate This App", Toast.LENGTH_SHORT).show();
                        break;

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
