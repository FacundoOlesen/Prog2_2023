package TP9.EJ_7;

import java.util.ArrayList;

import TP9.EJ_7.Condiciones.Condicion;

public class Combo extends Elemento {
    private ArrayList<Elemento> elementos;
    private int porcentaje;
    private int descuentoTope;
    private Condicion cond;

    public Combo(int porcentaje, int descuentoTope, Condicion c) {
        this.porcentaje = porcentaje;
        this.descuentoTope = descuentoTope;
        this.cond=c;
        this.elementos = new ArrayList<>();
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getDescuentoTope() {
        return descuentoTope;
    }

    public void setDescuentoTope(int descuentoTope) {
        this.descuentoTope = descuentoTope;
    }

    public void addElementos(Elemento e) {
        if (cond.cumple(e))
            this.elementos.add(e);
    }

    public ArrayList<Elemento> getElementos() {
        return new ArrayList<>(this.elementos);
    }

    @Override
    public double getCosto() {
        double costo = 0;
        for (int i = 0; i < elementos.size(); i++) {
            costo += this.elementos.get(i).getCosto();
        }
        return costo;
    }

    @Override
    public double getPrecio() {
        double precio = 0;
        for (int i = 0; i < elementos.size(); i++) {
            if (porcentaje > descuentoTope)
                porcentaje = descuentoTope;
            else
                precio += elementos.get(i).getPrecio() * porcentaje / 100;
        }
        return precio;
    }

    @Override
    public double getPeso() {
        double peso = 0;
        for (int i = 0; i < elementos.size(); i++)
            peso += elementos.get(i).getPeso();
        return peso;
    }

    @Override
    public ArrayList<String> getCategorias() {
        ArrayList<String> categoriasConcatenadas = new ArrayList<>();
        for (int i = 0; i < elementos.size(); i++) {
            for (int j = 0; j < elementos.get(i).getCategorias().size(); j++)
                if (!categoriasConcatenadas.contains(elementos.get(i).getCategorias().get(j)))
                    categoriasConcatenadas.addAll(elementos.get(i).getCategorias());
        }
        return categoriasConcatenadas;
    }

    @Override
    public int getCantidadProductos() {
        int cant = 0;
        for (int i = 0; i < elementos.size(); i++) {
            cant += this.elementos.get(i).getCantidadProductos();
        }
        return cant;
    }

    public Producto getProductoMenorPeso() {
        if (elementos.size() > 0) {
            Producto prodMenor = elementos.get(0).getProductoMenorPeso();
            for (int i = 1; i < elementos.size(); i++) {
                if (elementos.get(i).getPeso() < prodMenor.getPeso()) {
                    prodMenor = elementos.get(i).getProductoMenorPeso();
                }
            }
            return prodMenor;
        }
        return null;
    }

    @Override
    public ArrayList<Elemento> buscar(Condicion c) {
        ArrayList<Elemento> lista = new ArrayList<>();
        for (int i = 0; i < elementos.size(); i++) {
            lista.addAll(this.elementos.get(i).buscar(c));
        }
        return lista;
    }

}
