package TP9.EJ_6.Condiciones;

import TP9.EJ_6.ElementoSimple;

public class CondicionPorAntiguedad extends Condicion {
    private int antiguedad;

    public CondicionPorAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public boolean cumple(ElementoSimple elemento) {
        return elemento.getAntiguedad()>(antiguedad);
    }
}

