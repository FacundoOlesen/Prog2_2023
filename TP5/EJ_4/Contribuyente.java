package TP5.EJ_4;

public class Contribuyente {
    private String nombre;
    private int idTributaria;
    private double montoFijo;

    public Contribuyente(String nombre, int idTributaria, double montoFijo) {
        this.nombre = nombre;
        this.idTributaria = idTributaria;
        this.montoFijo=montoFijo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdTributaria() {
        return idTributaria;
    }

    public void setIdTributaria(int idTributaria) {
        this.idTributaria = idTributaria;
    }

    public double getMontoFijo() {
        return montoFijo;
    }

    public void setMontoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    public double paga(){
       return this.getMontoFijo();
    }

}
