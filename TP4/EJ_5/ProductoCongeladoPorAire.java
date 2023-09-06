package TP4.EJ_5;

import java.time.LocalDate;

public class ProductoCongeladoPorAire extends ProductoRoC {
    private double porcNitrogeno;
    private double porcOxigeno;
    private double porcDioxidoCarbono;
    private double porcVaporAgua;

    public ProductoCongeladoPorAire(String nombre, LocalDate fechaVencimiento, int nroLote, LocalDate fechaEnvasado,
            String granjaOrigen, int codigoOrganismo, double tempMantenimiento, double porcNitrogeno,
            double porcOxigeno, double porcDioxidoCarbono, double porcVaporAgua) {
        super(nombre, fechaVencimiento, nroLote, fechaEnvasado, granjaOrigen, codigoOrganismo, tempMantenimiento);
        this.porcNitrogeno = porcNitrogeno;
        this.porcOxigeno = porcOxigeno;
        this.porcDioxidoCarbono = porcDioxidoCarbono;
        this.porcVaporAgua = porcVaporAgua;
    }

    public double getPorcNitrogeno() {
        return porcNitrogeno;
    }

    public void setPorcNitrogeno(double porcNitrogeno) {
        this.porcNitrogeno = porcNitrogeno;
    }

    public double getPorcOxigeno() {
        return porcOxigeno;
    }

    public void setPorcOxigeno(double porcOxigeno) {
        this.porcOxigeno = porcOxigeno;
    }

    public double getPorcDioxidoCarbono() {
        return porcDioxidoCarbono;
    }

    public void setPorcDioxidoCarbono(double porcDioxidoCarbono) {
        this.porcDioxidoCarbono = porcDioxidoCarbono;
    }

    public double getPorcVaporAgua() {
        return porcVaporAgua;
    }

    public void setPorcVaporAgua(double porcVaporAgua) {
        this.porcVaporAgua = porcVaporAgua;
    }

    public String toString()
    {
        return super.toString() + 
                " % de Nitrogeno" + this.getPorcNitrogeno()+
                " % de Oxigeno" + this.getPorcOxigeno()+
                " % de Dioxido de Carbono" + this.getPorcDioxidoCarbono()+
                " % de Vapor Agua" + this.getPorcVaporAgua();
    }

}
