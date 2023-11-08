package TP10.EJ_6.Condiciones;

import TP10.EJ_6.Habitacion;

public class CondicionPorMetros extends Condicion {
    private double mts;

    public CondicionPorMetros(double mts) {
        this.mts = mts;
    }

    @Override
    public boolean cumple(Habitacion hab) {
        return hab.getDimension()>mts;
    }

    
}
