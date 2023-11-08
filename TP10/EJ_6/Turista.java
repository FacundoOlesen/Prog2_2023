package TP10.EJ_6;

public class Turista {
    private String nombre;
    private int edad;
    private String ciudadOrigen;
    public Turista(String nombre, int edad, String ciudadOrigen) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudadOrigen = ciudadOrigen;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getCiudadOrigen() {
        return ciudadOrigen;
    }
    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    
}
