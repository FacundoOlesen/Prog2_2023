package TP9.EJ_6.Comparadores;

import java.util.Comparator;

import TP9.EJ_6.Elemento;


public class ComparadorPorAntiguedad implements Comparator<Elemento> {
    @Override
    public int compare(Elemento o1, Elemento o2) {
        return Integer.compare(o1.getAntiguedad(), o2.getAntiguedad());

    }
}