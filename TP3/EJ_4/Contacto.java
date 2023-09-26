package TP3.EJ_4;

import java.time.LocalDate;

public class Contacto {
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fechaNacimiento;
    private int nroTelefono;
    private String direccion;
    private String email;
    private String ciudad;

    public Contacto(String nombre, String apellido, int edad, LocalDate fechaNacimiento, int nroTelefono,
            String direccion,
            String email, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.nroTelefono = nroTelefono;
        this.direccion = direccion;
        this.email = email;
        this.ciudad = ciudad;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNroTelefono() {
        return nroTelefono;
    }

    public void setNroTelefono(int nroTelefono) {
        this.nroTelefono = nroTelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String toString() {
        return "Nombre: " + this.nombre +
                ", Apellido: " + this.apellido +
                ", Edad: " + this.edad +
                ", Numero De Telefono: " + this.nroTelefono;
    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Contacto)){
            return false;
        }
        Contacto aux = (Contacto) obj;
        return aux.getNroTelefono() == this.getNroTelefono() && aux.getNombre()==this.getNombre() && aux.getApellido()==this.getApellido();
    }

}
