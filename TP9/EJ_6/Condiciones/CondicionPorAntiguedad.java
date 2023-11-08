package TP9.EJ_6.Condiciones;

import java.time.LocalDate;

import TP9.EJ_6.ElementoSimple;

public class CondicionPorAntiguedad extends Condicion {
    private LocalDate antiguedad;

    public CondicionPorAntiguedad(LocalDate antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public boolean cumple(ElementoSimple elemento) {
        return elemento.getAntiguedad().isBefore(antiguedad);
    }
}

