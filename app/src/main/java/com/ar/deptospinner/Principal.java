package com.ar.deptospinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Principal extends AppCompatActivity {
    private Button btnDepto,btnMunnicipio;
    public static ArrayList<Deptos> ListadoDatosMuni;
    public static ArrayList<Deptos> ListadoDatosDepto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        setTitle("Administracion Deptos/Municipios");


        btnDepto = (Button) findViewById(R.id.btnDepartamentos);
        btnMunnicipio = (Button) findViewById(R.id.btnmunicipios);
        ListadoDatosDepto = new ArrayList<Deptos>();
        ListadoDatosMuni = new ArrayList<Deptos>();

        btnDepto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Principal.this, Departamentos.class);
                startActivity(intent);
            }
        });
        btnMunnicipio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Principal.this, Municipio.class);
                startActivity(intent);
            }
        });
    }
}
