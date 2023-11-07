package TP9.EJ_2;

import java.util.ArrayList;
import java.util.Comparator;

import TP9.EJ_2.Condiciones.Condicion;

public  class AccesoDirecto extends Elemento {
    private static final double TAMANIO = 1;
    private static final String PREFIJO = "Acceso directo a: ";
    private Elemento loQueApunta;

    public AccesoDirecto(Elemento loQueApunta) {
        super(PREFIJO + loQueApunta.getNombre());
        this.loQueApunta = loQueApunta;
    }

    public String getNombre() {
        return PREFIJO + loQueApunta.getNombre();
    }

    @Override
    public double getTamanio() {
        return TAMANIO;
    }

    @Override
    public ArrayList<Archivo> getArchivosQueCumplenOrdenados(Condicion c, Comparator<Elemento> orden) {
        return loQueApunta.getArchivosQueCumplenOrdenados(c, orden);
    }

    

}
