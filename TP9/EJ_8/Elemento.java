package TP9.EJ_8;

import java.util.ArrayList;
import java.util.Comparator;

import TP9.EJ_8.Condiciones.Condicion;

public abstract class Elemento {
    private String titulo;

    public Elemento(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract ArrayList<Video> getVideosQueCumplenOrdenados(Condicion condicion, Comparator<Elemento> orden);

    public abstract ArrayList<String> getPalabrasClave();

    public abstract int getCantidadVideos();

    public abstract int getDuracion();

}
