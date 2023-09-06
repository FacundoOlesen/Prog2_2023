package TP4.EJ_3;

public class EmpleadoComision extends Empleado {
    private int cantVentas;
    public static final int PORCENTAJE = 10;

    public EmpleadoComision(String nombre, String apellido, double salario, int cantVentas) {
        super(nombre, apellido, salario);
        this.cantVentas = cantVentas;
        super.salario = salario + cantVentas / PORCENTAJE;
    }

    public double getSalario() {
        return salario;
    }

}
