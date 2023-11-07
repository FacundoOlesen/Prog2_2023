package TP9.EJ_6.Condiciones;

import TP9.EJ_6.ElementoSimple;

public class CondicionPorValor extends Condicion {
    private int valor;

    public CondicionPorValor(int valor) {
        this.valor = valor;
    }

    @Override
    public boolean cumple(ElementoSimple elemento) {
        return elemento.getValor()<(valor);
    }
}
