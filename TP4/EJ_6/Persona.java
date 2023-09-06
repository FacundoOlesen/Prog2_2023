package TP4.EJ_6;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String cargo;

    public Persona(String nombre, String apellido, int edad, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String toString(){
        return "Nombre: " + this.getNombre() +
                " Apellido: " + this.getApellido()+
                " Edad: " + this.getEdad()
                + " Cargo: " +this.getCargo();
    }

}
