package TP9.EJ_7.Condiciones;

import TP9.EJ_7.Elemento;

public class CondicionPorPeso extends Condicion{
    private double peso;

    public CondicionPorPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return elemento.getPeso()>peso;
    }

    
}
