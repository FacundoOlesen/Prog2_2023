package TP10.EJ_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import TP10.EJ_3.Condiciones.Condicion;

public class Fabrica extends Elemento {
    private ArrayList<Elemento> elementos;
    private Comparator<Mueble> orden;

    public Fabrica(Comparator<Mueble> orden) {
        this.elementos = new ArrayList<>();
    }

    public void addElemento(Elemento e){
        this.elementos.add(e);
    }

    public Comparator<Mueble> getOrden() {
        return orden;
    }

    public void setOrden(Comparator<Mueble> orden) {
        this.orden = orden;
    }

    @Override
    public ArrayList<Mueble> getAceptados(Condicion c) {
        ArrayList<Mueble> resultado = new ArrayList<>();
        for (int i = 0; i < elementos.size(); i++)
            resultado.addAll(elementos.get(i).getAceptados(c));
        Collections.sort(resultado, orden);
        return resultado;
    }


}