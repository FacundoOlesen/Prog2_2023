package TP9.EJ_7.Condiciones;
import TP9.EJ_7.Elemento;

public class CondicionPorPrecio extends Condicion{
    private double precio;

    public CondicionPorPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return elemento.getPrecio()<precio;
    }

    
}
