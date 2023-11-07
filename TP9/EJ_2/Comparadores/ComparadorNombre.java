package TP9.EJ_2.Comparadores;


import java.util.Comparator;

import TP9.EJ_2.Elemento;

public class ComparadorNombre implements Comparator<Elemento> {
    @Override
    public int compare(Elemento o1, Elemento o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
