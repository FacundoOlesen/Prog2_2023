package TP10.EJ_6;

import java.util.ArrayList;

import TP10.EJ_6.Condiciones.Condicion;

public abstract class Elemento {
    public abstract int getCantHabsSegunCriterio();
    public abstract double getDimension();
    public abstract ArrayList<Habitacion> buscar(Condicion c);
}
