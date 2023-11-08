package TP9.EJ_7;


public class CalculadorPorPorcentaje extends CalculadorDeCosto {
    private double porcentaje;

    public CalculadorPorPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double calcularCosto(Producto producto) {
        return porcentaje*(producto.getPrecio()/100);
    }
}
