package TP9.EJ_5;

import java.util.ArrayList;
import java.util.Comparator;

import TP9.EJ_5.Condiciones.Condicion;

public abstract class Elemento implements Comparable<Elemento> {
    private int DNIDuenio;

    public Elemento(int dNIDuenio) {
        this.DNIDuenio = dNIDuenio;
    }

    public int getDNIDuenio() {
        return DNIDuenio;
    }

    public void setDNIDuenio(int dNIDuenio) {
        DNIDuenio = dNIDuenio;
    }

    public abstract int getNroPoliza();
    public abstract double getMontoAsegurado();
    public abstract ArrayList<Seguro> getSegurosQueCumplenOrdenados(Condicion condicion, Comparator<Elemento> orden);

    @Override
    public int compareTo(Elemento otro) {
        return this.getNroPoliza()-(otro.getNroPoliza()); 
    }
}
