package TP9.EJ_1.Comparadores;

import java.util.Comparator;

import TP9.EJ_1.Socio;

public class ComparadorPorApellido implements Comparator<Socio> {
    @Override
    public int compare(Socio o1, Socio o2) {
        return o1.getApellido().compareTo(o2.getApellido());
    }
}
