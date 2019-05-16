package com.example.saifulislam.learnandroid.Codes;

public class CodeJava {

    public static String intentJava = "";
    public static String containerJava = "";
    public static String menuJava = "";
    public static String videoJava = "";
    public static String cameraJava = "";
    public static String fragmentJava = "";
    public static String mapJava = "";

    public static String recyclerViewJava = "";

    public static String listViewJava = "package com.example.listview;\n" +
            "\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.widget.ArrayAdapter;\n" +
            "import android.widget.ListView;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "\n" +
            "    private ListView listView;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "\n" +
            "        String[] list = {\"A\", \"B\", \"C\", \"D\", \"E\", \"F\", \"G\", \"H\", \"I\", \"J\", \"K\", \"L\",\n" +
            "                \"M\", \"N\", \"O\", \"P\", \"Q\", \"R\", \"S\", \"T\", \"U\", \"V\", \"W\", \"X\", \"Y\", \"Z\"};\n" +
            "        listView = findViewById(R.id.listview_id);\n" +
            "        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.list_content, R.id.tv_id, list);\n" +
            "        listView.setAdapter(adapter);\n" +
            "\n" +
            "    }\n" +
            "}\n";

    public static String animationJava = "package com.example.sairamkrishna.myapplication;\n" +
            "\n" +
            "import android.app.Activity;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.view.animation.Animation;\n" +
            "import android.view.animation.AnimationUtils;\n" +
            "import android.widget.ImageView;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "public class MainActivity extends Activity {\n" +
            "   @Override\n" +
            "   protected void onCreate(Bundle savedInstanceState) {\n" +
            "      super.onCreate(savedInstanceState);\n" +
            "      setContentView(R.layout.activity_main);\n" +
            "   }\n" +
            "   \n" +
            "   public void clockwise(View view){\n" +
            "      ImageView image = (ImageView)findViewById(R.id.imageView);\n" +
            "      Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), \n" +
            "         R.anim.myanimation);\n" +
            "      image.startAnimation(animation);\n" +
            "   }\n" +
            "   \n" +
            "   public void zoom(View view){\n" +
            "      ImageView image = (ImageView)findViewById(R.id.imageView);\n" +
            "      Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), \n" +
            "         R.anim.clockwise);\n" +
            "      image.startAnimation(animation1);\n" +
            "   }\n" +
            "   \n" +
            "   public void fade(View view){\n" +
            "      ImageView image = (ImageView)findViewById(R.id.imageView);\n" +
            "      Animation animation1 = \n" +
            "         AnimationUtils.loadAnimation(getApplicationContext(), \n" +
            "            R.anim.fade);\n" +
            "      image.startAnimation(animation1);\n" +
            "   }\n" +
            "   \n" +
            "   public void blink(View view){\n" +
            "      ImageView image = (ImageView)findViewById(R.id.imageView);\n" +
            "      Animation animation1 = \n" +
            "         AnimationUtils.loadAnimation(getApplicationContext(), \n" +
            "            R.anim.blink);\n" +
            "      image.startAnimation(animation1);\n" +
            "   }\n" +
            "   \n" +
            "   public void move(View view){\n" +
            "      ImageView image = (ImageView)findViewById(R.id.imageView);\n" +
            "      Animation animation1 = \n" +
            "         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);\n" +
            "      image.startAnimation(animation1);\n" +
            "   }\n" +
            "   \n" +
            "   public void slide(View view){\n" +
            "      ImageView image = (ImageView)findViewById(R.id.imageView);\n" +
            "      Animation animation1 = \n" +
            "         AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);\n" +
            "      image.startAnimation(animation1);\n" +
            "   }\n" +
            "}";

    public static String dateTimePickerJava = "package com.example.saifulislam.learnandroid;\n" +
            "\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "\n" +
            "public class DateTimePicker extends AppCompatActivity {\n" +
            "    \n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_date_time_picker);\n" +
            "        \n" +
            "    }\n" +
            "}\n";

    public static String clockJava = "package com.example.saifulislam.learnandroid;\n" +
            "\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "\n" +
            "public class Clock extends AppCompatActivity {\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_clock);\n" +
            "    }\n" +
            "}\n";

    public static String sqliteJava = "package com.example.sqlite;\n" +
            "\n" +
            "import android.content.ContentValues;\n" +
            "import android.database.Cursor;\n" +
            "import android.database.sqlite.SQLiteDatabase;\n" +
            "import android.os.Handler;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.EditText;\n" +
            "import android.widget.TextView;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "import com.example.sqlite.models.StudentDbHelper;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "\n" +
            "    private EditText nameEt, idEt;\n" +
            "    private Button insertBtn, fetchBtn, dltrowsBtn;\n" +
            "    private TextView showInfoTv;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "\n" +
            "        nameEt = findViewById(R.id.name_et_id);\n" +
            "        idEt = findViewById(R.id.id_et_id);\n" +
            "        insertBtn = findViewById(R.id.insert_btn_id);\n" +
            "        fetchBtn = findViewById(R.id.fetch_btn_id);\n" +
            "        dltrowsBtn = findViewById(R.id.dlt_all_rows_btn_id);\n" +
            "        showInfoTv = findViewById(R.id.showdata_tv_id);\n" +
            "\n" +
            "        final StudentDbHelper helper = new StudentDbHelper(this);\n" +
            "\n" +
            "\n" +
            "        insertBtn.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                String name = nameEt.getText().toString();\n" +
            "                String id = idEt.getText().toString();\n" +
            "\n" +
            "                if (name.equals(\"\")) {\n" +
            "                    Toast.makeText(MainActivity.this, \"Please enter your name.\", Toast.LENGTH_SHORT).show();\n" +
            "                    return;\n" +
            "                }\n" +
            "                if (id.equals(\"\")) {\n" +
            "                    Toast.makeText(MainActivity.this, \"Please enter your id.\", Toast.LENGTH_SHORT).show();\n" +
            "                    return;\n" +
            "                }\n" +
            "                SQLiteDatabase database = helper.getWritableDatabase();\n" +
            "                ContentValues values = new ContentValues();\n" +
            "                values.put(\"sname\", name);\n" +
            "                values.put(\"sid\",id);\n" +
            "\n" +
            "                long row = database.insert(\"stud_info\", null, values);\n" +
            "\n" +
            "                if (row != -1) {\n" +
            "                    Toast.makeText(MainActivity.this, \"Data inserted succesfully.\", Toast.LENGTH_SHORT).show();\n" +
            "                } else {\n" +
            "                    Toast.makeText(MainActivity.this, \"Data is not inserted.\", Toast.LENGTH_SHORT).show();\n" +
            "                }\n" +
            "                nameEt.setText(\"\");\n" +
            "                idEt.setText(\"\");\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "        fetchBtn.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                SQLiteDatabase database = helper.getReadableDatabase();\n" +
            "                String[] projection = {\"sname\",\"sid\"};\n" +
            "                final Cursor cursor = database.query(\"stud_info\", projection, null,\n" +
            "                        null, null,null,null);\n" +
            "                int count = cursor.getCount();\n" +
            "                if (count == 0) {\n" +
            "                    Toast.makeText(MainActivity.this, \"No data found\", Toast.LENGTH_SHORT).show();\n" +
            "                    return;\n" +
            "                }\n" +
            "\n" +
            "                Handler handler1 = new Handler();\n" +
            "                for (int i = 0; i < count; i++) {\n" +
            "                    final int finalI = i;\n" +
            "                    handler1.postDelayed(new Runnable() {\n" +
            "                        @Override\n" +
            "                        public void run() {\n" +
            "                            cursor.moveToPosition(finalI);\n" +
            "                            showInfoTv.setText(cursor.getString(0) + \" \" + cursor.getString(1));\n" +
            "                        }\n" +
            "                    }, 1000 * i);\n" +
            "                }\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "        dltrowsBtn.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                SQLiteDatabase database = helper.getWritableDatabase();\n" +
            "                database.execSQL(\"DELETE FROM stud_info\");\n" +
            "            }\n" +
            "        });\n" +
            "    }\n" +
            "}\n";

    public static String auodioJava = "package com.example.audio;\n" +
            "\n" +
            "import android.media.MediaPlayer;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity{\n" +
            "\n" +
            "    private Button playButton, pauseButton, stopButton;\n" +
            "    private MediaPlayer mediaPlayer;\n" +
            "    private int pauseCurrentPosition;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "\n" +
            "        playButton = findViewById(R.id.play_button_id);\n" +
            "        pauseButton = findViewById(R.id.pause_button_id);\n" +
            "        stopButton = findViewById(R.id.stop_button_id);\n" +
            "\n" +
            "        playButton.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                if (mediaPlayer == null) {\n" +
            "                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.onemorelight);\n" +
            "                    mediaPlayer.start();\n" +
            "                } else if (!mediaPlayer.isPlaying()) {\n" +
            "                    mediaPlayer.seekTo(pauseCurrentPosition);\n" +
            "                    mediaPlayer.start();\n" +
            "                }\n" +
            "            }\n" +
            "        });\n" +
            "        pauseButton.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                if (mediaPlayer != null) {\n" +
            "                    mediaPlayer.pause();\n" +
            "                    pauseCurrentPosition = mediaPlayer.getCurrentPosition();\n" +
            "                }\n" +
            "            }\n" +
            "        });\n" +
            "        stopButton.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                if (mediaPlayer != null) {\n" +
            "                    mediaPlayer.stop();\n" +
            "                    mediaPlayer = null;\n" +
            "                }\n" +
            "            }\n" +
            "        });\n" +
            "    }\n" +
            "}\n";

    public static String toastJava = "package com.example.toast;\n" +
            "\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "\n" +
            "    Button toastButon, customToastButton;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "\n" +
            "        toastButon = findViewById(R.id.toast_button_id);\n" +
            "        customToastButton = findViewById(R.id.custom_toast_button_id);\n" +
            "\n" +
            "        toastButon.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                Toast.makeText(MainActivity.this, \"Toast\", Toast.LENGTH_SHORT).show();\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "        customToastButton.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                View toastView = getLayoutInflater().inflate(R.layout.custom_toast_background, null);\n" +
            "                Toast toast = new Toast(getApplicationContext());\n" +
            "                toast.setView(toastView);\n" +
            "                toast.setDuration(Toast.LENGTH_SHORT);\n" +
            "                toast.show();\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "    }\n" +
            "}\n";


    public static String radioButtonJava = "package com.example.radiobutton;\n" +
            "\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.RadioButton;\n" +
            "import android.widget.RadioGroup;\n" +
            "import android.widget.TextView;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "\n" +
            "    RadioGroup radioGroup;\n" +
            "    RadioButton radioButton;\n" +
            "    Button button;\n" +
            "    TextView textView;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "\n" +
            "        button = findViewById(R.id.button_id);\n" +
            "        radioGroup = findViewById(R.id.radiogroup_id);\n" +
            "        textView = findViewById(R.id.textview_id);\n" +
            "\n" +
            "        button.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                int radioButtonId = radioGroup.getCheckedRadioButtonId();\n" +
            "                radioButton = findViewById(radioButtonId);\n" +
            "                textView.setText(\"You Chose \" + radioButton.getText());\n" +
            "            }\n" +
            "        });\n" +
            "    }\n" +
            "}\n";

    public static String seekBarJava = "package com.example.seekbar;\n" +
            "\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.widget.SeekBar;\n" +
            "import android.widget.TextView;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "\n" +
            "    SeekBar seekBar;\n" +
            "    TextView textView;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "\n" +
            "        seekBar = findViewById(R.id.seekbar_id);\n" +
            "        textView = findViewById(R.id.textview_id);\n" +
            "\n" +
            "        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {\n" +
            "            @Override\n" +
            "            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {\n" +
            "                textView.setText(\"Progress\" + progress + \" / 20\");\n" +
            "            }\n" +
            "            @Override\n" +
            "            public void onStartTrackingTouch(SeekBar seekBar) {\n" +
            "                Toast.makeText(MainActivity.this, \"Seekbar Touched.\", Toast.LENGTH_SHORT).show();\n" +
            "            }\n" +
            "            @Override\n" +
            "            public void onStopTrackingTouch(SeekBar seekBar) {\n" +
            "                Toast.makeText(MainActivity.this, \"Seekbar Touch Finished.\", Toast.LENGTH_SHORT).show();\n" +
            "            }\n" +
            "        });\n" +
            "    }\n" +
            "}\n";

    public static String progressBarJava = "package com.example.progressbar;\n" +
            "\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.ProgressBar;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "\n" +
            "    ProgressBar progressBar;\n" +
            "    \n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "\n" +
            "        progressBar = findViewById(R.id.progrebar_id);\n" +
            "\n" +
            "        Thread thread = new Thread(new Runnable() {\n" +
            "            @Override\n" +
            "            public void run() {\n" +
            "                doWork();\n" +
            "            }\n" +
            "        });\n" +
            "        thread.start();\n" +
            "    }\n" +
            "    public void doWork() {\n" +
            "        for (int progress = 1; progress <= 100; progress+=1) {\n" +
            "            try {\n" +
            "                Thread.sleep(100);\n" +
            "                progressBar.setProgress(progress);\n" +
            "            } catch (InterruptedException e) {\n" +
            "                e.printStackTrace();\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "}\n";

    public static String scrollViewJava = "package com.example.scrollview;\n" +
            "\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "    }\n" +
            "}\n";

    public static String alertDialogJava = "package com.example.alerdialog;\n" +
            "\n" +
            "import android.content.DialogInterface;\n" +
            "import android.support.v7.app.AlertDialog;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "\n" +
            "    private Button button;\n" +
            "    private AlertDialog.Builder alertDialogBuilder;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        \n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "\n" +
            "        button = findViewById(R.id.button_id);\n" +
            "        button.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);\n" +
            "                alertDialogBuilder.setIcon(R.drawable.ic_warning_black_24dp);\n" +
            "                alertDialogBuilder.setTitle(\" Alert !\");\n" +
            "                alertDialogBuilder.setMessage(\"Do you want to exit\");\n" +
            "                alertDialogBuilder.setPositiveButton(\"Yes\", new DialogInterface.OnClickListener() {\n" +
            "                    @Override\n" +
            "                    public void onClick(DialogInterface dialog, int which) {\n" +
            "                        finish();\n" +
            "                        Toast.makeText(MainActivity.this, \"You Exit from Application.\", Toast.LENGTH_SHORT).show();\n" +
            "                    }\n" +
            "                });\n" +
            "                alertDialogBuilder.setNegativeButton(\"No\", new DialogInterface.OnClickListener() {\n" +
            "                    @Override\n" +
            "                    public void onClick(DialogInterface dialog, int which) {\n" +
            "                        Toast.makeText(MainActivity.this, \"You pressed No\", Toast.LENGTH_SHORT).show();\n" +
            "                    }\n" +
            "                });\n" +
            "                AlertDialog alertDialog = alertDialogBuilder.create();\n" +
            "                alertDialog.show();\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "}\n";

    public static String checkBoxJava = "package com.example.checkbox;\n" +
            "\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.CheckBox;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "\n" +
            "    CheckBox checkBox1, checkBox2, checkBox3;\n" +
            "    Button button;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "\n" +
            "        checkBox1 = findViewById(R.id.checkbox_one_id);\n" +
            "        checkBox2 = findViewById(R.id.checkbox_two_id);\n" +
            "        checkBox3 = findViewById(R.id.checkbox_three_id);\n" +
            "\n" +
            "        button = findViewById(R.id.button_id);\n" +
            "\n" +
            "        button.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                String result = \"\";\n" +
            "                if (checkBox1.isChecked()){\n" +
            "                    result += \"CheckBox 1 \";\n" +
            "                }\n" +
            "                if (checkBox2.isChecked()){\n" +
            "                    result += \"CheckBox 2 \";\n" +
            "                }\n" +
            "                if (checkBox3.isChecked()){\n" +
            "                    result += \"CheckBox 3 \";\n" +
            "                }\n" +
            "                Toast.makeText(MainActivity.this, result + \"is CHecked.\", Toast.LENGTH_SHORT).show();\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "    }\n" +
            "}\n";

    public static String switchJava = "package com.example.aswitch;\n" +
            "import android.graphics.Color;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.widget.CompoundButton;\n" +
            "import android.widget.Switch;\n" +
            "import android.widget.TextView;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "\n" +
            "    Switch aSwitch;\n" +
            "    TextView textView;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "\n" +
            "        aSwitch = findViewById(R.id.switch_id);\n" +
            "        textView = findViewById(R.id.textview_id);\n" +
            "\n" +
            "        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {\n" +
            "            @Override\n" +
            "            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {\n" +
            "                if (isChecked){\n" +
            "                    textView.setTextColor(Color.GREEN);\n" +
            "                    textView.setText(\"Switch is on.\");\n" +
            "                }else {\n" +
            "                    textView.setTextColor(Color.RED);\n" +
            "                    textView.setText(\"Switch is off\");\n" +
            "                }\n" +
            "            }\n" +
            "        });\n" +
            "    }\n" +
            "}\n";

    public static String imageButtonJava = "package com.example.imagebutton;\n" +
            "\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.ImageButton;\n" +
            "import android.widget.TextView;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "\n" +
            "    private ImageButton imageButton;\n" +
            "    private TextView textView;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "\n" +
            "        imageButton = findViewById(R.id.image_button_id);\n" +
            "        textView = findViewById(R.id.textview_id);\n" +
            "\n" +
            "        imageButton.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                textView.setText(\"ImageButton Clicked!\");\n" +
            "                Toast.makeText(MainActivity.this, \"ImageButton Clicked!\", Toast.LENGTH_SHORT).show();\n" +
            "            }\n" +
            "        });\n" +
            "    }\n" +
            "}\n";

    public static String buttonJava = "package com.example.button;\n" +
            "\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.Toast;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "\n" +
            "    private Button buttonOne, buttonTwo;\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "\n" +
            "        buttonOne = findViewById(R.id.button_one_id);\n" +
            "        buttonTwo = findViewById(R.id.button_two_id);\n" +
            "\n" +
            "        buttonOne.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                Toast.makeText(MainActivity.this, \"Button one is Clicked\", Toast.LENGTH_SHORT).show();\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "        buttonTwo.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                Toast.makeText(MainActivity.this, \"Button two is clicked\", Toast.LENGTH_SHORT).show();\n" +
            "            }\n" +
            "        });\n" +
            "    }\n" +
            "}\n";

    public static String editTextJava = "package com.example.edittext;\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "import android.view.View;\n" +
            "import android.widget.Button;\n" +
            "import android.widget.EditText;\n" +
            "import android.widget.TextView;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "    private EditText editText;\n" +
            "    private Button button;\n" +
            "    private TextView textview;\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "        // find your views here by there id\n" +
            "        editText = findViewById(R.id.edittext_id);\n" +
            "        button = findViewById(R.id.button_id);\n" +
            "        textview = findViewById(R.id.textview_id);\n" +
            "        button.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "                // get text from edittext and set it into textview\n" +
            "                textview.setText(editText.getText());\n" +
            "            }\n" +
            "        });\n" +
            "    }\n" +
            "}\n";

    public static String textViewJava = "package com.example.textview;\n" +
            "\n" +
            "import android.support.v7.app.AppCompatActivity;\n" +
            "import android.os.Bundle;\n" +
            "\n" +
            "public class MainActivity extends AppCompatActivity {\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "    }\n" +
            "}\n";
}
