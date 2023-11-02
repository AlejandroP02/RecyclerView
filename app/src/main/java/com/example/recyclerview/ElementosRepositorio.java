package com.example.recyclerview;

import android.net.Uri;

import java.util.ArrayList;
import java.util.List;

public class ElementosRepositorio {

    List<Elemento> elementos = new ArrayList<>();

    interface Callback {
        void cuandoFinalice(List<Elemento> elementos);
    }

    ElementosRepositorio(){
        elementos.add(new Elemento("Nao Tomori", "Nao tiene ojos color zafiro y pelo largo que es plateado y está atado en dos coletas a los lados. Ella se ve a menudo vistiendo su uniforme, que consta de un brazer (camisa) con un lazo amarillo, medias largas negras, botas cafés y una falda plisada marrón ", Uri.parse("android.resource://com.example.recyclerview/"+R.drawable.i1)));
    }

    List<Elemento> obtener() {
        return elementos;
    }

    void insertar(Elemento elemento, Callback callback){
        elementos.add(elemento);
        callback.cuandoFinalice(elementos);
    }

    void eliminar(Elemento elemento, Callback callback) {
        elementos.remove(elemento);
        callback.cuandoFinalice(elementos);
    }

    void actualizar(Elemento elemento, float valoracion, Callback callback) {
        elemento.valoracion = valoracion;
        callback.cuandoFinalice(elementos);
    }
}
