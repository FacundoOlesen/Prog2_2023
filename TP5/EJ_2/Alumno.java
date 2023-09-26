package TP5.EJ_2;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<String> cualidades;
    private ArrayList<Alumno> familiares;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.cualidades = new ArrayList<>();
        this.familiares = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addCualidades(String cualidad) {
        this.cualidades.add(cualidad);
    }

    public void addFamiliares(Alumno familiar) {
        this.familiares.add(familiar);
    }

    public ArrayList<String> getCualidades() {
        return new ArrayList<>(this.cualidades);
    }

     public ArrayList<Alumno> getFamiliares() {
        return new ArrayList<>(this.familiares);
    }

}
