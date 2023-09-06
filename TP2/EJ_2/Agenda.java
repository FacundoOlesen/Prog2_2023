package TP2.EJ_2;

import java.util.ArrayList;

public class Agenda {
    private String duenio;
    private ArrayList <Reunion> arrReuniones;


    public Agenda(String duenio) {
        this.duenio = duenio;
        this.arrReuniones = new ArrayList<Reunion>();
    }


    public String getDuenio() {
        return duenio;
    }


    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }


    public ArrayList<Reunion> getarrReuniones() {
        return arrReuniones;
    }

    public void addReunion(Reunion reunion){
        arrReuniones.add(reunion);
    }
}
