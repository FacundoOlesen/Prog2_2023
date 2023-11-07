package TP9.EJ_5;

import java.util.ArrayList;
import java.util.Comparator;

import TP9.EJ_5.Condiciones.Condicion;

public class Seguro extends Elemento {
    public Seguro(int dNIDuenio, int nroPoliza, String descripcion, double monto,
            CalculadorDeCosto calculador) {
        super(dNIDuenio, nroPoliza, descripcion, monto, calculador);
    }

    @Override
    public double calcularCosto() {
        return super.getCalculador().calcularCosto();
    }

    @Override
    public ArrayList<Seguro> getSegurosQueCumplenOrdenados(Condicion c, Comparator<Elemento> orden) {
        ArrayList<Seguro> resultado = new ArrayList<>();
        if (c.cumple(this)) {
            resultado.add(this);
        }
        return resultado;
    }
}
