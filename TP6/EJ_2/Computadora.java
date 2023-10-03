package TP6.EJ_2;

public class Computadora extends ElementoCola {
    private String nombre;
    private double velocidad;
    private Proceso proc;

    public Computadora(String nombre, double velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        proc = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void ejecutarProceso(Proceso p) {
        this.proc = p;
    }

    @Override
    public boolean esMenor(ElementoCola otro) {
        return this.getVelocidad()< ((Computadora)otro).getVelocidad();
    }

    public String toString() {
        return "\nNombre PC:" + this.getNombre() +
                " Velocidad: " + this.getVelocidad();
    }

}
