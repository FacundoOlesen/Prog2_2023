package TP9.EJ_1.Comparadores;

import java.util.Comparator;

import TP9.EJ_1.Socio;

public class ComparadorTotalAlquileresDeCancha implements Comparator<Socio> {
    private int idCancha;

    public ComparadorTotalAlquileresDeCancha(int idCancha) {
        this.idCancha = idCancha;
    }

    @Override
    public int compare(Socio o1, Socio o2) {
        return o2.contadorAlq(idCancha) - o1.contadorAlq(idCancha);
    }
}
