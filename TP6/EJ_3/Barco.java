package TP6.EJ_3;

public class Barco extends ElementoCola {
    private double capacidad;
    private Camion camio;
    public Barco(double capacidad) {
        this.capacidad = capacidad;
        camio=null;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public void ejecutarCarga(Camion c) {
        this.camio = c;
    }

    @Override
    public boolean esMenor(ElementoCola obj1, ElementoCola obj2) {
        return ((Barco) obj1).getCapacidad() > ((Barco) obj2).getCapacidad();
    }
}
