package TP10.EJ_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import TP10.EJ_6.Condiciones.Condicion;

public class Grupo extends Elemento {
    private ArrayList<Elemento> elementos;
    private Comparator<Habitacion> orden;

    public Grupo(Comparator<Habitacion> orden) {
        this.orden = orden;
        this.elementos = new ArrayList<>();
    }

    public Comparator<Habitacion> getOrden() {
        return orden;
    }

    public void setOrden(Comparator<Habitacion> orden) {
        this.orden = orden;
    }

    public void addElemento(Elemento e) {
        this.elementos.add(e);
    }

    @Override
    public int getCantHabsSegunCriterio() {
        int cant = 0;
        for (int i = 0; i < elementos.size(); i++)
            cant += elementos.get(i).getCantHabsSegunCriterio();
        return cant;
    }

    @Override
    public double getDimension() {
        double dimension = 0;
        for (int i = 0; i < elementos.size(); i++)
            dimension += elementos.get(i).getDimension();
        return dimension;
    }

    @Override
    public ArrayList<Habitacion> buscar(Condicion c) {
        ArrayList<Habitacion> resultado = new ArrayList<>();
        for (int i = 0; i < elementos.size(); i++)
            resultado.addAll(elementos.get(i).buscar(c));
        Collections.sort(resultado, orden);
        return resultado;
    }
}
