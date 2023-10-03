package TP7.EJ_4;

import java.util.ArrayList;


public class Tablero {
    private ArrayList<Ficha> fichas;
    private int puntajeSigNivel;
    private int dificultad;

    public Tablero(int puntajeSigNivel) {
        this.puntajeSigNivel = puntajeSigNivel;
        this.fichas = new ArrayList<>();
    }

    public int getPuntajeSigNivel() {
        return puntajeSigNivel;
    }

    public void setPuntajeSigNivel(int puntajeSigNivel) {
        this.puntajeSigNivel = puntajeSigNivel;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = calcularDificultadTablero();
    }

    public void addFicha(Ficha f) {
        if (!fichas.contains(f)) {
            this.fichas.add(f);
        }
    }
    
    public int calcularDificultadTablero() {
        int fortaleza = 0;
        int poderDestruccion = 0;
        for (int i = 0; i < fichas.size(); i++) {
            fortaleza += fichas.get(i).getFortaleza();
            poderDestruccion += fichas.get(i).getPoderDestruccion();
        }
        return fortaleza / poderDestruccion;
    }



    public ArrayList<Ficha> listarFichas(CondicionDeBusqueda c) {
        ArrayList<Ficha> lista = new ArrayList<>();
        for (int i = 0; i < this.fichas.size(); i++) {
            if (c.cumple(this.fichas.get(i))) {
                lista.add(this.fichas.get(i));
            }
        }
        return lista;
    }


}
