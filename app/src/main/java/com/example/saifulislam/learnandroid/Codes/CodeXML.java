package com.example.saifulislam.learnandroid.Codes;

public class CodeXML {
    public static String intentXML = "";
    public static String containerXML = "";
    public static String menuXML = "";
    public static String dateTimeXML = "";
    public static String animationXML = "";
    public static String auodioXML = "";
    public static String videoXML = "";
    public static String cameraXML = "";
    public static String fragmentXML = "";
    public static String mapXML = "";
    public static String sqliteXML = "";
    public static String toastXML = "";


    public static String switchXML = "";
    public static String checkBoxXML = "";
    public static String alertDialogXML = "";
    public static String scrollViewXML = "";
    public static String progressBarXML = "";
    public static String seekBarXML = "";
    public static String radioButtonXML = "";

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
