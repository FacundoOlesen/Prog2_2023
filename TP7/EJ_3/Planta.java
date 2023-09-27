package TP7.EJ_3;

import java.util.ArrayList;

public class Planta {
    private String nombreCientifico;
    private ArrayList<String> nombresVulgares;
    private String clasificacionSuperior;
    private String familia;
    private String clase;
    private int sol;
    private int riego;

    public Planta(String nombreCientifico, String clasificacionSuperior, String familia, String clase, int sol,
            int riego) {
        this.nombreCientifico = nombreCientifico;
        this.clasificacionSuperior = clasificacionSuperior;
        this.familia = familia;
        this.clase = clase;
        this.sol = sol;
        this.riego = riego;
        this.nombresVulgares = new ArrayList<>();
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getClasificacionSuperior() {
        return clasificacionSuperior;
    }

    public void setClasificacionSuperior(String clasificacionSuperior) {
        this.clasificacionSuperior = clasificacionSuperior;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getSol() {
        return sol;
    }

    public void setSol(int sol) {
        this.sol = sol;
    }

    public int getRiego() {
        return riego;
    }

    public void setRiego(int riego) {
        this.riego = riego;
    }

    public void addNombreVulgar(String n) {
        if (!nombresVulgares.contains(n))
            this.nombresVulgares.add(n);
    }

    public ArrayList<String> getNombresVulgares() {
        ArrayList<String> list = new ArrayList<>(this.nombresVulgares);
        return list;
    }

    @Override
    public String toString() {
        return "Planta [nombreCientifico=" + nombreCientifico + ", nombresVulgares=" + getNombresVulgares()
                + ", clasificacionSuperior=" + clasificacionSuperior + ", familia=" + familia + ", clase=" + clase
                + ", sol=" + sol + ", riego=" + riego + "]";
    }

    @Override
    public boolean equals(Object o) {
        try {
            Planta otro = (Planta) o;
            return this.getNombreCientifico().equals(otro.getNombreCientifico());
        } catch (Exception e) {
            return false;
        }
    }

}
