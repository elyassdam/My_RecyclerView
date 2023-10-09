package com.example.my_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapterJava extends RecyclerView.Adapter<MyViewHolder> {
    //Dose estamos
    Context context;// Contexto
    List<Item> items;//Lista de elemntos que tengo

    public MyAdapterJava(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
           return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }
//Posicion que estoy pinchando
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position){
        holder.imageView.setImageResource(items.get(position).getImage());
        holder.nameView.setText(items.get(position).getNombre());
        holder.emailView.setText(items.get(position).getEmail());
    }

        @Override
    public int getItemCount() {
        return items.size();
    }
}
