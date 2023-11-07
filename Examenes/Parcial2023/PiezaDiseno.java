package Examenes.Parcial2023;

import Examenes.Parcial2023.Condiciones.Condicion;

public class PiezaDiseno extends PiezaCompuesta {

    private Condicion cond;

    public PiezaDiseno(Condicion cond, String nom, String des, int extraPla, int extraTiempo) {
        super(nom, des, extraPla, extraTiempo);
        this.cond = cond;
    }

    public void addElemento(Pieza pieza) {
        if (cond.cumple(pieza)) {
            super.addPieza(pieza);
        }
    }
}