package TP9.EJ_7;

import java.util.ArrayList;

import TP9.EJ_7.Condiciones.Condicion;

public class Producto extends Elemento {

    private ArrayList<String> categorias;
    private double peso;
    private double precio;
    private CalculadorDeCosto calculadorDeCosto;

    public Producto(double peso, double precio, CalculadorDeCosto calculadorDeCosto) {
        this.peso = peso;
        this.precio = precio;
        this.calculadorDeCosto = calculadorDeCosto;
        this.categorias = new ArrayList<>();
    }

    @Override
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public CalculadorDeCosto getCalculadorDeCosto() {
        return calculadorDeCosto;
    }

    public void setCalculadorDeCosto(CalculadorDeCosto calculadorDeCosto) {
        this.calculadorDeCosto = calculadorDeCosto;
    }

    @Override
    public double getCosto() {
        return calculadorDeCosto.calcularCosto(this);
    }

    public void addCategoria(String cat) {
        this.categorias.add(cat);
    }

    @Override
    public ArrayList<String> getCategorias() {
        return new ArrayList<>(categorias);
    }

    @Override
    public int getCantidadProductos() {
        return 1;
    }

    @Override
    public Producto getProductoMenorPeso() {
        return this;
    }

    @Override
    public ArrayList<Elemento> buscar(Condicion c) {
        ArrayList<Elemento> lista = new ArrayList<>();
        if (c.cumple(this))
            lista.add(this);
        return lista;
    }
}