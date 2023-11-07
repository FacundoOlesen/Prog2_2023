package Examenes.Parcial2023.Condiciones;

import Examenes.Parcial2023.Pieza;

public class CondicionAND extends Condicion {

    private Condicion c1;
    private Condicion c2;

    public CondicionAND(Condicion c1,
            Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Pieza pieza) {
        return c1.cumple(pieza) &&
                c2.cumple(pieza);
    }

}
