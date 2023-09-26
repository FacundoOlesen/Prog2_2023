package TP5.EJ_5;

public class EmpleadoVendedor extends Empleado {
    private int ventas;
    private double porcentaje;

    public EmpleadoVendedor(String nombre, String apellido, int dNI, double sueldo, int ventas, double porcentaje){
        super(nombre, apellido, dNI, sueldo);
        this.ventas=ventas;
        this.porcentaje=porcentaje;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double getSueldo() {
        return super.getSueldo() + ventas *porcentaje /100;
    }

    @Override
    public String toString() {
        return super.toString() + " Ventas: " + this.getVentas()+
                                    " Porcentaje que obtiene de las ventas: "  + porcentaje
                                    + " Sueldo final: " + this.getSueldo();
    }

    
    
}
