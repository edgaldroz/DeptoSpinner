package com.ar.deptospinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Municipio extends AppCompatActivity {

    //public static ArrayList<Deptos> ListadoDatosMuni;

    private EditText txtNombreMunicipio, txtNombreApartamento;
    private Button btnAgregar;

    private String[] Pais = new String[]{"El Salvador", "Honduras"};
    private Spinner cmbxPais;

    private ArrayAdapter<String> adapta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_municipio);
        setTitle("Municipio");

        txtNombreMunicipio = (EditText) findViewById(R.id.txtNomMunicipio);
        txtNombreApartamento = (EditText) findViewById(R.id.txtDepartamento);

        this.cmbxPais = (Spinner) findViewById(R.id.cmbxPais);

        btnAgregar = (Button) findViewById(R.id.btnAgregar);
        //Principal.ListadoDatosMuni = new ArrayList<Deptos>();

        this.adapta = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                this.Pais);

        this.cmbxPais.setAdapter(this.adapta);
        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

            if (txtNombreMunicipio.getText().toString().length()!=0 && txtNombreApartamento.getText().toString().length()!=0 && cmbxPais!=null){
                Deptos dept = new Deptos();
                dept.Nombre = txtNombreMunicipio.getText().toString();
                dept.Pais = cmbxPais.getSelectedItem().toString();
                dept.Descripcion = txtNombreApartamento.getText().toString();

                Intent data = new Intent(Municipio.this, Resultado_Municipio.class);
                Principal.ListadoDatosMuni.add(dept);
                startActivity(data);

            }else {
                Toast.makeText(Municipio.this,"Campos vacios.!",Toast.LENGTH_SHORT).show();
            }
            }
        });

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        txtNombreMunicipio.setText("");
        txtNombreApartamento.setText("");
        txtNombreMunicipio.requestFocus();
    }
}
