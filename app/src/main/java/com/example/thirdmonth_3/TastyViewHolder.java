package com.example.thirdmonth_3;

import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TastyViewHolder extends RecyclerView.ViewHolder {

    private TextView tvTitle;


    public TastyViewHolder(@NonNull View itemView) {
        super(itemView);
        tvTitle = itemView.findViewById(R.id.tv_title);
    }
    public void bind (String tasty) {
        tvTitle.setText(tasty);
    }
}
