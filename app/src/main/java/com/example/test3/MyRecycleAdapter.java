package com.example.test3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class MyRecycleAdapter extends RecyclerView.Adapter<MyRecycleAdapter.MyRecycleViewHolder> {


    @NonNull
    @Override
    public MyRecycleAdapter.MyRecycleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecycleAdapter.MyRecycleViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyRecycleViewHolder extends RecyclerView.ViewHolder{

        public MyRecycleViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
