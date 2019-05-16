package com.example.saifulislam.learnandroid.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.saifulislam.learnandroid.R;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecycleVIewHolder> {

    private String[] data;

    public RecyclerAdapter(String[] data) {
        this.data = data;
    }

    @NonNull
    @Override
    public RecycleVIewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.recyclerview_content, viewGroup, false);

        return new RecycleVIewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleVIewHolder recycleVIewHolder, int i) {
        String string = data[i];
        recycleVIewHolder.textView.setText(string);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class RecycleVIewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public RecycleVIewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.tv_id);
        }
    }

}
