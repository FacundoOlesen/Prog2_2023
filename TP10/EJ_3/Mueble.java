package TP10.EJ_3;

import java.time.LocalDate;
import java.util.ArrayList;

import TP10.EJ_3.Condiciones.Condicion;

public class Mueble extends Elemento {
    private ArrayList<String> caracteristicas;
    private String material;
    private LocalDate fechaMax;
    private double costo;
    private double precioVenta;

    public Mueble(String material, LocalDate fechaMax, double costo, double precioVenta) {
        this.material = material;
        this.fechaMax = fechaMax;
        this.costo = costo;
        this.precioVenta = precioVenta;
        this.caracteristicas = new ArrayList<>();
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public LocalDate getFechaMax() {
        return fechaMax;
    }

    public void setFechaMax(LocalDate fechaMax) {
        this.fechaMax = fechaMax;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public ArrayList<Mueble> getAceptados(Condicion c) {
        ArrayList<Mueble> resultado = new ArrayList<>();
        if (c.cumple(this))
            resultado.add(this);
        return resultado;
    }
}
