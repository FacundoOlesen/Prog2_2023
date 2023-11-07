package Examenes.Parcial2023.Condiciones;

import Examenes.Parcial2023.Pieza;

public class CondicionNOT extends Condicion {

    private Condicion c1;

    public CondicionNOT(Condicion c1) {
        this.c1 = c1;
    }

    @Override
    public boolean cumple(Pieza pieza) {
        return !c1.cumple(pieza);
    }

}

