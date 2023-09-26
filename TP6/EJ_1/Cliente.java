package TP6.EJ_1;


public class Cliente {
    private String nombre;
    private String apellido;
    private int DNI;

    public Cliente(String nombre, String apellido, int dNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        DNI = dNI;
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

    public int getDNI() {
        return DNI;
    }


    public String toString(){
        return "\n Nombre: " + this.getNombre()+
                ", Apellido: " +this.getApellido() + 
                ", DNI: " + this.getDNI();
    }

    
}
