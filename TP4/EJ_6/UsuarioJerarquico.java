package TP4.EJ_6;
import java.util.ArrayList;

public class UsuarioJerarquico extends Empleado {
    private ArrayList<Empleado> empleadosACargo;

    public UsuarioJerarquico(String nombre, String apellido, int edad, String cargo, int nroLegajo, double sueldo) {
        super(nombre, apellido, edad, cargo, nroLegajo, sueldo);
        this.empleadosACargo = new ArrayList<>();
    }

    public void addEmpleadoACargo(Empleado empleado) {
        this.empleadosACargo.add(empleado);
    }

}
