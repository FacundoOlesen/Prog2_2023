package TP9.EJ_7;

public class CalculadorDeCostoFijo extends CalculadorDeCosto {
    private double costoFijo;

    public CalculadorDeCostoFijo(double costoFijo) {
        this.costoFijo = costoFijo;
    }

    @Override
    public double calcularCosto(Producto producto) {
        return this.costoFijo;
    }

}
