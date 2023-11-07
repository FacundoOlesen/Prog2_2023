package TP9.EJ_6.Condiciones;

import TP9.EJ_6.ElementoSimple;

public class CondicionPorDescripcion extends Condicion {
    private String palabra;

    public CondicionPorDescripcion(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(ElementoSimple elemento) {
        return elemento.getDescripcion().contains(palabra);
    }
}
