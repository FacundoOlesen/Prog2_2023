package TP9.EJ_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import TP9.EJ_2.Condiciones.Condicion;

public class Carpeta extends Elemento {
    private ArrayList<Elemento> elementos;

    public Carpeta(String nombre) {
        super(nombre);
        this.elementos = new ArrayList<>();
    }

    @Override
    public double getTamanio() {
        double total = 0.0;
        for (int i = 0; i < elementos.size(); i++) {
            total += elementos.get(i).getTamanio();
        }
        return total;
    }

    @Override
    public int getCantElementos() {
        int total = 0;
        for (int i = 0; i < elementos.size(); i++) {
            total += elementos.get(i).getCantElementos();
        }
        return total;
    }

    public void addElemento(Elemento e) {
        if (!elementos.contains(e))
            elementos.add(e);
        e.setContenedor(this);
    }

    public void eliminarElemento(Elemento e) {
        this.elementos.remove(e);
    }

    @Override
    public ArrayList<Archivo> getArchivosQueCumplenOrdenados(Condicion c, Comparator<Elemento> orden) {
        ArrayList<Archivo> resultado = new ArrayList<>();
        for (int i = 0; i < elementos.size(); i++) {
            resultado.addAll(this.elementos.get(i).getArchivosQueCumplenOrdenados(c, orden));
        }
        if (orden != null)
            Collections.sort(resultado, orden);
        else
            Collections.sort(resultado);
        return resultado;
    }

    @Override
    public boolean equals(Object o) {
        try {
            Carpeta otro = (Carpeta) o;
            return this.getNombre().equals(otro.getNombre());
        } catch (Exception e) {
            return false;
        }
    }

}
