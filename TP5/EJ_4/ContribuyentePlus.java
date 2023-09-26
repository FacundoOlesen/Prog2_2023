package TP5.EJ_4;

public class ContribuyentePlus extends Contribuyente {

    private double montoFacturado;
    private double porcentajeMontoFijo;
    private double porcentajeValorFacturado;

    public ContribuyentePlus(String nombre, int idTributaria, double montoFijo, double montoFacturado,
            double porcentajeMontoFijo, double porcentajeValorFacturado) {
        super(nombre, idTributaria, montoFijo);
        this.montoFacturado = montoFacturado;
        this.porcentajeMontoFijo = porcentajeMontoFijo;
        this.porcentajeValorFacturado = porcentajeValorFacturado;
    }

    public double getMontoFacturado() {
        return montoFacturado;
    }

    public void setMontoFacturado(double montoFacturado) {
        this.montoFacturado = montoFacturado;
    }

    public double getPorcentajeMontoFijo() {
        return porcentajeMontoFijo;
    }

    public void setPorcentajeMontoFijo(double porcentajeMontoFijo) {
        this.porcentajeMontoFijo = porcentajeMontoFijo;
    }

    public double getPorcentajeValorFacturado() {
        return porcentajeValorFacturado;
    }

    public void setPorcentajeValorFacturado(double porcentajeValorFacturado) {
        this.porcentajeValorFacturado = porcentajeValorFacturado;
    }

    @Override
    public double paga() {
        return super.paga() / porcentajeMontoFijo + (montoFacturado * porcentajeValorFacturado / 100);
    }

}
