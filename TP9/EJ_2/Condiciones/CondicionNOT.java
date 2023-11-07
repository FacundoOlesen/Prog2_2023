package TP9.EJ_2.Condiciones;

import TP9.EJ_2.Archivo;

public class CondicionNOT extends Condicion {
    Condicion f1;

    public CondicionNOT(Condicion f1) {
        this.f1 = f1;
    }

    @Override
    public boolean cumple(Archivo archivo) {
        return !f1.cumple(archivo);
    }
}