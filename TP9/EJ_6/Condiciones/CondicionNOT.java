package TP9.EJ_6.Condiciones;

import TP9.EJ_6.ElementoSimple;

public class CondicionNOT extends Condicion {

    private Condicion c1;

    public CondicionNOT(Condicion c1) {
        this.c1 = c1;
    }

    @Override
    public boolean cumple(ElementoSimple e) {
        return !c1.cumple(e);
    }

}
