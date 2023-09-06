package TP3.EJ_1;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Encuesta> arrEncuestas;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.arrEncuestas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addEncuesta(Encuesta encuesta) {
        if (!chequearDni(encuesta) || arrEncuestas.size() == 0) {
            this.arrEncuestas.add(encuesta);
        } else {
            System.out.println("\nError!, la persona encuestada: " + encuesta.getPersonaEncuestada() + " con DNI: "
                    + encuesta.getDniPersonaEncuestada() +
                    " ya respondió a esta encuesta.");
        }
    }

    public boolean chequearDni(Encuesta encuesta) {
        boolean yaResp = true;
        for (int i = 0; i < arrEncuestas.size(); i++) {
            if (arrEncuestas.get(i).getDniPersonaEncuestada() != encuesta.getDniPersonaEncuestada()
                    || !(arrEncuestas.get(i).equals(encuesta))) {
                yaResp = false;
            } else {
                yaResp = true;
            }
        }
        return yaResp;
    }

}
