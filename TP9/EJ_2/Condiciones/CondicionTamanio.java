package TP9.EJ_2.Condiciones;

import TP9.EJ_2.Archivo;

public class CondicionTamanio extends Condicion {

    private int tamanio;

    public CondicionTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public boolean cumple(Archivo archivo) {
        return archivo.getTamanio() < tamanio;
    }
}
