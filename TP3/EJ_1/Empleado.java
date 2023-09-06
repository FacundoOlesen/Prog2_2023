package TP3.EJ_1;

public class Empleado {
    private String nombre;
    private int cantEncuestasRealizadas;

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.cantEncuestasRealizadas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantEncuestasRealizadas() {
        return cantEncuestasRealizadas;
    }

    public void setCantEncuestasRealizadas(int cantEncuestasRealizadas) {
        this.cantEncuestasRealizadas = cantEncuestasRealizadas;
    }

    public String toString() {
        return this.nombre +
                "\nCantidad de encuestas realizadas: " + this.cantEncuestasRealizadas;
    }

}
