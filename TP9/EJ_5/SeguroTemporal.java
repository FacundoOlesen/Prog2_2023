package TP9.EJ_5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

import TP9.EJ_5.Condiciones.Condicion;

public class SeguroTemporal extends Elemento {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Elemento elemento;

    public SeguroTemporal(int DNIDuenio, LocalDate fechaInicio,
            LocalDate fechaFin) {
        super(DNIDuenio);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;

    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public double getMontoAsegurado() {
        return elemento.getMontoAsegurado();
    }

    

    @Override
    public int getNroPoliza() {
        return elemento.getNroPoliza();
    }

    @Override
    public ArrayList<Seguro> getSegurosQueCumplenOrdenados(Condicion c, Comparator<Seguro> orden) {
       return elemento.getSegurosQueCumplenOrdenados(c, orden);
    }
}
