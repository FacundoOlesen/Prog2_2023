package TP7.EJ_1;

import java.util.ArrayList;

public class Enfermedad {
    private String nombre;
    private ArrayList<String> estadosPatologicos;

    public Enfermedad(String nombre) {
        this.nombre = nombre;
        this.estadosPatologicos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addEstadoPatologico(String e) {
        if (!this.estadosPatologicos.contains(e)) {
            this.estadosPatologicos.add(e);
        }
    }

    public ArrayList<String> getEstadosPatologicos() {
        ArrayList<String> list = new ArrayList<>(this.estadosPatologicos);
        return list;
    }

    @Override
    public boolean equals(Object o) {
        try {
            Enfermedad otro = (Enfermedad) o;
            return this.getNombre().equals(otro.getNombre());
        } catch (Exception e) {
            return false;
        }
    }
}
