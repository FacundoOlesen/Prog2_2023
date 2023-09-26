package TP5.EJ_5;

public class Principal {
    public static void main(String[] args) {
        Empresa Samsung = new Empresa("Samsung");

        Empleado Emp1 = new Empleado("Facundo", "Olesen", 321321, 10000);

        EmpleadoVendedor Emp2 = new EmpleadoVendedor("Lionel", "Messi", 332310, 2000, 1000, 10);

        EmpleadoBono  Emp3= new EmpleadoBono("Julian", "Alvarez", 32130, 1000, 220, 230, 1000);

        EmpleadoBono Emp4= new EmpleadoBono("Rodrigo", "Lopez", 32321, 2000, 100, 80, 330);

        Samsung.addEmpleado(Emp1);
        Samsung.addEmpleado(Emp2);
        Samsung.addEmpleado(Emp3);
        Samsung.addEmpleado(Emp4);
        
        System.out.println(Samsung.getEmpleados());  
        System.out.println("Suma total de todos los sueldos: " + Samsung.getSumaSueldos());

    }
}
