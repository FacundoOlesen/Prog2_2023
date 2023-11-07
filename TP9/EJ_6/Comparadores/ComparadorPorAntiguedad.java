package TP9.EJ_6.Comparadores;

import java.util.Comparator;

import TP9.EJ_6.Elemento;


public class ComparadorPorAntiguedad implements Comparator<Elemento> {
    @Override
    public int compare(Elemento o1, Elemento o2) {
        return (o1.getAntiguedad().compareTo(o2.getAntiguedad()));

    }
}