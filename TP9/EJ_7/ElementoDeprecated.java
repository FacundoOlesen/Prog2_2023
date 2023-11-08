package TP9.EJ_7;

import java.util.ArrayList;

import TP9.EJ_7.Condiciones.Condicion;

public class ElementoDeprecated extends Elemento {
    private Elemento elemento;

    public ElementoDeprecated(Elemento elemento) {
        this.elemento = elemento;
    }

    @Override
    public double getCosto() {
        double costo = elemento.getCosto();
        // if(fecha.isAfter(antiguedadPreestablecida))
        // costo = costo/2;
        return costo;
    }

    @Override
    public double getPeso() {
        return elemento.getPeso();
    }

    @Override
    public double getPrecio() {
        return elemento.getPrecio();
    }

    @Override
    public ArrayList<String> getCategorias() {
        return elemento.getCategorias();
    }

    @Override
    public int getCantidadProductos() {
        return 1;
    }

    @Override
    public Producto getProductoMenorPeso() {
        return elemento.getProductoMenorPeso();
    }

    @Override
    public ArrayList<Elemento> buscar(Condicion c) {
        return elemento.buscar(c);
    }
}
