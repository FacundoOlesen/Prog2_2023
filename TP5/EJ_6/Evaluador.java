package TP5.EJ_6;

import java.util.ArrayList;

public class Evaluador {
    private String nombre;
    private ArrayList<String> temas;

    public Evaluador(String nombre) {
        this.nombre = nombre;
        this.temas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addTema(String tema) {
        this.temas.add(tema);
    }


    public boolean puedeTrabajarEn(Trabajo trabajo) {
        return trabajo.puedeAsignarseA(this);
    }

    public ArrayList<String> getTemas() {
        return new ArrayList<>(this.temas);
    }


}
