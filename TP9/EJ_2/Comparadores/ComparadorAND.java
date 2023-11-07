package TP9.EJ_2.Comparadores;

import java.util.Comparator;

import TP9.EJ_2.Elemento;

public class ComparadorAND implements Comparator<Elemento> {
    private  Comparator<Elemento> comp1;
    private  Comparator<Elemento> comp2;

    public ComparadorAND(Comparator<Elemento> comp1, Comparator<Elemento> comp2) {
        this.comp1 = comp1;
        this.comp2 = comp2;
    }

    @Override
    public int compare(Elemento o1, Elemento o2) {
         int resultado = this.comp1.compare(o1, o2);
         if (resultado == 0) 
             resultado = this.comp2.compare(o1, o2);
         return resultado;
    }
}
