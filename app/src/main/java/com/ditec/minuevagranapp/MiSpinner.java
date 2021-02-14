package com.ditec.minuevagranapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MiSpinner extends AppCompatActivity {

    Spinner mispinner;
    EditText edtvalor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_spinner);
        mispinner=findViewById(R.id.spAnimals);
        edtvalor=findViewById(R.id.etDescription);
        List<String> categorias = new ArrayList<String>();
        categorias.add("Auto");
        categorias.add("Refrigerador");
        categorias.add("Laptop");
        categorias.add("Televisor");
        categorias.add("Licuadora");
        categorias.add("Computadora");
        ArrayAdapter<String> Adaptador = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,categorias);
        mispinner.setAdapter(Adaptador);

        mispinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(edtvalor.getText().length()>0)
                    edtvalor.setText(edtvalor.getText()+" ,"+mispinner.getSelectedItem());
                else
                    edtvalor.setText(mispinner.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}