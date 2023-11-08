package Examenes.Parcial2023;

import Examenes.Parcial2023.Condiciones.Condicion;

public class PiezaDisenio extends PiezaCompuesta {

    private Condicion c;

    public PiezaDisenio(String nombre, String descripcion, int cantPLA, int tiempoEstimado, Condicion c) {
        super(nombre, descripcion, cantPLA, tiempoEstimado);
        this.c = c;
    }

    public void addElemento(PiezaDisenio p) {
        if (c.cumple(p))
            super.addPieza(p);
    }

}
