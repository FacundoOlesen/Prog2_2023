package TP9.EJ_2;

public class Comprimido extends Carpeta {
    private double factorCompresion;
    
    public Comprimido(String nombre, double factorCompresion) {
        super(nombre);
        this.factorCompresion = factorCompresion;
    }

    @Override
    public double getTamanio() {
        return super.getTamanio() * factorCompresion;
    }
}
