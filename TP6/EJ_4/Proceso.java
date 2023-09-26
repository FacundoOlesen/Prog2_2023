package TP6.EJ_4;

public class Proceso extends ElementoCola {
    private String nombre;
    private double memRequerida;

    public Proceso(String nombre, double memRequerida) {
        this.nombre = nombre;
        this.memRequerida = memRequerida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMemRequerida() {
        return memRequerida;
    }

    public void setMemRequerida(double memRequerida) {
        this.memRequerida = memRequerida;
    }

    @Override
    public boolean esMenor(ElementoCola obj1, ElementoCola obj2) {
        return ((Proceso) obj1).getMemRequerida() > ((Proceso) obj2).getMemRequerida();
    }

    public String toString() {
        return " Nombre" + this.getNombre() +
                " Mem requerida: " + this.getMemRequerida();
    }

}
