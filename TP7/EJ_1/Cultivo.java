package TP7.EJ_1;

import java.util.ArrayList;

public class Cultivo {
    private String nombre;
    private ArrayList<Enfermedad> enfermedadesFrecuentes;

    public Cultivo(String nombre) {
        this.nombre = nombre;
        this.enfermedadesFrecuentes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addEnfermedadFrecuente(Enfermedad e) {
        if (!this.enfermedadesFrecuentes.contains(e))
            this.enfermedadesFrecuentes.add(e);
    }

    public ArrayList<Enfermedad> getEnfermedadesFrecuentes() {
        ArrayList<Enfermedad> list = new ArrayList<>(this.enfermedadesFrecuentes);
        return list;
    }

    @Override
    public boolean equals(Object o) {
        try {
            Cultivo otro = (Cultivo) o;
            return this.getNombre().equals(otro.getNombre());
        } catch (Exception e) {
            return false;
        }
    }

}
