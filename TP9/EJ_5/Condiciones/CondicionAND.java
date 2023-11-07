package TP9.EJ_5.Condiciones;

import TP9.EJ_5.Seguro;

public class CondicionAND extends Condicion {

    private Condicion c1;
    private Condicion c2;

    public CondicionAND(Condicion c1,
            Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Seguro seg) {
        return c1.cumple(seg) &&
                c2.cumple(seg);
    }

}
