package TP10.EJ_5.Condiciones;

import TP10.EJ_5.Elemento;

public class CondicionPorDestino extends Condicion {
    private String destino;

    public CondicionPorDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return elemento.getDestino().equals(destino);
    }

}
