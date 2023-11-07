package Examenes.Parcial2023;

import java.util.ArrayList;

import Examenes.Parcial2023.Condiciones.Condicion;

public class PiezaSimple extends Pieza {
    private String color;
    private int tiempoEstimado;
    private int cantPLA;

    public PiezaSimple(String nombre, String descripcion, String color, int tiempoEstimado, int cantPLA) {
        super(nombre, descripcion);
        this.color = color;
        this.tiempoEstimado = tiempoEstimado;
        this.cantPLA = cantPLA;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    @Override
    public int getPla() {
        return cantPLA;
    }

    public void setCantPLA(int cantPLA) {
        this.cantPLA = cantPLA;
    }

    @Override
    public int getCantPiezas() {
        return 1;
    }

    @Override
    public ArrayList<Pieza> buscar(Condicion c) {
        ArrayList<Pieza> lista = new ArrayList<Pieza>();
        if (c.cumple(this)) {
            lista.add(this);
        }
        return lista;
    }

    @Override
    public ArrayList<String> getColores() {
        ArrayList<String> copia = new ArrayList<>();
        copia.add(color);
        return copia;
    }



}
