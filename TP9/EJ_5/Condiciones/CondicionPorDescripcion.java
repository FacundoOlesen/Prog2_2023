package TP9.EJ_5.Condiciones;

import TP9.EJ_5.Seguro;

public class CondicionPorDescripcion extends Condicion {
    private String palabra;

    public CondicionPorDescripcion(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Seguro seguro) {
        return seguro.getDescripcion().contains(palabra);
    }

}
