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

public class AdaptadorDatos extends ArrayAdapter<Deptos> {
    public AdaptadorDatos(Context context, List<Deptos> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Deptos datos = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_datos_depto, parent, false);
        }
        TextView lblNombre = (TextView) convertView.findViewById(R.id.lblNombre);
        TextView lblPais = (TextView) convertView.findViewById(R.id.lblPais);
        TextView lblDescripcion = (TextView) convertView.findViewById(R.id.lblDescripcion);

        // mostrar los datos
        lblNombre.setText(datos.Nombre);
        lblPais.setText(datos.Pais);
        lblDescripcion.setText(datos.Descripcion);

        return convertView;
    }
}