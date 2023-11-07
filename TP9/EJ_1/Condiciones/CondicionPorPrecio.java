package TP9.EJ_1.Condiciones;
import TP9.EJ_1.Socio;

public class CondicionPorPrecio extends Condicion {
    private double precio;

    public CondicionPorPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.pagoMasDe(precio);
    }
}
