package TP9.EJ_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

import TP9.EJ_2.Condiciones.Condicion;

public abstract class Elemento implements Comparable<Elemento> {
    private String nombre;
    private LocalDate fechaCreacion;
    private Carpeta contenedor = null;

    public Elemento(String nombre) {
        this.nombre = nombre;
        this.fechaCreacion = LocalDate.now();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carpeta getContenedor() {
        return contenedor;
    }

    public void setContenedor(Carpeta contenedor) {
        this.contenedor = contenedor;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public String toString() {
        return this.nombre;
    }

    public int getCantElementos(){
        return 1;
    }

    public abstract double getTamanio();

    public abstract ArrayList<Archivo> getArchivosQueCumplenOrdenados(Condicion condicion , Comparator<Elemento> orden);
    
    @Override
    public int compareTo(Elemento otro) {
        return this.getNombre().compareTo(otro.getNombre());
    }
    
    @Override
    public boolean equals(Object o) {
        Elemento otro = (Elemento) o;
        try {
            return otro.getNombre().equals(this.getNombre());
        } catch (Exception e) {
            return false;
        }
    }
}