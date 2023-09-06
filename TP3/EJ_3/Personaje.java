package TP3.EJ_3;

public class Personaje {
    private String nombreReal;
    private String nombreHeroe;
    private int visionNocturna;
    private int velocidad;
    private int fuerza;
    private double altura;
    private int edad;

    public Personaje(String nombreReal, String nombreHeroe, int visionNocturna, int velocidad, int fuerza,
            double altura, int edad) {
        this.nombreReal = nombreReal;
        this.nombreHeroe = nombreHeroe;
        this.visionNocturna = visionNocturna;
        this.velocidad = velocidad;
        this.fuerza = fuerza;
        this.altura = altura;
        this.edad = edad;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public String getNombreHeroe() {
        return nombreHeroe;
    }

    public void setNombreHeroe(String nombreHeroe) {
        this.nombreHeroe = nombreHeroe;
    }

    public int getVisionNocturna() {
        return visionNocturna;
    }

    public void setVisionNocturna(int visionNocturna) {
        this.visionNocturna = visionNocturna;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString() {
        return this.nombreHeroe;
    }

}
