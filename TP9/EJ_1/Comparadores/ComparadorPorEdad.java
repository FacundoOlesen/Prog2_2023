package TP9.EJ_1.Comparadores;

import java.util.Comparator;
import TP9.EJ_1.Socio;

public class ComparadorPorEdad implements Comparator<Socio> {
    @Override
    public int compare(Socio o1, Socio o2) {
        return Integer.compare(o1.getEdad(), o2.getEdad());

    }
}
