package TP5.EJ_5;

public class Empleado {
    private String nombre;
    private String apellido;
    private int DNI;
    private double sueldo;

    public Empleado(String nombre, String apellido, int dNI, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        DNI = dNI;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int dNI) {
        DNI = dNI;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String toString() {
        return "\nNombre: " + this.getNombre() +
                " Apellido: " + this.getApellido() +
                " DNI: " + this.getDNI() +
                " Sueldo: " + this.getSueldo();
    }
}
