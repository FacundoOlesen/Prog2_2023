package TP4.EJ_2;

import java.util.ArrayList;

public class Sensor{
    private String nombre;
    private String zona;
    private boolean activado;
    private ArrayList<Sensor> arrSensores;

    public Sensor(String nombre, String zona) {
        this.nombre = nombre;
        this.zona=zona;
        this.activado=false;
        this.arrSensores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public boolean isEstaActivado() {
        return activado;
    }

    public void activarSensor(){
        this.activado=true;
    }

    public void setEstaActivado(boolean estaPrendido) {
        this.activado = estaPrendido;
    }
}