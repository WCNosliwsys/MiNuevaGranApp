package com.ditec.minuevagranapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.Vector;

public class MiRecyclerView extends AppCompatActivity implements InterfaceToast {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    MiAdaptador adaptador;
    Vector<String> misdatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_recycler_view);
        recyclerView = findViewById(R.id.mirecycler);
        misdatos = new Vector<String>();
        misdatos.add("Wilson Callisaya");
        misdatos.add("Alex Callisaya");
        misdatos.add("Wilson Callisaya");
        misdatos.add("Miguel Callisaya");
        misdatos.add("Wilson Mamani");
        misdatos.add("Hector Callisaya");
        misdatos.add("Wilson Callisaya");
        misdatos.add("Moises Choque");
        misdatos.add("Wilson Callisaya");
        misdatos.add("Wilson Mamani");
        misdatos.add("Wilson Callisaya");
        adaptador=new MiAdaptador(this,misdatos);
        recyclerView.setAdapter(adaptador);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

    }

    @Override
    public void mensaje(String mimensaje) {
        Toast.makeText(this, mimensaje, Toast.LENGTH_LONG).show();
    }
}