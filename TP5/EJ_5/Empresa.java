package TP5.EJ_5;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void addEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }

    public double getSumaSueldos() {
        double sumaSueldos = 0;
        for (int i = 0; i < empleados.size(); i++) {
            sumaSueldos += empleados.get(i).getSueldo();
        }
        return sumaSueldos;
    }

    public ArrayList<Empleado> getEmpleados() {
        return new ArrayList<>(this.empleados);
    }

}
