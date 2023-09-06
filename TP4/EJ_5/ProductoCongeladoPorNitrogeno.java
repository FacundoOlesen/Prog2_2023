package TP4.EJ_5;

import java.time.LocalDate;

public class ProductoCongeladoPorNitrogeno extends ProductoRoC {
    private String metodoCongelacion;
    private double tiempoExposicion;

    public ProductoCongeladoPorNitrogeno(String nombre, LocalDate fechaVencimiento, int nroLote,
            LocalDate fechaEnvasado,
            String granjaOrigen, int codigoOrganismo, double tempMantenimiento,
            String metodoCongelacion, double tiempoExposicion) {

        super(nombre, fechaVencimiento, nroLote, fechaEnvasado, granjaOrigen, codigoOrganismo, tempMantenimiento);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExposicion = tiempoExposicion;
    }

    public String getMetodoCongelacion() {
        return metodoCongelacion;
    }

    public void setMetodoCongelacion(String metodoCongelacion) {
        this.metodoCongelacion = metodoCongelacion;
    }

    public double getTiempoExposicion() {
        return tiempoExposicion;
    }

    public void setTiempoExposicion(double tiempoExposicion) {
        this.tiempoExposicion = tiempoExposicion;
    }

    public String toString() {
        return super.toString() +
                " Método de congelación: " + this.getMetodoCongelacion() +
                "Tiempo de Exposición " + this.getTiempoExposicion();
    }
}
