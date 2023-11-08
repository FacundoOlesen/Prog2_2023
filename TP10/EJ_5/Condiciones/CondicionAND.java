package TP10.EJ_5.Condiciones;

import TP10.EJ_5.Elemento;

public class CondicionAND extends Condicion {
    private Condicion c1, c2;

    public CondicionAND(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return c1.cumple(elemento) && c2.cumple(elemento);
    }

}
