package TP4.EJ_6;
public class Empleado extends Persona {
    
    private int nroLegajo;
    private double sueldo;

    public Empleado(String nombre, String apellido, int edad, String cargo, int nroLegajo, double sueldo){
        super(nombre, apellido, edad, cargo);
        this.nroLegajo=nroLegajo;
        this.sueldo=sueldo;
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    
}
