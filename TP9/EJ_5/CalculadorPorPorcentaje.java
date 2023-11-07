package TP9.EJ_5;

public class CalculadorPorPorcentaje extends CalculadorDeCosto {
    private double porcentaje;

    public CalculadorPorPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularCosto(Seguro seguro) {
        return porcentaje*seguro.getMonto()/100;
    }

}
