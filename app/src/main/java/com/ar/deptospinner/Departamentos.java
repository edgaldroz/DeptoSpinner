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

public class Departamentos extends AppCompatActivity {

    //public static ArrayList<Deptos> ListadoDatosDepto;

    private EditText txtNombreDepartamento, txtNombreCabecera;
    private Button btnAgregar;

    private String[] Pais = new String[]{"El Salvador","Honduras"};
    private Spinner cmbxPais;

    private ArrayAdapter<String> adapta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departamentos);
        setTitle("Departamentos");

        txtNombreDepartamento = (EditText) findViewById(R.id.txtNomDepartamento);
        txtNombreCabecera = (EditText) findViewById(R.id.txtNomCabecera);

        this.cmbxPais = (Spinner) findViewById(R.id.cmbxPais);

        btnAgregar = (Button) findViewById(R.id.btnAgregar);
        //Principal.ListadoDatosDepto = new ArrayList<Deptos>();

        this.adapta = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                this.Pais);
        this.cmbxPais.setAdapter(this.adapta);

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                if (txtNombreDepartamento.getText().toString().length()!=0 && txtNombreCabecera.getText().toString().length()!=0 && cmbxPais!=null){
                Deptos dept = new Deptos();
                dept.Nombre = txtNombreDepartamento.getText().toString();
                dept.Pais = cmbxPais.getSelectedItem().toString();
                dept.Descripcion =  txtNombreCabecera.getText().toString();

                Intent data = new Intent(Departamentos.this, Resultado_Departamento.class);
                Principal.ListadoDatosDepto.add(dept);
                startActivity(data);
                }else {
                    Toast.makeText(Departamentos.this,"Campos vacios.!",Toast.LENGTH_SHORT).show();
                }
            }

        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        txtNombreCabecera.setText("");
        txtNombreDepartamento.setText("");
        txtNombreDepartamento.requestFocus();
    }
}
