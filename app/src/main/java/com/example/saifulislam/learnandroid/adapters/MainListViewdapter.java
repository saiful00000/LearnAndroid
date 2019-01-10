package com.example.saifulislam.learnandroid.adapters;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.saifulislam.learnandroid.R;

public class MainListViewdapter extends BaseAdapter {

    private Context context;
    private String[] contents;
    private int[] icons;

    LayoutInflater layoutInflater;

    public MainListViewdapter(Context context, String[] contents, int[] icons) {
        this.context = context;
        this.contents = contents;
        this.icons = icons;
    }

    @Override
    public int getCount() {
        return contents.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.custom_list_view, parent, false);
            TextView textView = convertView.findViewById(R.id.customListTextId);
            ImageView imageView = convertView.findViewById(R.id.customListImageId);
            textView.setText(contents[position]);
            imageView.setImageResource(icons[position]);
        }
        return convertView;
    }
}
