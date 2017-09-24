package com.ar.deptospinner;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Resultado_Departamento extends AppCompatActivity {

    private AdaptadorDatos adaptadorDatos;
    private ArrayList<Deptos> datosArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado__departamento);
        setTitle("Datos Departamentos");

        datosArrayList = Principal.ListadoDatosDepto;

        //Inicializando el adaptador
        adaptadorDatos = new AdaptadorDatos(this,  datosArrayList);
        ListView ltsDatos = (ListView) findViewById(R.id.ltsDepartamento);
        ltsDatos.setAdapter(adaptadorDatos);
        adaptadorDatos.notifyDataSetChanged();
    }
}
