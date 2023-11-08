package TP10.EJ_5;

import java.time.LocalDate;
import java.util.ArrayList;

import TP10.EJ_5.Condiciones.Condicion;

public class Paquete extends Elemento {
    public Paquete(String iD, String destino, LocalDate fechaPartida, double costoEnvio, double valorAsegurado) {
        super(iD, destino, fechaPartida, costoEnvio, valorAsegurado);
    }

    @Override
    public double getCostoEnvio() {
        return this.getCostoEnvio();
    }

    @Override
    public double getValorAsegurado() {
        return this.getValorAsegurado();
    }

    @Override
    public int getCantPaquetes() {
        return 1;
    }

    @Override
    public Elemento getCopia() {
        return new Paquete(this.getID(), this.getDestino(), this.getFechaPartida(), this.getCostoEnvio(),
                this.getValorAsegurado());
    }

    @Override
    public Paquete getPaqueteMayorValorAsegurado() {
        return this;
    }

    @Override
    public ArrayList<Elemento> buscar(Condicion c) {
        ArrayList<Elemento> resultado = new ArrayList<>();
        if (c.cumple(this))
            resultado.add(this);
        return resultado;
    }

}
