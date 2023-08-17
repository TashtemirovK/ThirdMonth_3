package com.example.thirdmonth_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TastyAdapter extends RecyclerView.Adapter<TastyViewHolder> {
    public TastyAdapter(ArrayList<String> tastyFood) {
        this.tastyFood = tastyFood;
    }

    private ArrayList<String> tastyFood;

    @NonNull
    @Override
    public TastyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TastyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tasty, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull TastyViewHolder holder, int position) {
        holder.bind(tastyFood.get(position));
    }

    @Override
    public int getItemCount() {
        return tastyFood.size();
    }

}
