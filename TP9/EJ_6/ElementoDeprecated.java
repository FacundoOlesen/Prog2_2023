package TP9.EJ_6;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import TP9.EJ_6.Condiciones.Condicion;

public class ElementoDeprecated extends Elemento {
    private Elemento elemento;
    private double porcentaje;

    public ElementoDeprecated(int ID, int porcentaje) {
        super(ID);
        this.porcentaje=porcentaje;
    }

    @Override
    public LocalDate getAntiguedad() {
        return elemento.getAntiguedad();
    }

    @Override
    public double getValor() {
        double nuevoValor= elemento.getValor();
        //if(Period.between(getAntiguedad(), LocalDate.now().isNegative()))
            //  nuevoValor = nuevoValor * porcentaje/100; 
        
        return nuevoValor;
    }


    @Override
    public ArrayList<ElementoSimple> getElementosQueCumplenOrdenados(Condicion condicion, Comparator<Elemento> orden) {
       return elemento.getElementosQueCumplenOrdenados(condicion, orden);
    }
}
