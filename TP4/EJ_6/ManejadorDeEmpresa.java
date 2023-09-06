package TP4.EJ_6;

public class ManejadorDeEmpresa {

    public void imprimir(Persona persona) {
        System.out.println(persona);
    }

    public static void main(String[] args) {
        ManejadorDeEmpresa me = new ManejadorDeEmpresa();

        Empleado empleado1 = new Empleado("Facundo", "Olesen", 21, "Empleado base", 120, 3020);
        me.imprimir(empleado1);

        UsuarioFinal usuarioFinal1 = new UsuarioFinal("Pepito", "Lopez", 20, "Empleado", "Pepee", "Pepito123");
        me.imprimir(usuarioFinal1);

        UsuarioJerarquico usuarioJerarquico1 = new UsuarioJerarquico("John", "Standford", 50, "Jefe", 1, 10000);
        usuarioJerarquico1.addEmpleadoACargo(empleado1);
        me.imprimir(usuarioJerarquico1);
    }

}
