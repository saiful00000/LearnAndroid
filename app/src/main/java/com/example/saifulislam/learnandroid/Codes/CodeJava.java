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
    public static String switchJava = "";
    public static String radioButtonJava = "";
    public static String imageButtonJava = "";
    public static String buttonJava = "";
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
