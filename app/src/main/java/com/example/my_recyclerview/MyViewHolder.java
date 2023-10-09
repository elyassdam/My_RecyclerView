package com.example.my_recyclerview;

import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView nameView, emailView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView= itemView.findViewById(R.id.imagenview);
        nameView= itemView.findViewById(R.id.name);
        emailView=itemView.findViewById(R.id.email);



    }
}
