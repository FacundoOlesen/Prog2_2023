package TP10.EJ_5;

import java.time.LocalDate;
import java.util.ArrayList;

import TP10.EJ_5.Condiciones.Condicion;



public abstract class Elemento {
    private String ID;
    private String destino;
    private LocalDate fechaPartida;
    private double costoEnvio;
    private double valorAsegurado;

    public Elemento(String iD, String destino, LocalDate fechaPartida, double costoEnvio, double valorAsegurado) {
        ID = iD;
        this.destino = destino;
        this.fechaPartida = fechaPartida;
        this.costoEnvio = costoEnvio;
        this.valorAsegurado = valorAsegurado;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getFechaPartida() {
        return fechaPartida;
    }

    public void setFechaPartida(LocalDate fechaPartida) {
        this.fechaPartida = fechaPartida;
    }

    public abstract double getCostoEnvio();

    public void setCostoEnvio(double costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public abstract double getValorAsegurado();

    public void setValorAsegurado(double valorAsegurado) {
        this.valorAsegurado = valorAsegurado;
    }


    public abstract int getCantPaquetes();
    public abstract Paquete getPaqueteMayorValorAsegurado();
    public abstract Elemento getCopia(); 
    public abstract ArrayList<Elemento> buscar(Condicion c);
}
