package Examenes.Parcial2023;

import java.util.ArrayList;

import Examenes.Parcial2023.Condiciones.Condicion;

public class PiezaCompuesta extends Pieza {
    private int cantPLA;
    private int tiempoEstimado;
    private ArrayList<Pieza> piezas;

    public PiezaCompuesta(String nombre, String descripcion, int cantPLA, int tiempoEstimado) {
        super(nombre, descripcion);
        this.cantPLA = cantPLA;
        this.tiempoEstimado = tiempoEstimado;
        this.piezas = new ArrayList<>();
    }

    @Override
    public int getPla() {
        int plaHijos = 0;
        for (int i = 0; i < piezas.size(); i++) {
            plaHijos += piezas.get(i).getPla();
        }
        return plaHijos + cantPLA * this.getCantPiezas();
    }

    public void setCantPLA(int cantPLA) {

        this.cantPLA = cantPLA;
    }

    public int getTiempoEstimado() {
        int tiempoHijos = 0;
        for (int i = 0; i < piezas.size(); i++) {
            tiempoHijos += piezas.get(i).getPla();
        }
        return tiempoHijos + tiempoEstimado;
    }

    public void setTiempoEstimado(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public void addPieza(Pieza p) {
        this.piezas.add(p);
    }

    @Override
    public int getCantPiezas() {
        int cont = 0;
        for (int i = 0; i < piezas.size(); i++) {
            cont += this.piezas.get(i).getCantPiezas();
        }
        return cont;
    }

    @Override
    public ArrayList<String> getColores() {
        ArrayList<String> copia = new ArrayList<>();
        for (int i = 0; i < piezas.size(); i++) {
            ArrayList<String> aux = piezas.get(i).getColores();
            for (int j = 0; j < aux.size(); j++) {
                if (!copia.contains(aux.get(j)))
                    copia.add(aux.get(j));
            }
        }
        return copia;
    }

    public ArrayList<Pieza> buscar(Condicion c) {
        ArrayList<Pieza> lista = new ArrayList<>();
        for (int i = 0; i < this.piezas.size(); i++) {
            if (c.cumple(this.piezas.get(i))) {
                lista.add(this.piezas.get(i));
            }
        }
        return lista;
    }

}
