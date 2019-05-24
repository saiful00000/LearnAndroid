package com.example.saifulislam.learnandroid.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.saifulislam.learnandroid.DetailsFragment;
import com.example.saifulislam.learnandroid.R;


public class ListFragment extends Fragment {

    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_list, container, false);
        listView = view.findViewById(R.id.list_view_id);
        final String[] list = {"Dhaka","Barcelona","New York","Toronto","Goa","London","Paris","Istambul","Tehran","Madrid"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                DetailsFragment.setTextViewText(list[position]);
                listView.setSelector(R.color.button_color);
            }
        });

        return view;
    }
}
