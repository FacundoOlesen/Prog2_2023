package TP9.EJ_2.Comparadores;

import TP9.EJ_2.Elemento;

import java.util.Comparator;


public class ComparadorTamanio implements Comparator<Elemento> {
    @Override
    public int compare(Elemento o1, Elemento o2) {
        return Double.compare(o1.getTamanio(), o2.getTamanio());

    }
}
