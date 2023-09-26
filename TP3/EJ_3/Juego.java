package TP3.EJ_3;

import java.util.ArrayList;

public class Juego {
    private String nombre;
    private Personaje p1;
    private Personaje p2;

    public Juego(String nombre, Personaje p1, Personaje p2) {
        this.nombre = nombre;
        this.p1 = p1;
        this.p2 = p2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  


}