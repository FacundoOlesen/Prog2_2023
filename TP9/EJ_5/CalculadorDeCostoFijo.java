package TP9.EJ_5;

public class CalculadorDeCostoFijo extends CalculadorDeCosto {
    private double costoFijo;

    public CalculadorDeCostoFijo(double costoFijo) {
        this.costoFijo = costoFijo;
    }

    @Override
    public double calcularCosto() {
        return this.costoFijo;
    }
}
