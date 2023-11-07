package TP9.EJ_5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import TP9.EJ_5.Condiciones.Condicion;

public class SeguroTemporal extends Elemento {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private ArrayList<Elemento> elementos;

    public SeguroTemporal(int dNIDuenio, int nroPoliza, String descripcion, double monto, LocalDate fechaInicio,
            LocalDate fechaFin,
            CalculadorDeCosto calculador) {
        super(dNIDuenio, nroPoliza, descripcion, monto, calculador);
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.elementos= new ArrayList<>();
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

    public void addElemento(Elemento e) {
        this.elementos.add(e);
    }

    @Override
    public double calcularCosto() {
        double cont = 0;
        for (int i = 0; i < elementos.size(); i++) {
            if (LocalDate.now().isAfter(fechaInicio)&&LocalDate.now().isBefore(fechaFin))
                cont += elementos.get(i).calcularCosto();
        }
        return cont;
    }

    @Override
    public ArrayList<Seguro> getSegurosQueCumplenOrdenados(Condicion c, Comparator<Elemento> orden) {
        ArrayList<Seguro> resultado = new ArrayList<>();
        for (int i = 0; i < elementos.size(); i++) {
            resultado.addAll(this.elementos.get(i).getSegurosQueCumplenOrdenados(c, orden));
        }
        if (orden != null)
            Collections.sort(resultado, orden);
        else
            Collections.sort(resultado);
        return resultado;
    }
}
