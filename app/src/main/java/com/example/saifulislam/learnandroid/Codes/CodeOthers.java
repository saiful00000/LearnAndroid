package com.example.saifulislam.learnandroid.Codes;

public class CodeOthers {

    public static String recyclerViewOtherJava = "package com.example.recyclerview;\n" +
            "\n" +
            "import android.support.annotation.NonNull;\n" +
            "import android.support.v7.widget.RecyclerView;\n" +
            "import android.view.LayoutInflater;\n" +
            "import android.view.View;\n" +
            "import android.view.ViewGroup;\n" +
            "import android.widget.TextView;\n" +
            "\n" +
            "public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecycleVIewHolder> {\n" +
            "\n" +
            "    private String[] data;\n" +
            "\n" +
            "    public RecyclerAdapter(String[] data) {\n" +
            "        this.data = data;\n" +
            "    }\n" +
            "\n" +
            "    @NonNull\n" +
            "    @Override\n" +
            "    public RecycleVIewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {\n" +
            "\n" +
            "        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());\n" +
            "        View view = inflater.inflate(R.layout.recyclerview_content, viewGroup, false);\n" +
            "        return new RecycleVIewHolder(view);\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onBindViewHolder(@NonNull RecycleVIewHolder recycleVIewHolder, int i) {\n" +
            "        String string = data[i];\n" +
            "        recycleVIewHolder.textView.setText(string);\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public int getItemCount() {\n" +
            "        return data.length;\n" +
            "    }\n" +
            "\n" +
            "    public class RecycleVIewHolder extends RecyclerView.ViewHolder{\n" +
            "        TextView textView;\n" +
            "        public RecycleVIewHolder(@NonNull View itemView) {\n" +
            "            super(itemView);\n" +
            "            textView = itemView.findViewById(R.id.tv_id);\n" +
            "        }\n" +
            "    }\n" +
            "}\n";

    public static String recyclerViewOtherXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"wrap_content\"\n" +
            "    android:orientation=\"vertical\">\n" +
            "\n" +
            "    <TextView\n" +
            "        android:id=\"@+id/tv_id\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"60dp\"\n" +
            "        android:gravity=\"center\"\n" +
            "        android:text=\"Saiful\"\n" +
            "        android:textSize=\"20sp\"\n" +
            "        android:textStyle=\"bold\" />\n" +
            "\n" +
            "</LinearLayout>";

    public static String listViewOtherXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"wrap_content\"\n" +
            "    android:orientation=\"vertical\">\n" +
            "    \n" +
            "    <TextView\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"50dp\"\n" +
            "        android:id=\"@+id/tv_id\"\n" +
            "        android:text=\"Hello \"\n" +
            "        android:gravity=\"center_vertical\"\n" +
            "        android:textSize=\"20sp\"\n" +
            "        android:padding=\"5dp\"\n" +
            "        android:textStyle=\"bold\"\n" +
            "        />\n" +
            "</LinearLayout>";

    public static String SQLiteOtherCode1 = "package com.example.sqlite.models;\n" +
            "\n" +
            "import android.content.Context;\n" +
            "import android.database.sqlite.SQLiteDatabase;\n" +
            "import android.database.sqlite.SQLiteOpenHelper;\n" +
            "\n" +
            "public class StudentDbHelper extends SQLiteOpenHelper {\n" +
            "\n" +
            "    public StudentDbHelper(Context context) {\n" +
            "        super(context, \"student.db\", null, 2);\n" +
            "    }\n" +
            "    \n" +
            "    @Override\n" +
            "    public void onCreate(SQLiteDatabase db) {\n" +
            "        db.execSQL(\"create table stud_info (sname text, sid text)\");\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {\n" +
            "        db.execSQL(\"drop table if exists stud_info\");\n" +
            "        onCreate(db);\n" +
            "    }\n" +
            "}\n";


    public static String toastOtherCode2 = "<shape xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:shape=\"rectangle\"\n" +
            "    android:layout_width=\"wrap_content\"\n" +
            "    android:layout_height=\"wrap_content\">\n" +
            "\n" +
            "    <solid android:color=\"#00E5FF\" />\n" +
            "\n" +
            "    <corners android:radius=\"15dp\" />\n" +
            "\n" +
            "</shape>";
    public static String toastOtherCode1 = "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    android:orientation=\"horizontal\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:background=\"@drawable/msg_block\"\n" +
            "    android:padding=\"10dp\">\n" +
            "\n" +
            "    <ImageView\n" +
            "        android:id=\"@+id/customToastImage\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:src=\"@drawable/ic_add_alert_black_24dp\"/>\n" +
            "\n" +
            "    <TextView\n" +
            "        android:id=\"@+id/customToastText\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:text=\"Fully custom toast.\"\n" +
            "        android:textSize=\"20dp\"/>\n" +
            "\n" +
            "</LinearLayout>";
}
