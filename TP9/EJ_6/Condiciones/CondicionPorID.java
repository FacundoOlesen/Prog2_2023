package TP9.EJ_6.Condiciones;

import TP9.EJ_6.ElementoSimple;

public class CondicionPorID extends Condicion {
    private int ID;

    public CondicionPorID(int ID) {
        this.ID = ID;
    }

    @Override
    public boolean cumple(ElementoSimple elemento) {
        return elemento.getID()==ID;
    }
}

