package TP9.EJ_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import TP9.EJ_5.Condiciones.Condicion;

public class SeguroIntegrador extends Elemento {
    private ArrayList<Elemento> elementos;

    public SeguroIntegrador(int dNIDuenio, int nroPoliza, String descripcion, double monto,
            CalculadorDeCosto calculador) {
        super(dNIDuenio, nroPoliza, descripcion, monto, calculador);
        this.elementos = new ArrayList<>();
    }

    public void addElemento(Elemento e) {
        this.elementos.add(e);
    }

    @Override
    public double calcularCosto() {
        double cont = 0;
        for (int i = 0; i < elementos.size(); i++) {
            cont += elementos.get(i).calcularCosto();
        }
        return cont;
    }

    @Override
    public ArrayList<Seguro> getSegurosQueCumplenOrdenados(Condicion c, Comparator<Elemento> orden) {
        ArrayList<Seguro> resultado = new ArrayList<>();
        for (int i = 0; i < elementos.size(); i++) {
            resultado.addAll(this.elementos.get(i).getSegurosQueCumplenOrdenados(c, orden));
        }
        if (orden != null)
            Collections.sort(resultado, orden);
        else
            Collections.sort(resultado);
        return resultado;
    }
}
