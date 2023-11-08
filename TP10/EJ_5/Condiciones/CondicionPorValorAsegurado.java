package TP10.EJ_5.Condiciones;

import TP10.EJ_5.Elemento;

public class CondicionPorValorAsegurado extends Condicion {
    private double valorAsegurado;

    public CondicionPorValorAsegurado(double valorAsegurado) {
        this.valorAsegurado = valorAsegurado;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return elemento.getValorAsegurado() > valorAsegurado;
    }

}
