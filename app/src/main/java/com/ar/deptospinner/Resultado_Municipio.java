package com.ar.deptospinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Resultado_Municipio extends AppCompatActivity {


    private AdaptadorMunicipios adaptadorMunicipio;
    private ArrayList<Deptos> datosArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado__municipio);
        setTitle("Datos Municipio");

        datosArrayList = Principal.ListadoDatosMuni;

        //Inicializando el adaptador
        adaptadorMunicipio = new AdaptadorMunicipios(this, datosArrayList);
        ListView ltsDatos = (ListView) findViewById(R.id.ltsMunicipio);
        ltsDatos.setAdapter(adaptadorMunicipio);

        adaptadorMunicipio.notifyDataSetChanged();
    }
}
