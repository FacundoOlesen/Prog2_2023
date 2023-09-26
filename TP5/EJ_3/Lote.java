package TP5.EJ_3;

import java.util.ArrayList;

public class Lote {
    private String nombre;
    private double tamanio;
    private ArrayList<String> minerales;

    public Lote(String nombre, double tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.minerales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public boolean tieneMineral(String mineral) {
        return this.minerales.contains(mineral);
    }

    public boolean sePuedeSembrar(Cereal cereal) {
        return cereal.sePuedeSembrarEn(this);
    }

}
