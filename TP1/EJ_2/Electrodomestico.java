package TP1.EJ_2;

public class Electrodomestico {
    private String nombre;
    private double precioBase;
    private String color;
    private double consumoEnergetico;
    private double peso;

    public Electrodomestico() {
        this.color = "gris plata";
        this.consumoEnergetico = 10;
        this.precioBase = 100;
        this.peso = 2;
    }

    public Electrodomestico(String nombre, double precioBase, String color, double consumoEnergetico, double peso) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(double consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    
    public boolean esBajoConsumo(){
        return consumoEnergetico<45;
    }

    public double balance(){
        return this.getPrecioBase()/this.getPeso();
    }

    public boolean esAltaGama(){
        return this.getPrecioBase()/this.getPeso() >3;
    }



}
