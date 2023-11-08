package TP10.EJ_4;

import java.time.LocalDate;

public class Caracteristica extends Elemento {
    private String descripcion;
    private double monto;

    public Caracteristica(String descripcion, double monto) {
        this.descripcion = descripcion;
        this.monto = monto;
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
}
