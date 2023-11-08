package TP9.EJ_6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import TP9.EJ_6.Condiciones.Condicion;

public class Combo extends Elemento {
    private ArrayList<Elemento> elementos;

    public Combo(int ID) {
        super(ID);
        this.elementos = new ArrayList<>();
    }

    public void addElemento(Elemento e) {
        this.elementos.add(e);
    }

    @Override
    public double getValor() {
        double cant = 0;
        for (int i = 0; i < elementos.size(); i++) {
            cant += elementos.get(i).getValor();
        }
        return cant;
    }

    @Override
    public LocalDate getAntiguedad() {
        LocalDate antiguedadMayor = null;
        for (int i = 0; i < elementos.size(); i++) {
            if (antiguedadMayor == null || elementos.get(i).getAntiguedad().isBefore(antiguedadMayor))
                antiguedadMayor = elementos.get(i).getAntiguedad();
        }
        return antiguedadMayor;
    }

    @Override
    public ArrayList<ElementoSimple> buscar(Condicion condicion, Comparator<Elemento> orden) {
        ArrayList<ElementoSimple> resultado = new ArrayList<>();
        for (int i = 0; i < elementos.size(); i++)
            resultado.addAll(this.elementos.get(i).buscar(condicion, orden));
        if (orden != null)
            Collections.sort(resultado, orden);
        else
            Collections.sort(resultado);
        return resultado;
    }
}
