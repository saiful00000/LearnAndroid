package com.example.saifulislam.learnandroid;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.saifulislam.learnandroid.adapters.WidgetsListViewAdapter;

public class CommonWidgetActivity extends AppCompatActivity {

    ListView listView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_widget);

        // setup the toolbar
        setUpTheToolbar();


        listView = findViewById(R.id.widgetsListViewId);
        String[] contents = getResources().getStringArray(R.array.common_widget_list);
        int[] icons = {R.drawable.txtview, R.drawable.edittext, R.drawable.button, R.drawable.imagebutton, R.drawable.switcher, R.drawable.checkbox,
                R.drawable.alertdialog, R.drawable.scrollview, R.drawable.progresbar, R.drawable.seekbar, R.drawable.radiobutton};
        WidgetsListViewAdapter widgetsListViewAdapter = new WidgetsListViewAdapter(this, contents, icons);
        listView.setAdapter(widgetsListViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                itemClickHelper(position);
            }
        });

    }

    // listview itemclick listener
    private void itemClickHelper(int position) {
        Intent intent;
        switch (position) {
            case 0 ://textview
                intent = new Intent(this, TextViewActivity.class);
                startActivity(intent);
                break;
            case 1://edittext:
                intent = new Intent(this, EditTextActivity.class);
                startActivity(intent);
                break;
            case 2://button:
                intent = new Intent(this, ButtonActivity.class);
                startActivity(intent);
                break;
            case 3://image button
                intent = new Intent(this, ImageButtonActivity.class);
                startActivity(intent);
                break;
            case 4://switcher
                intent = new Intent(this, SwitchActivity.class);
                startActivity(intent);
                break;
            case 5://checkbox
                intent = new Intent(this, CheckBoxActivity.class);
                startActivity(intent);
                break;
            case 6://alertdialog
                intent = new Intent(this, AlertDialogActivity.class);
                startActivity(intent);
                break;
            case 7://scrollview
                intent = new Intent(this, ScrollViewActivity.class);
                startActivity(intent);
                break;
            case 8://progressbar
                intent = new Intent(this, ProgressBarActivity.class);
                startActivity(intent);
                break;
            case 9://seekbar
                intent = new Intent(this, SeekBarActivity.class);
                startActivity(intent);
                break;
            case 10://radiobutton
                intent = new Intent(this, RadioButtonActivity.class);
                startActivity(intent);
                break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.other_activity_manu, menu);
        return true;
    }

    //setup The toolbar
    private void setUpTheToolbar() {
        toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(Color.BLACK);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

}
