package TP9.EJ_7;

import java.util.ArrayList;

public class Combo extends Elemento {
    private ArrayList<Elemento> elementos;
    private int porcentaje;
    private int descuentoTope;

    public Combo(int porcentaje, int descuentoTope) {
        this.porcentaje = porcentaje;
        this.descuentoTope = descuentoTope;
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
        this.elementos.add(e);
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

}
