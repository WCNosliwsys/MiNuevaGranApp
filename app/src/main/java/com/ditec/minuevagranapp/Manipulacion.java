package com.ditec.minuevagranapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Manipulacion extends AppCompatActivity {

    EditText edtnombre;
    EditText edtmonto;
    Button btncambiar;
    TextView txtResultado;
    int centinela=0;
    Button btnvisibilidad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manipulacion);
        edtnombre=findViewById(R.id.edtnombre);
        edtmonto=findViewById(R.id.edtmonto);
        btncambiar=findViewById(R.id.btncambiar);
        txtResultado=findViewById(R.id.txtResultado);
        btnvisibilidad=findViewById(R.id.btnver);
        btncambiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double resultado;
                resultado=Double.parseDouble(edtmonto.getText().toString())*3.5;
                txtResultado.setText(edtnombre.getText().toString()+" El valor de "+edtmonto.getText().toString()+
                        " soles es equivalente a "+resultado+" dolares");
            }
        });
    }

    public void visibilidad(View view) {
        Log.i("milogwil",String.valueOf(centinela));
        if(centinela==0)
        {
            btncambiar.setVisibility(View.INVISIBLE);
            centinela=1;
            btnvisibilidad.setText("Mostrar");
        }
        else{
            btncambiar.setVisibility(View.VISIBLE);
            centinela=0;
            btnvisibilidad.setText("Ocultar");
        }
    }
}