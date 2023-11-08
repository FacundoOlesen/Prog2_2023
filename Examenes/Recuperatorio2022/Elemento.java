package Examenes.Recuperatorio2022;

import java.util.ArrayList;

import Examenes.Recuperatorio2022.Condiciones.Condicion;

public abstract class Elemento implements Comparable<Elemento> {
    private String categoria;

    public Elemento(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public abstract ArrayList<String> getPalabrasClave();

    @Override
    public int compareTo(Elemento otro) {
        return this.categoria.compareTo(otro.getCategoria());
    }

    public abstract ArrayList<Noticia> buscar (Condicion c);
    public abstract Elemento copia();
    public abstract Elemento copiaRestringida(Condicion cond);
}
