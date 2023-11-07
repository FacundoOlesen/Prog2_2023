package TP9.EJ_5;

import java.util.ArrayList;
import java.util.Comparator;

import TP9.EJ_5.Condiciones.Condicion;

public abstract class Elemento implements Comparable<Elemento> {
    private int DNIDuenio;
    private int nroPoliza;
    private String descripcion;
    private double monto;
    private CalculadorDeCosto calculador;

    public Elemento(int dNIDuenio, int nroPoliza, String descripcion, double monto,
            CalculadorDeCosto calculador) {
        this.DNIDuenio = dNIDuenio;
        this.nroPoliza = nroPoliza;
        this.descripcion = descripcion;
        this.monto = monto;
        this.calculador = calculador;
    }

    public int getDNIDuenio() {
        return DNIDuenio;
    }

    public void setDNIDuenio(int dNIDuenio) {
        DNIDuenio = dNIDuenio;
    }

    public int getNroPoliza() {
        return nroPoliza;
    }

    public void setNroPoliza(int nroPoliza) {
        this.nroPoliza = nroPoliza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public CalculadorDeCosto getCalculador() {
        return calculador;
    }

    public void setCalculador(CalculadorDeCosto calculador) {
        this.calculador = calculador;
    }

    public abstract double calcularCosto();
    public abstract ArrayList<Seguro> getSegurosQueCumplenOrdenados(Condicion condicion, Comparator<Elemento> orden);

    @Override
    public int compareTo(Elemento otro) {
        return this.getNroPoliza()-(otro.getNroPoliza());
    }
}
