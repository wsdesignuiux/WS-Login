package com.example.vaibhav.k_login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.List_recycle_adapter;
import model.Recycle_model;

public class List_recycleActivity extends AppCompatActivity {
String textrecycle[] = {"1.login-1_wsd","2.login-2_wsd","3.login-3_wsd",
        "4.login-4_wsd","5.login-5_wsd","6.login-6_wsd"};

    RecyclerView recyclerView;
    List_recycle_adapter list_recycle_adapter;
    ArrayList<Recycle_model> recycleModels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_recycle);

        recyclerView= findViewById(R.id.recycle);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(List_recycleActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recycleModels = new ArrayList<>();

        for (int i=0;i < textrecycle.length;i++) {
            Recycle_model ab = new Recycle_model(textrecycle[i]);
            recycleModels.add(ab);
        }

        list_recycle_adapter = new List_recycle_adapter(List_recycleActivity.this,recycleModels);
        recyclerView.setAdapter(list_recycle_adapter);
    }
}
