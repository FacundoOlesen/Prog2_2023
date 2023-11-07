package TP9.EJ_3.Comparadores;

import java.util.Comparator;

import TP9.EJ_3.Candidato;

public class ComparadorAND implements Comparator<Candidato> {
    private  Comparator<Candidato> comp1;
    private  Comparator<Candidato> comp2;

    public ComparadorAND(Comparator<Candidato> comp1, Comparator<Candidato> comp2) {
        this.comp1 = comp1;
        this.comp2 = comp2;
    }

    @Override
    public int compare(Candidato o1, Candidato o2) {
         int resultado = this.comp1.compare(o1, o2);
         if (resultado == 0) 
             resultado = this.comp2.compare(o1, o2);
         return resultado;
    }
}
