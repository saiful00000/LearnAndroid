package com.example.saifulislam.learnandroid.Codes;

public class CodeJava {

    public static String intentJava = "";
    public static String containerJava = "";
    public static String menuJava = "";
    public static String dateTimeJava = "";
    public static String animationJava = "";
    public static String auodioJava = "";
    public static String videoJava = "";
    public static String cameraJava = "";
    public static String fragmentJava = "";
    public static String mapJava = "";
    public static String sqliteJava = "";
    public static String toastJava = "";



    public static String radioButtonJava = "";

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
