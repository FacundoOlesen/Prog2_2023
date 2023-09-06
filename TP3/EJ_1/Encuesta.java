package TP3.EJ_1;

import java.util.ArrayList;

public class Encuesta {
    private ArrayList<String> arrPreguntas;
    private String personaEncuestada;
    private int dniPersonaEncuestada;
    private Empleado empleado;

    public Encuesta(String personaEncuestada, int dniPersonaEncuestada, Empleado empleado) {
        this.personaEncuestada = personaEncuestada;
        this.dniPersonaEncuestada = dniPersonaEncuestada;
        this.empleado = empleado;
        this.arrPreguntas = new ArrayList<>();
        this.empleado.setCantEncuestasRealizadas(this.empleado.getCantEncuestasRealizadas()+1);
    }

    public ArrayList<String> getArrPreguntas() {
        return arrPreguntas;
    }

    public void setArrPreguntas(ArrayList<String> arrPreguntas) {
        this.arrPreguntas = arrPreguntas;
    }

    public String getPersonaEncuestada() {
        return personaEncuestada;
    }

    public void setPersonaEncuestada(String personaEncuestada) {
        this.personaEncuestada = personaEncuestada;
    }

    public int getDniPersonaEncuestada() {
        return dniPersonaEncuestada;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void addPreguntas(String pregunta){
        this.arrPreguntas.add(pregunta);
    }

    public String toString() {
        return "---------------------------------------------------"+
        "\nNombre del empleado: " + this.empleado +
                "\nNombre persona encuestada: " + this.personaEncuestada +
                "\nDNI Persona encuestada: " + this.dniPersonaEncuestada +
                "\nPreguntas dela encuesta: " + this.arrPreguntas;
    }

}
