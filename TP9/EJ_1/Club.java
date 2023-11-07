package TP9.EJ_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import TP9.EJ_1.Condiciones.Condicion;

public class Club {
    private ArrayList<Socio> socios;

    public Club() {
        this.socios = new ArrayList<>();
    }

    public void addSocio(Socio s) {
        this.socios.add(s);
    }

    public ArrayList<Socio> getSociosQueCumplenOrdenados(Condicion c, Comparator<Socio> orden) {
        ArrayList<Socio> resultado = new ArrayList<>();
        for (int i = 0; i < socios.size(); i++) {
            resultado.addAll(this.socios.get(i).getSociosQueCumplenOrdenados(c, orden));
        }
        if(orden!=null)
            Collections.sort(resultado, orden);
        else
            Collections.sort(resultado);
        return resultado;
    }
}
