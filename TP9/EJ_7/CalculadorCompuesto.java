package TP9.EJ_7;

public class CalculadorCompuesto extends CalculadorDeCosto {
    private CalculadorDeCosto calc1;
    private CalculadorDeCosto calc2;

    public CalculadorCompuesto(CalculadorDeCosto calc1, CalculadorDeCosto calc2) {
        this.calc1 = calc1;
        this.calc2 = calc2;
    }

    @Override
    public double calcularCosto(Producto producto) {
        return this.calc1.calcularCosto(producto) + this.calc2.calcularCosto(producto);
    }
}
