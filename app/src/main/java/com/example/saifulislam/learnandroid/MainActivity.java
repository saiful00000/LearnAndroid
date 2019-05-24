package com.example.saifulislam.learnandroid;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


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

        //setup the toolbar
        setUpTheToolbar();

        //set the list view
        setTheListView();

        navigationView = findViewById(R.id.navigationViewId);
        navigationView.setNavigationItemSelectedListener(listener);


    }


    //set the list view
    private void setTheListView() {
        mainListview = findViewById(R.id.mainListViewId);
        final String[] contents = getResources().getStringArray(R.array.content_list);
        int[] icons = {R.drawable.main_widget, R.drawable.main_intent, R.drawable.main_container, R.drawable.main_menu,
                R.drawable.main_datetime, R.drawable.main_animation, R.drawable.main_audio,
                R.drawable.main_video, R.drawable.main_camera, R.drawable.main_fragment,
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

    // configure Navigation Drawer On item select listener
    private NavigationView.OnNavigationItemSelectedListener listener = new NavigationView.OnNavigationItemSelectedListener() {
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
                    startActivity(Intent.createChooser(intent2, "Send Mail"));
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
    };

    // method for response main activity Listview onitemclick listenner
    public void itemClickHelper(int position) {
        Intent intent;
        switch (position) {
            case 0:
                intent = new Intent(MainActivity.this, CommonWidgetActivity.class);
                startActivity(intent);
                break;
            case 1:
                intent = new Intent(MainActivity.this, IntentActivity.class);
                startActivity(intent);
                break;
            case 2:
                intent = new Intent(MainActivity.this, ContainerActivity.class);
                startActivity(intent);
                break;
            case 3:
                intent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);
                break;
            case 4:
                intent = new Intent(MainActivity.this, DateTimeActivity.class);
                startActivity(intent);
                break;
            case 5:
                intent = new Intent(MainActivity.this, AnimationActivity.class);
                startActivity(intent);
                break;
            case 6:
                intent = new Intent(MainActivity.this, AodioActivity.class);
                startActivity(intent);
                break;
            case 7:
                intent = new Intent(MainActivity.this, VideoActivity.class);
                startActivity(intent);
                break;
            case 8:
                intent = new Intent(MainActivity.this, CameraActivity.class);
                startActivity(intent);
                break;
            case 9:
                intent = new Intent(MainActivity.this, FragmentActivity.class);
                startActivity(intent);
                break;
            case 10:
                intent = new Intent(MainActivity.this, MapActivity.class);
                startActivity(intent);
                break;
            case 11:
                intent = new Intent(MainActivity.this, SQLiteActivity.class);
                startActivity(intent);
                break;
            case 12:
                intent = new Intent(MainActivity.this, ToastActivity.class);
                startActivity(intent);
                break;
        }

    }


    //setup the toolbar
    private void setUpTheToolbar() {
        drawerLayout = findViewById(R.id.drawerLayoutId);
        toolbar = findViewById(R.id.tolbarId);
        setSupportActionBar(toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

    }
}
