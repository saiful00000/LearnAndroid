package com.example.saifulislam.learnandroid;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.saifulislam.learnandroid.models.DatabaseHelper;

public class SQLiteActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private FloatingActionButton floatingActionButton;
    private Button insertBtn, deletBtn, fetchBtn;
    private EditText nameEt, idEt;
    private TextView infoTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqlite);

        //setup the toolbar
        setUpTheToolBar();

        infoTv = findViewById(R.id.info_tv_id);
        nameEt = findViewById(R.id.name_et_id);
        idEt = findViewById(R.id.ID_et_id);
        insertBtn = findViewById(R.id.insert_btn_id);
        deletBtn = findViewById(R.id.delete_btn_id);
        fetchBtn = findViewById(R.id.fetch_btn_id);
        floatingActionButton = findViewById(R.id.fab_id);


        final DatabaseHelper databaseHelper = new DatabaseHelper(this);

        insertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEt.getText().toString();
                String id = idEt.getText().toString();
                if (name.equals("")) {
                    Toast.makeText(SQLiteActivity.this, "Enter person name", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (id.equals("")) {
                    Toast.makeText(SQLiteActivity.this, "Enter person id", Toast.LENGTH_SHORT).show();
                    return;
                }
                SQLiteDatabase database = databaseHelper.getWritableDatabase();
                ContentValues values = new ContentValues();
                values.put("pname", name);
                values.put("pid", id);
                long row = database.insert("person_info", null, values);
                if (row != -1) {
                    Toast.makeText(SQLiteActivity.this, "Data inserted succesfully.", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(SQLiteActivity.this, "Data is not inserted.", Toast.LENGTH_SHORT).show();
                }
                nameEt.setText("");
                idEt.setText("");
            }
        });

        fetchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase database = databaseHelper.getReadableDatabase();
                String[] projection = {"pname","pid"};
                final Cursor cursor = database.query("person_info", projection,
                        null,null,null,null,null);
                int count = cursor.getCount();
                if (count == 0) {
                    Toast.makeText(SQLiteActivity.this, "No data found", Toast.LENGTH_SHORT).show();
                    return;
                }
                Handler handler1 = new Handler();
                for (int i = 0; i < count; i++) {
                    final int finalI = i;
                    handler1.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            cursor.moveToPosition(finalI);
                            infoTv.setText(cursor.getString(0) + " " + cursor.getString(1));
                        }
                    }, 1000 * i);
                }
            }
        });

        deletBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SQLiteDatabase database = databaseHelper.getWritableDatabase();
                database.execSQL("delete from person_info");
                Toast.makeText(SQLiteActivity.this, "All information has been deleted.", Toast.LENGTH_SHORT).show();
                infoTv.setText("");
            }
        });

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SQLiteActivity.this, SQLiteCode.class);
                startActivity(intent);
            }
        });
    }


    //setup the toolbar
    private void setUpTheToolBar() {
        toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(Color.BLACK);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_black_24dp);  // chage arrow color or set spacific icon
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}