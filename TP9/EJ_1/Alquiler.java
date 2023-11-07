package TP9.EJ_1;

import java.time.LocalDate;

public class Alquiler {
    private LocalDate fecha;
    private int IDcancha;
    private double precio;

    public Alquiler(int iDcancha, double precio) {
        this.fecha = LocalDate.now();
        IDcancha = iDcancha;
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getIDcancha() {
        return IDcancha;
    }

    public void setIDcancha(int iDcancha) {
        IDcancha = iDcancha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        try {
            Alquiler otro = (Alquiler) o;
            return this.getFecha().equals(otro.getFecha()) &&
                    this.getIDcancha() == (otro.getIDcancha())
                    &&this.getPrecio()==(otro.getPrecio());
        } catch (Exception e) {
            return false;
        }
    }
}
