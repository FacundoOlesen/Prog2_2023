package TP9.EJ_2;

import java.util.ArrayList;
import java.util.Comparator;

import TP9.EJ_2.Condiciones.Condicion;

public class Archivo extends Elemento {
    private double tamanio;

    public Archivo(String nombre, double tamanio) {
        super(nombre);
        this.tamanio = tamanio;
    }

    @Override
    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public ArrayList<Archivo> getArchivosQueCumplenOrdenados(Condicion c, Comparator<Elemento> orden) {
        ArrayList<Archivo> resultado = new ArrayList<>();
        if (c.cumple(this)) {
            resultado.add(this);
        }
        return resultado;
    }

}
