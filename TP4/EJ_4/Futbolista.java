package TP4.EJ_4;

import java.time.LocalDate;

public class Futbolista extends Persona {
    private String posicion;
    private String pieHabil;
    private int goles;

    public Futbolista(String nombre, String apellido, int nroPasaporte, LocalDate fechaNacimiento, String posicion, String pieHabil, int goles) {
        super(nombre, apellido, nroPasaporte, fechaNacimiento);
        this.posicion=posicion;
        this.pieHabil=pieHabil;
        this.goles=goles;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getPieHabil() {
        return pieHabil;
    }

    public void setPieHabil(String pieHabil) {
        this.pieHabil = pieHabil;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    
}
