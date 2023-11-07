package TP9.EJ_5;

import java.util.ArrayList;
import java.util.Comparator;

import TP9.EJ_5.Condiciones.Condicion;

public class Seguro extends Elemento {

    private CalculadorDeCosto calculadorDeCosto;
    private double monto;
    private int nroPoliza;
    private String descripcion;
    public Seguro(int dNIDuenio, int nroPoliza, String descripcion, double monto,
            CalculadorDeCosto calculadorDeCosto) {
        super(dNIDuenio);
        this.calculadorDeCosto=calculadorDeCosto;
        this.monto=monto;
        this.nroPoliza=nroPoliza;
        this.descripcion=descripcion;
    }

    @Override
    public double getMontoAsegurado() {
        return getCalculadorDeCosto().calcularCosto(this);
    }

    @Override
    public ArrayList<Seguro> getSegurosQueCumplenOrdenados(Condicion c, Comparator<Elemento> orden) {
        ArrayList<Seguro> resultado = new ArrayList<>();
        if (c.cumple(this)) {
            resultado.add(this);
        }
        return resultado;
    }

    public CalculadorDeCosto getCalculadorDeCosto() {
        return calculadorDeCosto;
    }

    public void setCalculadorDeCosto(CalculadorDeCosto calculadorDeCosto) {
        this.calculadorDeCosto = calculadorDeCosto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
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


    
}
