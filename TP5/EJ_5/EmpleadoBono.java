package TP5.EJ_5;

public class EmpleadoBono extends Empleado {
    private int ventas;
    private double bono;
    private int minimoVentas;

    public EmpleadoBono(String nombre, String apellido, int dNI, double sueldo, int ventas, int minimoVentas,
            double bono) {
        super(nombre, apellido, dNI, sueldo);
        this.ventas = ventas;
        this.minimoVentas = minimoVentas;
        this.bono = bono;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public int getMinimoVentas() {
        return minimoVentas;
    }

    public void setMinimoVentas(int minimoVentas) {
        this.minimoVentas = minimoVentas;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    @Override
    public double getSueldo() {
        if (this.ventas > minimoVentas) {
            return super.getSueldo() + this.bono;
        } else {
            return super.getSueldo();
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Ventas: " + this.getVentas() +
                " Ventas necesarias para obtener el bono: " + this.getMinimoVentas() +
                " Bono: " + this.getBono() +
                " Sueldo final: " + this.getSueldo();
    }

}
