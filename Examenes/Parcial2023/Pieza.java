package Examenes.Parcial2023;

import java.util.ArrayList;

import Examenes.Parcial2023.Condiciones.Condicion;

public abstract class Pieza {
    private String nombre;
    private String descripcion;

    private static int precioGramo = 12;
    private static int costoSegundo = 45;

    public Pieza(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public static int getPrecioGramo() {
        return precioGramo;
    }

    public static void setPrecioGramo(int precioGramo) {
        Pieza.precioGramo = precioGramo;
    }

    public static int getCostoSegundo() {
        return costoSegundo;
    }

    public static void setCostoSegundo(int costoSegundo) {
        Pieza.costoSegundo = costoSegundo;
    }

    public abstract int getCantPiezas();

    public abstract ArrayList<Pieza> buscar(Condicion c);

    public abstract ArrayList<String> getColores();

    public abstract int getPla();

    public abstract int getTiempoEstimado();

    public int getCosto(){
        return getPla()*getPrecioGramo()+getCostoSegundo()*getTiempoEstimado();
    }


}
