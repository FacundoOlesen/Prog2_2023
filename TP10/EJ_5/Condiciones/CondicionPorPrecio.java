package TP10.EJ_5.Condiciones;
import TP10.EJ_5.Elemento;

public class CondicionPorPrecio extends Condicion {
    private double precio;

    public CondicionPorPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return elemento.getCostoEnvio() < precio;
    }

}

