package TP6.EJ_4;

public class Barco extends ElementoCola {
    private double capacidad;
    public Barco(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    /*public void ejecutarCarga(Camion c) {
        this.camio = c;
    }*/

    @Override
    public void ejecutar(ElementoCola e) {
        Camion c = (Camion) e;
        super.ejecutar(c);
    }

    @Override
    public boolean esMenor(ElementoCola obj1, ElementoCola obj2) {
        return ((Barco) obj1).getCapacidad() > ((Barco) obj2).getCapacidad();
    }
}
