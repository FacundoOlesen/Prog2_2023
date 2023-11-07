package TP9.EJ_5;

public class CalculadorPorPorcentaje extends CalculadorDeCosto {
    private double porcentaje;
    private double montoAsegurado;

    public CalculadorPorPorcentaje(double porcentaje, double montoAsegurado) {
        this.porcentaje = porcentaje;
        this.montoAsegurado=montoAsegurado;
    }

    @Override
    public double calcularCosto() {
        return porcentaje*montoAsegurado/100;
    }

}
