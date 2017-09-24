package com.ar.deptospinner;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Adalberto on 23/09/2017.
 */

public class AdaptadorMunicipios extends ArrayAdapter<Deptos> {
    public AdaptadorMunicipios(Context context, List<Deptos> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Deptos datos = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_datos_municipio, parent, false);
        }
        TextView lblNombre = (TextView) convertView.findViewById(R.id.lblNombre2);
        TextView lblPais = (TextView) convertView.findViewById(R.id.lblPais2);
        TextView lblApartamento = (TextView) convertView.findViewById(R.id.lblDescripcion2);

        // mostrar los datos
        lblNombre.setText(datos.Nombre);
        lblPais.setText(datos.Pais);
        lblApartamento.setText(datos.Descripcion);

        return convertView;
    }
}