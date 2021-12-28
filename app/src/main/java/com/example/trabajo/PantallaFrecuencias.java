package com.example.trabajo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PantallaFrecuencias extends AppCompatActivity {

    Button altas;
    Button bajas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_frecuencias);

        altas = (Button) findViewById(R.id.boton2);

        altas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent altas = new Intent(PantallaFrecuencias.this, Pantalla_Altas.class);
                startActivity(altas);

            }
        });

        bajas = (Button) findViewById(R.id.boton3);

        bajas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent bajas = new Intent(PantallaFrecuencias.this, Pantalla_Bajas.class);
                startActivity(bajas);

            }
        });
    }
}