package TP4.EJ_4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private int nroPasaporte;
    private LocalDate fechaNacimiento;
    private ArrayList<String> arrEstados;

    public Persona(String nombre, String apellido, int nroPasaporte, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroPasaporte = nroPasaporte;
        this.fechaNacimiento = fechaNacimiento;
        this.arrEstados = new ArrayList<>();
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

    public int getNroPasaporte() {
        return nroPasaporte;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void addEstados(String estado){
        this.arrEstados.add(estado);
    }

}