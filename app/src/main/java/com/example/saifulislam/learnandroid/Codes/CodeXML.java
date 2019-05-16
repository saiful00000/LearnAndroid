package com.example.saifulislam.learnandroid.Codes;

public class CodeXML {
    public static String intentXML = "";
    public static String containerXML = "";
    public static String menuXML = "";
    public static String videoXML = "";
    public static String cameraXML = "";
    public static String fragmentXML = "";
    public static String mapXML = "";

    public static String recyclerViewXML = "";

    public static String listViewXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "\n" +
            "    <ListView\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"match_parent\"\n" +
            "        android:id=\"@+id/listview_id\">\n" +
            "    </ListView>\n" +
            "\n" +
            "</LinearLayout>";

    public static String animationXML = "<LinearLayout\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_weight=\"3\"\n" +
            "        android:layout_height=\"0dp\">\n" +
            "\n" +
            "        <ImageView\n" +
            "            android:id=\"@+id/imageView\"\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:layout_height=\"match_parent\"\n" +
            "            android:src=\"@drawable/ic_launcher_background\" />\n" +
            "\n" +
            "    </LinearLayout>\n" +
            "\n" +
            "    <LinearLayout\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_marginTop=\"10dp\"\n" +
            "        android:layout_height=\"0dp\"\n" +
            "        android:layout_weight=\"2\"\n" +
            "        android:weightSum=\"3\"\n" +
            "        >\n" +
            "\n" +
            "        <LinearLayout\n" +
            "            android:layout_width=\"0dp\"\n" +
            "            android:layout_weight=\"1\"\n" +
            "            android:orientation=\"vertical\"\n" +
            "            android:gravity=\"center_vertical\"\n" +
            "            android:layout_height=\"wrap_content\">\n" +
            "\n" +
            "            <Button\n" +
            "                android:id=\"@+id/button\"\n" +
            "                android:layout_width=\"wrap_content\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:onClick=\"clockwise\"\n" +
            "                android:layout_gravity=\"center\"\n" +
            "                android:text=\"zoom\" />\n" +
            "\n" +
            "            <Button\n" +
            "                android:id=\"@+id/button2\"\n" +
            "                android:layout_width=\"wrap_content\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:layout_gravity=\"center\"\n" +
            "                android:onClick=\"zoom\"\n" +
            "                android:text=\"clockwise\" />\n" +
            "\n" +
            "        </LinearLayout>\n" +
            "\n" +
            "        <LinearLayout\n" +
            "            android:layout_width=\"0dp\"\n" +
            "            android:layout_weight=\"1\"\n" +
            "            android:orientation=\"vertical\"\n" +
            "            android:gravity=\"center_vertical\"\n" +
            "            android:layout_height=\"wrap_content\">\n" +
            "\n" +
            "            <Button\n" +
            "                android:id=\"@+id/button3\"\n" +
            "                android:layout_width=\"wrap_content\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:layout_gravity=\"center\"\n" +
            "                android:onClick=\"fade\"\n" +
            "                android:text=\"fade\" />\n" +
            "\n" +
            "            <Button\n" +
            "                android:id=\"@+id/button4\"\n" +
            "                android:layout_width=\"wrap_content\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:layout_gravity=\"center\"\n" +
            "                android:onClick=\"blink\"\n" +
            "                android:text=\"blink\" />\n" +
            "\n" +
            "        </LinearLayout>\n" +
            "\n" +
            "        <LinearLayout\n" +
            "            android:layout_width=\"0dp\"\n" +
            "            android:layout_weight=\"1\"\n" +
            "            android:gravity=\"center_vertical\"\n" +
            "            android:orientation=\"vertical\"\n" +
            "            android:layout_height=\"wrap_content\">\n" +
            "\n" +
            "            <Button\n" +
            "                android:id=\"@+id/button5\"\n" +
            "                android:layout_width=\"wrap_content\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:layout_gravity=\"center\"\n" +
            "                android:onClick=\"move\"\n" +
            "                android:text=\"move\" />\n" +
            "\n" +
            "            <Button\n" +
            "                android:id=\"@+id/button6\"\n" +
            "                android:layout_gravity=\"center\"\n" +
            "                android:layout_width=\"wrap_content\"\n" +
            "                android:layout_height=\"wrap_content\"\n" +
            "                android:onClick=\"slide\"\n" +
            "                android:text=\"slide\" />\n" +
            "\n" +
            "        </LinearLayout>\n" +
            "\n" +
            "    </LinearLayout>";

    public static String dateTimePickerXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "\n" +
            "    tools:context=\".DateTimePicker\">\n" +
            "\n" +
            "    <TimePicker\n" +
            "        android:id=\"@+id/time_picker_id\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        >\n" +
            "    </TimePicker>\n" +
            "\n" +
            "</LinearLayout>";

    public static String clockXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    tools:context=\".Clock\">\n" +
            "\n" +
            "    <LinearLayout\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"match_parent\"\n" +
            "        android:orientation=\"vertical\"\n" +
            "        android:gravity=\"center\"\n" +
            "        android:padding=\"10dp\"\n" +
            "        >\n" +
            "\n" +
            "        <TextView\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:text=\"Analog Clock\"\n" +
            "            android:textSize=\"20sp\"\n" +
            "            android:textColor=\"@color/black\"\n" +
            "            />\n" +
            "\n" +
            "        <AnalogClock\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_gravity=\"center\"\n" +
            "\n" +
            "            />\n" +
            "\n" +
            "        <TextView\n" +
            "            android:layout_marginTop=\"40dp\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:text=\"Digital Clock\"\n" +
            "            android:textSize=\"20sp\"\n" +
            "            android:textColor=\"@color/black\"\n" +
            "            />\n" +
            "\n" +
            "        <TextClock\n" +
            "            android:background=\"@color/fab_color\"\n" +
            "            android:layout_marginTop=\"10dp\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            tools:targetApi=\"jelly_bean_mr1\"\n" +
            "            android:format12Hour=\"hh:mm:ss a\"\n" +
            "            android:textSize=\"25sp\"\n" +
            "            android:layout_gravity=\"center\"\n" +
            "            android:textColor=\"@color/white\"\n" +
            "            android:padding=\"5dp\"\n" +
            "            />\n" +
            "\n" +
            "    </LinearLayout>\n" +
            "\n" +
            "</LinearLayout>";

    public static String sqliteXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    android:padding=\"20dp\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "\n" +
            "    <TextView\n" +
            "        android:id=\"@+id/showdata_tv_id\"\n" +
            "        android:layout_marginTop=\"50dp\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:textColor=\"#000000\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_gravity=\"center\"\n" +
            "        />\n" +
            "\n" +
            "    <TextView\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_marginTop=\"50dp\"\n" +
            "        android:text=\"Your name\"\n" +
            "        android:textColor=\"#000000\"\n" +
            "        android:textSize=\"18sp\" />\n" +
            "\n" +
            "    <EditText\n" +
            "        android:id=\"@+id/name_et_id\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:hint=\"Name...\"\n" +
            "        android:textColor=\"#000000\" />\n" +
            "\n" +
            "    <TextView\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:text=\"Your ID\"\n" +
            "        android:textColor=\"#000000\"\n" +
            "        android:textSize=\"18sp\" />\n" +
            "\n" +
            "    <EditText\n" +
            "        android:id=\"@+id/id_et_id\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:hint=\"ID...\"\n" +
            "        android:textColor=\"#000000\" />\n" +
            "\n" +
            "    <Button\n" +
            "        android:id=\"@+id/insert_btn_id\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_gravity=\"center\"\n" +
            "        android:layout_marginTop=\"20dp\"\n" +
            "        android:text=\"Insert your info to Db\"\n" +
            "        android:textAllCaps=\"false\" />\n" +
            "\n" +
            "    <Button\n" +
            "        android:id=\"@+id/fetch_btn_id\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_gravity=\"center\"\n" +
            "        android:layout_marginTop=\"10dp\"\n" +
            "        android:text=\"Fetch your data from db\"\n" +
            "        android:textAllCaps=\"false\" />\n" +
            "\n" +
            "    <Button\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:text=\"Delete your all info\"\n" +
            "        android:layout_gravity=\"center\"\n" +
            "        android:layout_marginTop=\"10dp\"\n" +
            "        android:textAllCaps=\"false\"\n" +
            "        android:id=\"@+id/dlt_all_rows_btn_id\"\n" +
            "        />\n" +
            "\n" +
            "</LinearLayout>";

    public static String auodioXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:background=\"@drawable/back\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "\n" +
            "    <LinearLayout\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"match_parent\"\n" +
            "        android:gravity=\"center\">\n" +
            "        \n" +
            "        <Button\n" +
            "            android:id=\"@+id/pause_button_id\"\n" +
            "            android:layout_width=\"80dp\"\n" +
            "            android:layout_height=\"80dp\"\n" +
            "            android:background=\"@drawable/pause\" />\n" +
            "\n" +
            "        <Button\n" +
            "            android:id=\"@+id/play_button_id\"\n" +
            "            android:layout_width=\"130dp\"\n" +
            "            android:layout_height=\"130dp\"\n" +
            "            android:background=\"@drawable/ic_play_circle_outline_black_24dp\" />\n" +
            "\n" +
            "        <Button\n" +
            "            android:id=\"@+id/stop_button_id\"\n" +
            "            android:layout_width=\"80dp\"\n" +
            "            android:layout_height=\"80dp\"\n" +
            "            android:background=\"@drawable/stop\" />\n" +
            "\n" +
            "    </LinearLayout>\n" +
            "</LinearLayout>";

    public static String toastXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:gravity=\"center\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "\n" +
            "    <Button\n" +
            "        android:id=\"@+id/toast_button_id\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:background=\"#3D5AFE\"\n" +
            "        android:padding=\"5dp\"\n" +
            "        android:text=\"Toast\"\n" +
            "        android:textAllCaps=\"false\"\n" +
            "        android:textSize=\"20sp\" />\n" +
            "\n" +
            "    <Button\n" +
            "        android:id=\"@+id/custom_toast_button_id\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_marginTop=\"20dp\"\n" +
            "        android:background=\"#1DE9B6\"\n" +
            "        android:padding=\"5dp\"\n" +
            "        android:text=\"Custom Toast\"\n" +
            "        android:textAllCaps=\"false\"\n" +
            "        android:textSize=\"20sp\" />\n" +
            "\n" +
            "</LinearLayout>";



    public static String radioButtonXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:gravity=\"center\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "\n" +
            "    <RadioGroup\n" +
            "        android:id=\"@+id/radiogroup_id\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\">\n" +
            "\n" +
            "        <RadioButton\n" +
            "            android:id=\"@+id/radio_button_one_id\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:text=\"Samsung\"\n" +
            "            android:textColor=\"#000000\"\n" +
            "            android:textSize=\"20sp\" />\n" +
            "\n" +
            "        <RadioButton\n" +
            "            android:id=\"@+id/radio_button_two_id\"\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:text=\"Google\"\n" +
            "            android:textColor=\"#000000\"\n" +
            "            android:textSize=\"20sp\" />\n" +
            "\n" +
            "        <RadioButton\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:id=\"@+id/radio_button_three_id\"\n" +
            "            android:text=\"Apple\"\n" +
            "            android:textColor=\"#000000\"\n" +
            "            android:textSize=\"20sp\"\n" +
            "            />\n" +
            "\n" +
            "        <RadioButton\n" +
            "            android:layout_width=\"wrap_content\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:id=\"@+id/radio_button_four_id\"\n" +
            "            android:text=\"Microsoft\"\n" +
            "            android:textColor=\"#000000\"\n" +
            "            android:textSize=\"20sp\"\n" +
            "            />\n" +
            "\n" +
            "    </RadioGroup>\n" +
            "\n" +
            "    <Button\n" +
            "        android:id=\"@+id/button_id\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:text=\"Show Selection\"\n" +
            "        android:textAllCaps=\"false\"\n" +
            "        android:padding=\"4dp\"\n" +
            "        android:textColor=\"#ffffff\"\n" +
            "        android:layout_marginTop=\"20dp\"\n" +
            "        android:background=\"#3D5AFE\"\n" +
            "        />\n" +
            "\n" +
            "    <TextView\n" +
            "        android:id=\"@+id/textview_id\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:textColor=\"#000000\"\n" +
            "        android:layout_marginTop=\"20dp\"\n" +
            "        android:textSize=\"30sp\"/>\n" +
            "\n" +
            "</LinearLayout>";

    public static String seekBarXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    android:gravity=\"center\"\n" +
            "    android:padding=\"20dp\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "\n" +
            "    <SeekBar\n" +
            "        android:id=\"@+id/seekbar_id\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"30dp\"\n" +
            "        android:thumbTint=\"@color/colorPrimaryDark\"\n" +
            "        />\n" +
            "    <TextView\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:id=\"@+id/textview_id\"\n" +
            "        android:textColor=\"#000000\"\n" +
            "        android:textSize=\"20sp\"\n" +
            "        android:text=\"Progress : 0 / 20\"\n" +
            "        android:layout_marginTop=\"20dp\"\n" +
            "        />\n" +
            "\n" +
            "</LinearLayout>";

    public static String progressBarXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    android:gravity=\"center\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "\n" +
            "    <TextView\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_marginLeft=\"10dp\"\n" +
            "        android:layout_marginTop=\"10dp\"\n" +
            "        android:text=\"ProgressBar\"\n" +
            "        android:textSize=\"30sp\"\n" +
            "        app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
            "        app:layout_constraintLeft_toLeftOf=\"parent\"\n" +
            "        app:layout_constraintRight_toRightOf=\"parent\"\n" +
            "        app:layout_constraintTop_toTopOf=\"parent\" />\n" +
            "\n" +
            "    <ProgressBar\n" +
            "        android:id=\"@+id/progrebar_id\"\n" +
            "        style=\"@style/Base.Widget.AppCompat.ProgressBar.Horizontal\"\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"20dp\"\n" +
            "        android:layout_margin=\"20dp\" />\n" +
            "\n" +
            "</LinearLayout>";

    public static String scrollViewXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    android:padding=\"20dp\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "\n" +
            "    <TextView\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:text=\"ScrollView\"\n" +
            "        android:textColor=\"#000000\"\n" +
            "        android:textSize=\"30sp\"\n" +
            "        />\n" +
            "\n" +
            "    <ScrollView\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"match_parent\">\n" +
            "\n" +
            "        <LinearLayout\n" +
            "            android:layout_width=\"match_parent\"\n" +
            "            android:orientation=\"vertical\"\n" +
            "            android:layout_height=\"wrap_content\">\n" +
            "\n" +
            "            <Button\n" +
            "                android:text=\"Button 0\"\n" +
            "                android:textColor=\"#ffffff\"\n" +
            "                android:background=\"#000000\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\" />\n" +
            "            <Button\n" +
            "                android:layout_marginTop=\"4dp\"\n" +
            "                android:text=\"Button 1\"\n" +
            "                android:textColor=\"#ffffff\"\n" +
            "                android:background=\"#53C00A\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\" />\n" +
            "            <Button\n" +
            "                android:layout_marginTop=\"4dp\"\n" +
            "                android:text=\"Button 2\"\n" +
            "                android:textColor=\"#ffffff\"\n" +
            "                android:background=\"#5E1361\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\" />\n" +
            "            <Button\n" +
            "                android:layout_marginTop=\"4dp\"\n" +
            "                android:text=\"Button 3\"\n" +
            "                android:textColor=\"#ffffff\"\n" +
            "                android:background=\"#03A9F4\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\" />\n" +
            "            <Button\n" +
            "                android:layout_marginTop=\"4dp\"\n" +
            "                android:text=\"Button 4\"\n" +
            "                android:textColor=\"#ffffff\"\n" +
            "                android:background=\"#FF9800\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\" />\n" +
            "            <Button\n" +
            "                android:layout_marginTop=\"4dp\"\n" +
            "                android:text=\"Button 5\"\n" +
            "                android:textColor=\"#ffffff\"\n" +
            "                android:background=\"#4CAF50\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\" />\n" +
            "            <Button\n" +
            "                android:layout_marginTop=\"4dp\"\n" +
            "                android:text=\"Button 6\"\n" +
            "                android:textColor=\"#ffffff\"\n" +
            "                android:background=\"#F44336\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\" />\n" +
            "            <Button\n" +
            "                android:layout_marginTop=\"4dp\"\n" +
            "                android:text=\"Button 7\"\n" +
            "                android:textColor=\"#ffffff\"\n" +
            "                android:background=\"#E91E63\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\" />\n" +
            "            <Button\n" +
            "                android:layout_marginTop=\"4dp\"\n" +
            "                android:text=\"Button 8\"\n" +
            "                android:textColor=\"#ffffff\"\n" +
            "                android:background=\"#9C27B0\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\" />\n" +
            "            <Button\n" +
            "                android:layout_marginTop=\"4dp\"\n" +
            "                android:text=\"Button 9\"\n" +
            "                android:textColor=\"#ffffff\"\n" +
            "                android:background=\"#673AB7\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\" />\n" +
            "            <Button\n" +
            "                android:layout_marginTop=\"4dp\"\n" +
            "                android:text=\"Button 10\"\n" +
            "                android:textColor=\"#ffffff\"\n" +
            "                android:background=\"#2196F3\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\" />\n" +
            "            <Button\n" +
            "                android:layout_marginTop=\"4dp\"\n" +
            "                android:text=\"Button 11\"\n" +
            "                android:textColor=\"#ffffff\"\n" +
            "                android:background=\"#CDDC39\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\" />\n" +
            "            <Button\n" +
            "                android:layout_marginTop=\"4dp\"\n" +
            "                android:text=\"Button 12\"\n" +
            "                android:textColor=\"#ffffff\"\n" +
            "                android:background=\"#5E35B1\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\" />\n" +
            "            <Button\n" +
            "                android:layout_marginTop=\"4dp\"\n" +
            "                android:text=\"Button 13\"\n" +
            "                android:textColor=\"#ffffff\"\n" +
            "                android:background=\"#00E5FF\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\" />\n" +
            "            <Button\n" +
            "                android:layout_marginTop=\"4dp\"\n" +
            "                android:text=\"Button 14\"\n" +
            "                android:textColor=\"#ffffff\"\n" +
            "                android:background=\"#FF3D00\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\" />\n" +
            "            <Button\n" +
            "                android:layout_marginTop=\"4dp\"\n" +
            "                android:text=\"Button 15\"\n" +
            "                android:textColor=\"#ffffff\"\n" +
            "                android:background=\"#FF1744\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\" />\n" +
            "            <Button\n" +
            "                android:layout_marginTop=\"4dp\"\n" +
            "                android:text=\"Button 16\"\n" +
            "                android:textColor=\"#ffffff\"\n" +
            "                android:background=\"#00E5FF\"\n" +
            "                android:layout_width=\"match_parent\"\n" +
            "                android:layout_height=\"wrap_content\" />\n" +
            "\n" +
            "\n" +
            "        </LinearLayout>\n" +
            "\n" +
            "    </ScrollView>\n" +
            "\n" +
            "</LinearLayout>";

    public static String alertDialogXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    android:gravity=\"center|bottom\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "\n" +
            "    <Button\n" +
            "        android:id=\"@+id/button_id\"\n" +
            "        android:layout_marginBottom=\"50dp\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:background=\"@color/colorAccent\"\n" +
            "        android:textColor=\"#ffffff\"\n" +
            "        android:padding=\"5dp\"\n" +
            "        android:textAllCaps=\"false\"\n" +
            "        android:text=\"Show AlertDialog\"\n" +
            "        />\n" +
            "\n" +
            "</LinearLayout>";

    public static String checkBoxXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:gravity=\"center\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "\n" +
            "    <CheckBox\n" +
            "        android:id=\"@+id/checkbox_one_id\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:buttonTint=\"@color/colorPrimary\"\n" +
            "        android:text=\" CheckBox 01\"\n" +
            "        android:textSize=\"30sp\" />\n" +
            "\n" +
            "    <CheckBox\n" +
            "        android:id=\"@+id/checkbox_two_id\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:buttonTint=\"@color/colorAccent\"\n" +
            "        android:text=\" CheckBox 02\"\n" +
            "        android:textSize=\"30sp\" />\n" +
            "\n" +
            "    <CheckBox\n" +
            "        android:id=\"@+id/checkbox_three_id\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:buttonTint=\"@color/colorPrimaryDark\"\n" +
            "        android:text=\" CheckBox 03\"\n" +
            "        android:textSize=\"30sp\" />\n" +
            "\n" +
            "    <Button\n" +
            "        android:id=\"@+id/button_id\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_marginTop=\"20dp\"\n" +
            "        android:textColor=\"@color/colorAccent\"\n" +
            "        android:text=\"Check\" />\n" +
            "\n" +
            "</LinearLayout>";

    public static String switchXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:gravity=\"center\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "\n" +
            "    <Switch\n" +
            "        android:id=\"@+id/switch_id\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_gravity=\"center\"\n" +
            "        android:text=\"Switch  \"\n" +
            "        android:textOff=\"off\"\n" +
            "        android:textOn=\"on\"\n" +
            "        android:textSize=\"30dp\" />\n" +
            "\n" +
            "    <TextView\n" +
            "        android:id=\"@+id/textview_id\"\n" +
            "        android:text=\"Switch is off.\"\n" +
            "        android:textColor=\"#FF0000\"\n" +
            "        android:textSize=\"20sp\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_marginTop=\"40dp\" />\n" +
            "\n" +
            "</LinearLayout>";

    public static String imageButtonXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    android:gravity=\"center\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "\n" +
            "    <ImageButton\n" +
            "        android:id=\"@+id/image_button_id\"\n" +
            "        android:layout_gravity=\"center\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:src=\"@drawable/gelary_image\"\n" +
            "        />\n" +
            "    \n" +
            "    <TextView\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:id=\"@+id/textview_id\"\n" +
            "        android:textSize=\"30sp\"\n" +
            "        />\n" +
            "\n" +
            "</LinearLayout>";

    public static String buttonXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    android:gravity=\"center\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "\n" +
            "    <Button\n" +
            "        android:id=\"@+id/button_one_id\"\n" +
            "        android:layout_width=\"150dp\"\n" +
            "        android:layout_height=\"60dp\"\n" +
            "        android:text=\"Button 1\"\n" +
            "        android:background=\"#8D0FA3\"\n" +
            "        android:textColor=\"#ffffff\"\n" +
            "\n" +
            "        />\n" +
            "    <Button\n" +
            "        android:layout_marginTop=\"20dp\"\n" +
            "        android:id=\"@+id/button_two_id\"\n" +
            "        android:layout_width=\"150dp\"\n" +
            "        android:layout_height=\"60dp\"\n" +
            "        android:text=\"Button 2\"\n" +
            "        android:background=\"#0375CE\"\n" +
            "\n" +
            "        />\n" +
            "    \n" +
            "</LinearLayout>";

    public static String editTextXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    android:padding=\"10dp\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "\n" +
            "    <EditText\n" +
            "        android:id=\"@+id/edittext_id\"\n" +
            "        style=\"@style/Widget.AppCompat.EditText\"\n" +
            "        android:layout_width=\"250dp\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_gravity=\"center\"\n" +
            "        android:hint=\"Write something....\" />\n" +
            "\n" +
            "    <Button\n" +
            "        android:id=\"@+id/button_id\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_gravity=\"center\"\n" +
            "        android:background=\"@color/colorPrimary\"\n" +
            "        android:layout_marginTop=\"20dp\"\n" +
            "        android:text=\"Show text\" />\n" +
            "\n" +
            "    <TextView\n" +
            "        android:id=\"@+id/textview_id\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_gravity=\"center\"\n" +
            "        android:layout_marginTop=\"30dp\"\n" +
            "        android:textColor=\"#000000\"\n" +
            "        android:textSize=\"30sp\"\n" +
            "        />\n" +
            "\n" +
            "</LinearLayout>";

    public static String textViewXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<LinearLayout xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res-auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    android:orientation=\"vertical\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "\n" +
            "    <TextView\n" +
            "        style=\"@style/Base.TextAppearance.AppCompat.Large\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:text=\"TextView 01\"\n" +
            "        android:textSize=\"30sp\"\n" +
            "        android:textStyle=\"bold\" />\n" +
            "\n" +
            "    <TextView\n" +
            "        style=\"@style/Base.TextAppearance.AppCompat.Large\"\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_marginTop=\"20dp\"\n" +
            "        android:text=\"TextView 02\"\n" +
            "        android:textColor=\"#008577\"\n" +
            "        android:textSize=\"30sp\"\n" +
            "        android:textStyle=\"italic\" />\n" +
            "\n" +
            "    <TextView\n" +
            "        android:layout_width=\"wrap_content\"\n" +
            "        android:layout_height=\"wrap_content\"\n" +
            "        android:layout_marginTop=\"20dp\"\n" +
            "        android:text=\"This is a text view with default color and size\" />\n" +
            "\n" +
            "\n" +
            "</LinearLayout>";

    public static String myAnimationXMl = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<set xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
            "\n" +
            "   <scale xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "      android:fromXScale=\"0.5\"\n" +
            "      android:toXScale=\"3.0\"\n" +
            "      android:fromYScale=\"0.5\"\n" +
            "      android:toYScale=\"3.0\"\n" +
            "      android:duration=\"5000\"\n" +
            "      android:pivotX=\"50%\"\n" +
            "      android:pivotY=\"50%\" >\n" +
            "   </scale>\n" +
            "   \n" +
            "   <scale xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "      android:startOffset=\"5000\"\n" +
            "      android:fromXScale=\"3.0\"\n" +
            "      android:toXScale=\"0.5\"\n" +
            "      android:fromYScale=\"3.0\"\n" +
            "      android:toYScale=\"0.5\"\n" +
            "      android:duration=\"5000\"\n" +
            "      android:pivotX=\"50%\"\n" +
            "      android:pivotY=\"50%\" >\n" +
            "   </scale>\n" +
            "   \n" +
            "</set>";

    public static String clockwiseXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<set xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
            "\n" +
            "   <rotate xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "      android:fromDegrees=\"0\"\n" +
            "      android:toDegrees=\"360\"\n" +
            "      android:pivotX=\"50%\"\n" +
            "      android:pivotY=\"50%\"\n" +
            "      android:duration=\"5000\" >\n" +
            "   </rotate>\n" +
            "   \n" +
            "   <rotate xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "      android:startOffset=\"5000\"\n" +
            "      android:fromDegrees=\"360\"\n" +
            "      android:toDegrees=\"0\"\n" +
            "      android:pivotX=\"50%\"\n" +
            "      android:pivotY=\"50%\"\n" +
            "      android:duration=\"5000\" >\n" +
            "   </rotate>\n" +
            "   \n" +
            "</set>";

    public static String fadeXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<set xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "   android:interpolator=\"@android:anim/accelerate_interpolator\" >\n" +
            "   \n" +
            "   <alpha\n" +
            "      android:fromAlpha=\"0\"\n" +
            "      android:toAlpha=\"1\" \n" +
            "      android:duration=\"2000\" >\n" +
            "   </alpha>\n" +
            "   \n" +
            "   <alpha\n" +
            "      android:startOffset=\"2000\"\n" +
            "      android:fromAlpha=\"1\"\n" +
            "      android:toAlpha=\"0\" \n" +
            "      android:duration=\"2000\" >\n" +
            "   </alpha>   \n" +
            "\n" +
            "</set>";

    public static String blinkXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<set xmlns:android=\"http://schemas.android.com/apk/res/android\">\n" +
            "   <alpha android:fromAlpha=\"0.0\"\n" +
            "      android:toAlpha=\"1.0\"\n" +
            "      android:interpolator=\"@android:anim/accelerate_interpolator\"\n" +
            "      android:duration=\"600\"\n" +
            "      android:repeatMode=\"reverse\"\n" +
            "      android:repeatCount=\"infinite\"/>\n" +
            "</set>";

    public static String moveXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<set\n" +
            "   xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "   android:interpolator=\"@android:anim/linear_interpolator\"\n" +
            "   android:fillAfter=\"true\">\n" +
            "   \n" +
            "   <translate\n" +
            "      android:fromXDelta=\"0%p\"\n" +
            "      android:toXDelta=\"75%p\"\n" +
            "      android:duration=\"800\" />\n" +
            "</set>";

    public static String slideXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<set xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "   android:fillAfter=\"true\" >\n" +
            "   \n" +
            "   <scale\n" +
            "      android:duration=\"500\"\n" +
            "      android:fromXScale=\"1.0\"\n" +
            "      android:fromYScale=\"1.0\"\n" +
            "      android:interpolator=\"@android:anim/linear_interpolator\"\n" +
            "      android:toXScale=\"1.0\"\n" +
            "      android:toYScale=\"0.0\" />\n" +
            "</set>";
}
