package TP4.EJ_5;

import java.time.LocalDate;

public class ProductoCongeladoPorAgua extends ProductoRoC {
    private double salinidadAgua;

    public ProductoCongeladoPorAgua(String nombre, LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado,
            String granjaOrigen, int codigoOrganismo, double tempMantenimiento, double salinidadAgua) {
        super(nombre, fechaVencimiento, nroLote, fechaEnvasado, granjaOrigen, codigoOrganismo, tempMantenimiento);
    }

    public double getSalinidadAgua() {
        return salinidadAgua;
    }

    public void setSalinidadAgua(double salinidadAgua) {
        this.salinidadAgua = salinidadAgua;
    }

    public String toString() {
        return super.toString() +
                " Salinidad del agua" + this.getSalinidadAgua();
    }
}