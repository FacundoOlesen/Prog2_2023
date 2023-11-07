package TP9.EJ_5.Condiciones;

import TP9.EJ_5.Seguro;

public class CondicionPorMonto extends Condicion {
    private double monto;

    public CondicionPorMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public boolean cumple(Seguro seguro) {
        return seguro.getMonto() > this.monto;
    }

}
