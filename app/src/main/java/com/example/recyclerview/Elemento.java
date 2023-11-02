package com.example.recyclerview;

import android.net.Uri;
import android.widget.ImageView;

public class Elemento {
    String nombre;
    String descripcion;
    float valoracion;
    Uri imagen;

    public Elemento(String nombre, String descripcion, Uri imagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }
}
