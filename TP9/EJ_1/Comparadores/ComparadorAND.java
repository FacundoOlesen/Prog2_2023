package TP9.EJ_1.Comparadores;

import java.util.Comparator;
import TP9.EJ_1.Socio;

public class ComparadorAND implements Comparator<Socio> {
    private  Comparator<Socio> comp1;
    private  Comparator<Socio> comp2;

    public ComparadorAND(Comparator<Socio> comp1, Comparator<Socio> comp2) {
        this.comp1 = comp1;
        this.comp2 = comp2;
    }

    @Override
    public int compare(Socio o1, Socio o2) {
         int resultado = this.comp1.compare(o1, o2);
         if (resultado == 0) 
             resultado = this.comp2.compare(o1, o2);
         return resultado;
    }
}

