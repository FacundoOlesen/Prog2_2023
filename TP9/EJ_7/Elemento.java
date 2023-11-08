package TP9.EJ_7;

import java.util.ArrayList;

import TP9.EJ_7.Condiciones.Condicion;

public abstract class Elemento {

    public abstract double getPeso();
    public abstract double getPrecio();
    public abstract double getCosto();
    public abstract ArrayList<String> getCategorias();
    public abstract int getCantidadProductos();
    public abstract Producto getProductoMenorPeso();
    public abstract ArrayList<Elemento> buscar(Condicion c);
}
