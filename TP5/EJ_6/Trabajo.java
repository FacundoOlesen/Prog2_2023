package TP5.EJ_6;

import java.util.ArrayList;

public class Trabajo {
    protected ArrayList<String> temas;

    public Trabajo() {
        this.temas = new ArrayList<>();
    }

    public void addTemas(String tema) {
        this.temas.add(tema);
    }

    public ArrayList<String> getTemas() {
        return new ArrayList<>(this.temas);
    }
    public boolean puedeAsignarseA(Evaluador evaluador) {
        for (int i = 0; i < temas.size(); i++) {
            String temaI = this.temas.get(i);
            if (!evaluador.getTemas().contains(temaI)) {
                return false;
            }
        }
        return true;
    }
}
