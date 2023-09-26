package TP4.EJ_3;

public class EmpleadoComision extends Empleado {
    private int cantVentas;
    private  int porcentaje;

    public EmpleadoComision(String nombre, String apellido, double salario, int cantVentas, int porcentaje) {
        super(nombre, apellido, salario);
        this.cantVentas = cantVentas;
        this.porcentaje=porcentaje;
    }

    public double getSalario() {
        return salario+cantVentas/porcentaje;
    }

}
