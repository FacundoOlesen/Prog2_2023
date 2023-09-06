package TP2.EJ_5;

import java.util.ArrayList;

public class Peluquero {
    private String nombre;
    private String apellido;
    private double precio;
    private ArrayList<Cliente> arrClientes;

    public Peluquero(String nombre, String apellido, double precio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.precio=precio;
        this.arrClientes = new ArrayList<Cliente>();
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void addCliente(Cliente cliente) {
        arrClientes.add(cliente);
    }

}
