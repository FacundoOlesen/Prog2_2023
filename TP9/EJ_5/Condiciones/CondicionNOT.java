package TP9.EJ_5.Condiciones;

import TP9.EJ_5.Seguro;

public class CondicionNOT extends Condicion {

    private Condicion c1;

    public CondicionNOT(Condicion c1) {
        this.c1 = c1;
    }

    @Override
    public boolean cumple(Seguro seg) {
        return !c1.cumple(seg);
    }

}
