package com.example.saifulislam.learnandroid.Codes;

public class CodeXML {
    public static String intentXML = "";
    public static String containerXML = "";
    public static String menuXML = "";
    public static String dateTimeXML = "";
    public static String animationXML = "";
    public static String videoXML = "";
    public static String cameraXML = "";
    public static String fragmentXML = "";
    public static String mapXML = "";
    public static String sqliteXML = "";

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
}
