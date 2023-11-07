package TP9.EJ_2.Condiciones;

import TP9.EJ_2.Archivo;

public class CondicionNombre extends Condicion {
    private String nombre;

    public CondicionNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean cumple(Archivo archivo) {
        return archivo.getNombre().contains(nombre);
    }
}
