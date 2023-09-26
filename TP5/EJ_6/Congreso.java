package TP5.EJ_6;

import java.util.ArrayList;

public class Congreso {
    private String nombre;
    private ArrayList<Trabajo> trabajos;
    private ArrayList<Evaluador> evaluadores;
    private ArrayList<String> temasExperto;

    public Congreso(String nombre) {
        this.nombre = nombre;
        this.trabajos = new ArrayList<>();
        this.evaluadores = new ArrayList<>();
        this.temasExperto = new ArrayList<>();
    }

    public void addTemasExperto(String tema) {
        this.temasExperto.add(tema);
    }

    public ArrayList<String> getTemasExperto() {
        return new ArrayList<>(this.temasExperto);
    }

    public boolean esExperto(Evaluador evaluador) {
        for (int i = 0; i < this.temasExperto.size(); i++) {
            if (!evaluador.getTemas().contains(temasExperto.get(i))) {
                return false;
            }
        }
        return true;
    }
}
