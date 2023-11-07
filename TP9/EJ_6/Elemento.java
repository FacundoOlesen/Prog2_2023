package TP9.EJ_6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

import TP9.EJ_6.Condiciones.Condicion;

public abstract class Elemento implements Comparable<Elemento> {
    private int ID;

    public Elemento(int iD) {
        this.ID = iD;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public abstract double getValor();
    public abstract LocalDate getAntiguedad();

    public abstract ArrayList<ElementoSimple> getElementosQueCumplenOrdenados(Condicion condicion, Comparator<Elemento> orden);
    @Override
    public int compareTo(Elemento otro) {
        return this.getID() - (otro.getID()); //Si da 0, comparo por antiguedad ... ¿Esta bienque esto este aca abstraido?
    }
}
