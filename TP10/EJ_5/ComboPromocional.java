package TP10.EJ_5;

import java.time.LocalDate;

import TP10.EJ_5.Condiciones.Condicion;

public class ComboPromocional extends Combo {
    public ComboPromocional(String iD, String destino, LocalDate fechaPartida, double costoEnvio, double valorAsegurado,
            Condicion cond) {
        super(iD, destino, fechaPartida, costoEnvio, valorAsegurado, cond);
    }

    @Override
    public double getCostoEnvio() {
        return super.getCostoEnvio() / super.getElementos().size();
    }
}
