package TP9.EJ_5.Condiciones;

import TP9.EJ_5.Seguro;

public class CondicionPorDNI extends Condicion {
    private int DNI;

    public CondicionPorDNI(int DNI) {
        this.DNI = DNI;
    }

    @Override
    public boolean cumple(Seguro seguro) {
        return seguro.getDNIDuenio() == this.DNI;
    }

}