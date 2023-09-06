package TP2.EJ_2;

import java.util.ArrayList;

public class Reunion {
    private String lugar;
    private ArrayList <Participante> arrParticipantes;
    private String tema;
    private double duracion;
    
    
    public Reunion(String lugar, String tema, double duracion) {
        this.lugar = lugar;
        this.arrParticipantes = new ArrayList<Participante>();
        this.tema = tema;
        this.duracion = duracion;
    }


    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public ArrayList<Participante> getArrParticipantes() {
        return arrParticipantes;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void addParticipantes(Participante participante){
        arrParticipantes.add(participante);
    }
}
