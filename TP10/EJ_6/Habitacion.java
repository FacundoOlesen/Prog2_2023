package TP10.EJ_6;

import java.time.LocalDate;
import java.util.ArrayList;

import TP10.EJ_6.Condiciones.Condicion;

public class Habitacion extends Elemento {
    private ArrayList<String> comodidades;
    private double metrosCuadrados;
    private int cantCamas;
    private LocalDate fechaUltOcupacion;
    private boolean aceptaMascotas;
    private Condicion cond;

    public Habitacion(double metrosCuadrados, int cantCamas, LocalDate fechaUltOcupacion, boolean aceptaMascotas,
            Condicion cond) {
        this.metrosCuadrados = metrosCuadrados;
        this.cantCamas = cantCamas;
        this.fechaUltOcupacion = fechaUltOcupacion;
        this.aceptaMascotas = aceptaMascotas;
        this.cond = cond;
        this.comodidades = new ArrayList<>();
    }

    public Condicion getCond() {
        return cond;
    }

    public void setCond(Condicion cond) {
        this.cond = cond;
    }

    public double getDimension() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public LocalDate getFechaUltOcupacion() {
        return fechaUltOcupacion;
    }

    public void setFechaUltOcupacion(LocalDate fechaUltOcupacion) {
        this.fechaUltOcupacion = fechaUltOcupacion;
    }

    public boolean isAceptaMascotas() {
        return aceptaMascotas;
    }

    public void setAceptaMascotas(boolean aceptaMascotas) {
        this.aceptaMascotas = aceptaMascotas;
    }

    public void addComodidad(String c) {
        this.comodidades.add(c);
    }

    public ArrayList<String> getComodidades() {
        return new ArrayList<>(this.comodidades);
    }

    public boolean estaDisponible() {
        return cond.cumple(this);
    }

    @Override
    public int getCantHabsSegunCriterio() {
        if (this.estaDisponible())
            return 1;
        return 0;
    }

    @Override
    public ArrayList<Habitacion> buscar(Condicion c) {
        ArrayList<Habitacion> resultado = new ArrayList<>();
        if (c.cumple(this))
            resultado.add(this);
        return resultado;
    }

}
