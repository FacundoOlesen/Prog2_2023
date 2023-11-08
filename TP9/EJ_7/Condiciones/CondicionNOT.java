package TP9.EJ_7.Condiciones;

import TP9.EJ_7.Elemento;

public class CondicionNOT extends Condicion {

    private Condicion c1;

    public CondicionNOT(Condicion c1) {
        this.c1 = c1;

    }

    @Override
    public boolean cumple(Elemento e) {
        return !c1.cumple(e);
    }

}
