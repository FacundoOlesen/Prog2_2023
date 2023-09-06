package TP4.EJ_5;

import java.time.LocalDate;

public class Producto {
    private String nombre;
    private LocalDate fechaVencimiento;
    private LocalDate fechaEnvasado;
    private String granjaOrigen;

    private int nroLote;
    public Producto(String nombre, LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado, String granjaOrigen) {
        this.nombre = nombre;
        this.fechaVencimiento = fechaVencimiento;
        this.nroLote = nroLote;
        this.fechaEnvasado=fechaEnvasado;
        this.granjaOrigen=granjaOrigen;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public int getNroLote() {
        return nroLote;
    }
    public void setNroLote(int nroLote) {
        this.nroLote = nroLote;
    }


    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }


    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }


    public String getGranjaOrigen() {
        return granjaOrigen;
    }


    public void setGranjaOrigen(String granjaOrigen) {
        this.granjaOrigen = granjaOrigen;
    }

    public String toString(){
        return  "Nombre: " + this.getNombre()+
                " Fecha vencimiento: " +this.getFechaVencimiento()+
                " Fecha Envasado: " + this.getFechaEnvasado()+
                " Granja Origen: " + this.getGranjaOrigen();
    }
    
    
}
