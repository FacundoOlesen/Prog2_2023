package Examenes.Parcial2023;

import java.util.ArrayList;

import Examenes.Parcial2023.Condiciones.Condicion;

public class PiezaExclusiva extends PiezaSimple {

    private int costoExtra;

    public PiezaExclusiva(String nombre, String descripcion, String color, int tiempo, int pla) {
        super(nombre, descripcion, color, tiempo, pla);
    }

    public ArrayList<Pieza> buscar(Condicion cond) {
        return new ArrayList<Pieza>();
    }

    public int getCosto() {
        return super.getCosto() + costoExtra;
    }

    public int getCostoExtra() {
        return costoExtra;
    }

    public void setCostoExtra(int costoExtra) {
        this.costoExtra = costoExtra;
    }

}
