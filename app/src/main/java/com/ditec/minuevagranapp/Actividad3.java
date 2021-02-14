package com.ditec.minuevagranapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Actividad3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);
    }

    public void miactividad2(View view) {
        startActivity(new Intent(this,MainActivity2.class));
    }

    public void mispinner(View view) {
        startActivity(new Intent(this,MiSpinner.class));
    }

    public void mifragmenttabhost(View view) {
        startActivity(new Intent(this,MiFragmentTabhost.class));
    }

    public void acercade(View view) {
        startActivity(new Intent(this,AcercaDe.class));
    }

    public void midialogo(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Este es mi Dialogo")
                .setTitle("Mi Primer dialogo")
                .setCancelable(false)
                .setNeutralButton("Aceptar", new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    public void salir(View view) {
        finish();
    }

    public void manipulacion(View view) {
        startActivity(new Intent(this,Manipulacion.class));
    }

    public void mirecycler(View view) {
        startActivity(new Intent(this,MiRecyclerView.class));
    }
}