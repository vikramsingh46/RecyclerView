package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.recyclerview.adapter.Adapter;
import com.example.recyclerview.model.Model;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       recyclerView= findViewById(R.id.recyclerView);
        ArrayList<Model> list = new ArrayList<>();

        list.add(new Model(R.drawable.maldives,"Maldives"));


        Adapter adapter = new Adapter(list, this);
        recyclerView.setAdapter(adapter );

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}