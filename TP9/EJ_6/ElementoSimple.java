package TP9.EJ_6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

import TP9.EJ_6.Condiciones.Condicion;

public class ElementoSimple extends Elemento {
    private double valor;
    private LocalDate antiguedad;
    private String descripcion;

    public ElementoSimple(int ID, double valor, LocalDate antiguedad, String descripcion) {
        super(ID);
        this.valor = valor;
        this.antiguedad = antiguedad;
        this.descripcion = descripcion;
    }

    @Override
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public LocalDate getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(LocalDate antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public ArrayList<ElementoSimple> getElementosQueCumplenOrdenados(Condicion c, Comparator<Elemento> orden) {
        ArrayList<ElementoSimple> resultado = new ArrayList<>();
        if (c.cumple(this)) {
            resultado.add(this);
        }
        return resultado;
    }
}
