package TP4.EJ_3;

public class Principal {
    public static void main(String[] args) {
        Empleado empleadoFijo = new Empleado("Facundo", "Olesen", 5000);
        EmpleadoHoraExtra empleadoHoraExtra = new EmpleadoHoraExtra("Lionel", "Messi", 5000, 40);
        EmpleadoComision empleadoComision = new EmpleadoComision("Pepito", "Rodriguez", 5000, 500, 10);

        System.out.println(empleadoFijo);
        System.out.println(empleadoHoraExtra);
        System.out.println(empleadoComision);

    }

}
