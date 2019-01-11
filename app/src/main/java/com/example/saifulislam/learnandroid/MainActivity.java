package com.example.saifulislam.learnandroid;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.saifulislam.learnandroid.adapters.MainListViewdapter;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    android.support.v7.widget.Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;

    NavigationView navigationView;

    ListView mainListview;

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
                        startActivity(Intent.createChooser(intent1, "Share"));
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

        mainListview = findViewById(R.id.mainListViewId);
        final String[] contents = getResources().getStringArray(R.array.content_list);
        int[] icons = {R.drawable.main_widget, R.drawable.main_intent, R.drawable.main_container, R.drawable.main_menu,
                R.drawable.main_datetime, R.drawable.main_animation, R.drawable.main_audio,
                R.drawable.main_video, R.drawable.main_camera, R.drawable.main_fragment, R.drawable.main_map,
                R.drawable.main_sqlite, R.drawable.main_toast};
        MainListViewdapter mainListViewdapter = new MainListViewdapter(this, contents, icons);
        mainListview.setAdapter(mainListViewdapter);
        mainListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                itemClickHelper(position);
            }
        });
    }

    // method for response main activity Listview onitemclick listenner
    public void itemClickHelper(int position) {
        switch (position) {
            case 0:
                Toast.makeText(this, "Widget", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(this, "Intent", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(this, "Containers", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this, "Menu", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(this, "Date Time", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                Toast.makeText(this, "Animation", Toast.LENGTH_SHORT).show();
                break;
            case 6:
                Toast.makeText(this, "Audio", Toast.LENGTH_SHORT).show();
                break;
            case 7:
                Toast.makeText(this, "Video", Toast.LENGTH_SHORT).show();
                break;
            case 8:
                Toast.makeText(this, "Camera", Toast.LENGTH_SHORT).show();
                break;
            case 9:
                Toast.makeText(this, "Fragment", Toast.LENGTH_SHORT).show();
                break;
            case 10:
                Toast.makeText(this, "Map", Toast.LENGTH_SHORT).show();
                break;
            case 11:
                Toast.makeText(this, "SQLite", Toast.LENGTH_SHORT).show();
                break;
            case 12:
                Toast.makeText(this, "Toast", Toast.LENGTH_SHORT).show();
                break;
        }

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
