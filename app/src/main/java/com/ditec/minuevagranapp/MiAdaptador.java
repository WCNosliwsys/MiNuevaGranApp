package com.ditec.minuevagranapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Vector;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.ViewHolder> {

    LayoutInflater inflador;
    Vector<String> lista;
    Context context;
    public MiAdaptador(Context context, Vector<String> lista) {
        this.lista=lista;
        this.context=context;
        inflador=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v =inflador.inflate(R.layout.miitem,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.titulo.setText(lista.get(position));
        holder.miboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((InterfaceToast)context).mensaje("El item pulsado es "+lista.get(position));
            }
        });
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((InterfaceToast)context).mensaje("El item pulsado sin el boton es "+lista.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView titulo, subtitulo;
        ImageView icon;
        Button miboton;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo=itemView.findViewById(R.id.mititulo);
            subtitulo=itemView.findViewById(R.id.misubtitulo);
            miboton = itemView.findViewById(R.id.miboton);
        }
    }
}
