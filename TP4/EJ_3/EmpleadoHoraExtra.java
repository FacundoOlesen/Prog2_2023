package TP4.EJ_3;

public class EmpleadoHoraExtra extends Empleado {
    private double horasTrabajadas;

    public EmpleadoHoraExtra(String nombre, String apellido, double salario, double horasTrabajadas) {
        super(nombre, apellido, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSalario() {
        return salario *horasTrabajadas;
    }

}
