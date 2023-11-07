package TP9.EJ_5.Comparadores;

import java.util.Comparator;

import TP9.EJ_5.Elemento;

public class ComparadorPorDNI implements Comparator<Elemento> {
    @Override
    public int compare(Elemento o1, Elemento o2) {
        return Double.compare(o1.getDNIDuenio(), o2.getDNIDuenio());

    }
}

