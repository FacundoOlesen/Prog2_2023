package TP4.EJ_4;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private int nroPasaporte;
    private LocalDate fechaNacimiento;
    private boolean viajando;
    private boolean concentracion;
    private boolean enPais;

    public Persona(String nombre, String apellido, int nroPasaporte, LocalDate fechaNacimiento, boolean viajando, boolean concentracion, boolean enPais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroPasaporte = nroPasaporte;
        this.fechaNacimiento = fechaNacimiento;
        this.viajando=viajando;
        this.concentracion=concentracion;
        this.enPais=enPais;
    }


    public boolean isViajando() {
        return viajando;
    }


    public void setViajando(boolean viajando) {
        this.viajando = viajando;
    }


    public boolean isConcentracion() {
        return concentracion;
    }


    public void setConcentracion(boolean concentracion) {
        this.concentracion = concentracion;
    }


    public boolean isEnPais() {
        return enPais;
    }


    public void setEnPais(boolean enPais) {
        this.enPais = enPais;
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

    public boolean estaDisponible(){
        return enPais && !concentracion;
    }
}