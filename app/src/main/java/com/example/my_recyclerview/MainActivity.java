package com.example.my_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=findViewById(R.id.recyclerview);
        List<Item> items =new ArrayList<>();
        items.add(new Item("Pepa","pepa@gmail.com",R.drawable.icono1));
        items.add(new Item("Yassin","yassin@gmail.com",R.drawable.icono2));
        items.add(new Item("Marcos","marcos@gmail.com",R.drawable.icono3));
        items.add(new Item("Laura","laura@gmail.com",R.drawable.icono4));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapterJava(getApplicationContext(),items));

    }

}