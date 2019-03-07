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


    public static String checkBoxJava = "";
    public static String alertDialogJava = "";
    public static String scrollViewJava = "";
    public static String progressBarJava = "";
    public static String seekBarJava = "";
    public static String radioButtonJava = "";

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
