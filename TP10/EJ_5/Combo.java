package TP10.EJ_5;

import java.time.LocalDate;
import java.util.ArrayList;

import TP10.EJ_5.Condiciones.Condicion;

public class Combo extends Elemento {
    private ArrayList<Elemento> elementos;
    private Condicion cond;

    public Combo(String iD, String destino, LocalDate fechaPartida, double costoEnvio, double valorAsegurado,
            Condicion cond) {
        super(iD, destino, fechaPartida, costoEnvio, valorAsegurado);
        this.cond = cond;
        this.elementos = new ArrayList<>();
    }

    public Condicion getCond() {
        return cond;
    }

    public void setCond(Condicion cond) {
        this.cond = cond;
    }

    public void addElemento(Elemento e) {
        if (cond.cumple(e))
            this.elementos.add(e);
    }

    public ArrayList<Elemento> getElementos(){
        return new ArrayList<>(this.elementos);
    }

    @Override
    public double getCostoEnvio() {
        double costo = 0;
        for (int i = 0; i < elementos.size(); i++) {
            costo += elementos.get(i).getCostoEnvio();
        }
        return costo;
    }

    @Override
    public double getValorAsegurado() {
        double valorAsegurado = 0;
        for (int i = 0; i < elementos.size(); i++) {
            valorAsegurado += elementos.get(i).getValorAsegurado();
        }
        return valorAsegurado;
    }

    @Override
    public int getCantPaquetes() {
        int cant = 0;
        for (int i = 0; i < elementos.size(); i++) {
            cant += elementos.get(i).getCantPaquetes();
        }
        return cant;
    }

    @Override
    public Elemento getCopia() {
        Combo copia = new Combo(this.getID(), this.getDestino(), this.getFechaPartida(), this.getCostoEnvio(), this.getValorAsegurado(), this.getCond());
        for(int i =0; i<elementos.size();i++)
            copia.addElemento(elementos.get(i));
        return copia;
    }

    @Override
    public Paquete getPaqueteMayorValorAsegurado() {
        Paquete mayor = elementos.get(0).getPaqueteMayorValorAsegurado();
        for (int i = 1; i < elementos.size(); i++) {
            if (elementos.get(i).getPaqueteMayorValorAsegurado().getValorAsegurado() > mayor
                    .getPaqueteMayorValorAsegurado().getValorAsegurado()) {
                mayor = elementos.get(i).getPaqueteMayorValorAsegurado();
            }
        }
        return mayor;
    }

    @Override
    public ArrayList<Elemento> buscar(Condicion c) {
        ArrayList<Elemento> resultado = new ArrayList<>();
        for (int i = 0; i < elementos.size(); i++)
            resultado.addAll(elementos.get(i).buscar(c));
        return resultado;
    }

}
