package com.example.saifulislam.learnandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.saifulislam.learnandroid.adapters.WidgetsListViewAdapter;

import java.util.List;

public class CommonWidgetActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_widget);

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

    private void itemClickHelper(int position) {
        Intent intent;
        switch (position) {
            case 0 ://textview
                Toast.makeText(this, "textView", Toast.LENGTH_SHORT).show();
                break;
            case 1://edittext:
                Toast.makeText(this, "editText", Toast.LENGTH_SHORT).show();
                break;
            case 2://button:
                Toast.makeText(this, "Button", Toast.LENGTH_SHORT).show();
                break;
            case 3://image button
                Toast.makeText(this, "imageButton", Toast.LENGTH_SHORT).show();
                break;
            case 4://switcher
                Toast.makeText(this, "Switcher", Toast.LENGTH_SHORT).show();
                break;
            case 5://checkbox
                Toast.makeText(this, "checkbox", Toast.LENGTH_SHORT).show();
                break;
            case 6://alertdialog
                Toast.makeText(this, "alertDialog", Toast.LENGTH_SHORT).show();
                break;
            case 7://scrollview
                Toast.makeText(this, "scrollView", Toast.LENGTH_SHORT).show();
                break;
            case 8://progressbar
                Toast.makeText(this, "ProgresBar", Toast.LENGTH_SHORT).show();
                break;
            case 9://seekbar
                Toast.makeText(this, "Seekbar", Toast.LENGTH_SHORT).show();
                break;
            case 10://radiobutton
                Toast.makeText(this, "radioButton", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
