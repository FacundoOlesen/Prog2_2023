package TP10.EJ_5.Condiciones;

import TP10.EJ_5.Elemento;

public class CondicionNOT extends Condicion {
    private Condicion c1;

    public CondicionNOT(Condicion c1) {
        this.c1 = c1;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return !c1.cumple(elemento);
    }

}