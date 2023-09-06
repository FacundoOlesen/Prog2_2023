package TP2.EJ_5;

import java.time.LocalDate;

public class Turno {
    private LocalDate fecha;
    private Peluquero peluquero;
    private Cliente cliente;

    public Turno(LocalDate fecha, Peluquero peluquero, Cliente cliente) {
        this.fecha = fecha;
        this.peluquero = peluquero;
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Peluquero getPeluquero() {
        return peluquero;
    }

    public void setPeluquero(Peluquero peluquero) {
        this.peluquero = peluquero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
